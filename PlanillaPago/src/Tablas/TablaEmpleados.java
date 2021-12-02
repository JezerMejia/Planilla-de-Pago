package Tablas;

import Planilla.PlanillaPago;
import Usuarios.Empleado;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 * @author jezer
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaEmpleados {

    private ArrayList<Empleado> empleados = new ArrayList<>();
    private final Conexion conexion = new Conexion();
    private Connection conn;
    private PreparedStatement mostrarRegistros;
    private PreparedStatement insertarRegistros;
    private PreparedStatement modificarRegistros;
    private PreparedStatement eliminarRegistros;
    private PlanillaPago planillaPago;

    public TablaEmpleados(PlanillaPago planilla) {
        this.planillaPago = planilla;
        this.conn = this.conexion.obtenerConexion();
        try {
            this.mostrarRegistros = this.conn.prepareStatement("SELECT * FROM Empleados");
            this.insertarRegistros = this.conn.prepareStatement("INSERT INTO " +
                    "Empleados(id, nombre, apellido, privilegios, cargo, contraseña) " +
                    "VALUES(?, ?, ?, ?, ?, ?)");
            this.modificarRegistros = this.conn.prepareStatement("UPDATE Empleados SET " +
                    "id=?, nombre=?, apellido=?, privilegios=?, cargo=?, contraseña=? " +
                    "WHERE id=?");
            this.eliminarRegistros = this.conn.prepareStatement("DELETE FROM Empleados WHERE id=?");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.actualizarRegistros();
    }

    public void actualizarRegistros() {
        ArrayList<Empleado> result = new ArrayList<>();
        ResultSet rs;

        try {
            rs = this.mostrarRegistros.executeQuery();

            while (rs.next()) {
                Empleado nuevoEmpleado = new Empleado(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("cargo"),
                    rs.getString("contraseña"),
                    rs.getInt("privilegios")
                    );
                result.add(nuevoEmpleado);
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.empleados = result;
    }

    public boolean añadirEmpleado(int id, String nombre, String apellido, String cargo, String contraseña) {
        Empleado nuevoEmpleado = new Empleado(id, nombre, apellido, cargo, contraseña, 0);

        try {
            this.insertarRegistros.setInt(1, id);
            this.insertarRegistros.setString(2, nombre);
            this.insertarRegistros.setString(3, apellido);
            this.insertarRegistros.setInt(4, 0);
            this.insertarRegistros.setString(5, cargo);
            this.insertarRegistros.setString(6, contraseña);
            this.insertarRegistros.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        this.empleados.add(nuevoEmpleado);
        return true;
    }

    public boolean editarEmpleado(int id, String nombre, String apellido, String cargo, String contraseña, int privilegios) {
        Empleado empleado = null;

        for (int i = 0; i < this.empleados.size(); i++) {
            if (this.empleados.get(i).getId() == id) {
                empleado = this.empleados.get(i);
            }
        }

        if (empleado == null) return false;

        try {
            this.modificarRegistros.setInt(1, id);
            this.modificarRegistros.setString(2, nombre);
            this.modificarRegistros.setString(3, apellido);
            this.modificarRegistros.setInt(4, privilegios);
            this.modificarRegistros.setString(5, cargo);
            this.modificarRegistros.setString(6, contraseña);
            this.modificarRegistros.setInt(7, id);
            this.modificarRegistros.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCargo(cargo);
        empleado.setContraseña(contraseña);
        empleado.setPrivilegios(privilegios);
        return true;
    }

    public boolean eliminarEmpleado(int id) {
        int index = -1;
        for (int i = 0; i < this.empleados.size(); i++) {
            if (this.empleados.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;

        try {
            this.eliminarRegistros.setInt(1, id);
            this.eliminarRegistros.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        this.empleados.remove(id);
        return true;
    }
    
    public Empleado buscarEmpleado(int id) {
        for (Empleado e : this.empleados) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }

    public ArrayList<Empleado> getTabla(){
        return empleados;
    }

    public static void main(String[] argv) {
        PlanillaPago planilla = new PlanillaPago();
        TablaEmpleados tablaEmpleados = new TablaEmpleados(planilla);
        tablaEmpleados.actualizarRegistros();
        System.out.println(tablaEmpleados.getTabla());
    }
}//end TablaEmpleados
