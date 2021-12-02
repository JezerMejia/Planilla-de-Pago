package Tablas;

import Planilla.PlanillaPago;
import Registros.RegistroAdelanto;
import Usuarios.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import Conexion.Conexion;


/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaAdelantos {

    private ArrayList<RegistroAdelanto> registrosAdelanto = new ArrayList<>();
    private Conexion conexion = new Conexion();
    private Connection conn;
    private PreparedStatement mostrarRegistros;
    private PreparedStatement insertarRegistros;
    private PreparedStatement modificarRegistros;
    private PreparedStatement eliminarRegistros;
    private PlanillaPago planillaPago;

    public TablaAdelantos(PlanillaPago planilla) {
        this.planillaPago = planilla;
        this.conn = this.conexion.obtenerConexion();
        try {
            this.mostrarRegistros = this.conn.prepareStatement("SELECT * FROM Adelantos");
            this.insertarRegistros = this.conn.prepareStatement("INSERT INTO " +
                    "Adelantos(aceptado, adelanto, fecha, justificación, idEmpleado) " +
                    "VALUES(?, ?, ?, ?, ?)");
            this.modificarRegistros = this.conn.prepareStatement("UPDATE Adelantos SET " +
                    "aceptado=? " + "WHERE num=?");
            this.eliminarRegistros = this.conn.prepareStatement("DELETE FROM Adelantos WHERE num=?");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void actualizarRegistros() {
        ArrayList<RegistroAdelanto> result = new ArrayList<>();
        ResultSet rs;

        try {
            rs = this.mostrarRegistros.executeQuery();

            while (rs.next()) {
                int idEmpleado = rs.getInt("idEmpleado");
                Empleado empleado = this.planillaPago.getTablaEmpleados().buscarEmpleado(idEmpleado);
                RegistroAdelanto nuevoAdelanto = new RegistroAdelanto(
                    rs.getInt("num"),
                    rs.getInt("aceptado"),
                    rs.getFloat("adelanto"),
                    rs.getTimestamp("fecha"),
                    rs.getString("justificación")
                    );
                nuevoAdelanto.setEmpleado(empleado);
                result.add(nuevoAdelanto);
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.registrosAdelanto = result;
    }

    public boolean añadirRegistro(float adelanto, Date fecha, String justificacion, Empleado empleado) {
        java.sql.Timestamp sqlDate = new java.sql.Timestamp(fecha.getTime());

        try {
            this.insertarRegistros.setInt(1, 0);
            this.insertarRegistros.setFloat(2, adelanto);
            this.insertarRegistros.setTimestamp(3, sqlDate);
            this.insertarRegistros.setString(4, justificacion);
            this.insertarRegistros.setInt(5, empleado.getId());
            this.insertarRegistros.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        this.actualizarRegistros();
        return true;
    }

    /**
     * Nothing
     */
    public boolean editarRegistro(int num, int aceptado){
        RegistroAdelanto registro = null;

        for (int i = 0; i < this.registrosAdelanto.size(); i++) {
            if (this.registrosAdelanto.get(i).getNum() == num) {
                registro = this.registrosAdelanto.get(i);
                break;
            }
        }

        if (registro == null) return false;

        try {
            this.modificarRegistros.setInt(1, aceptado);
            this.modificarRegistros.setInt(2, num);
            this.modificarRegistros.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        this.actualizarRegistros();

        return true;
    }

    public ArrayList<RegistroAdelanto> getTabla(){
        return registrosAdelanto;
    }

    public static void main(String[] argv) {
        PlanillaPago planilla = new PlanillaPago();
        TablaAdelantos tabla = new TablaAdelantos(planilla);
        tabla.actualizarRegistros();
        System.out.println(tabla.getTabla());

        planilla.getTablaEmpleados().actualizarRegistros();

        Empleado empleado = planilla.getTablaEmpleados().buscarEmpleado(356);

        tabla.editarRegistro(2, 1);
        System.out.println(tabla.getTabla());
    }
}//end TablaAdelantos
