package Tablas;

import Planilla.PlanillaPago;
import Registros.RegistroAsistencia;
import Usuarios.Empleado;
import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaAsistencia {

    private ArrayList<RegistroAsistencia> registrosAsistencia;
    private Conexion conexion = new Conexion();
    private Connection conn;
    private PreparedStatement mostrarRegistros;
    private PreparedStatement insertarRegistros;
    private PreparedStatement modificarRegistros;
    private PreparedStatement eliminarRegistros;
    private PlanillaPago planillaPago;

    public TablaAsistencia(PlanillaPago planilla){
        this.planillaPago = planilla;
        this.conn = this.conexion.obtenerConexion();
        try {
            this.mostrarRegistros = this.conn.prepareStatement("SELECT * FROM Asistencias");
            this.insertarRegistros = this.conn.prepareStatement("INSERT INTO " +
                    "Asistencias(asistencia, fecha, idEmpleado) " +
                    "VALUES(?, ?, ?)");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Actualiza/carga los registros en memoria
     */
    public void actualizarRegistros() {
        ArrayList<RegistroAsistencia> result = new ArrayList<>();
        ResultSet rs;

        try {
            rs = this.mostrarRegistros.executeQuery();

            while (rs.next()) {
                int idEmpleado = rs.getInt("idEmpleado");
                Empleado empleado = this.planillaPago.getTablaEmpleados().buscarEmpleado(idEmpleado);
                RegistroAsistencia nuevoAdelanto = new RegistroAsistencia(
                    rs.getInt("num"),
                    rs.getInt("asistencia"),
                    rs.getTimestamp("fecha")
                    );
                nuevoAdelanto.setEmpleado(empleado);
                result.add(nuevoAdelanto);
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.registrosAsistencia = result;
    }

    /**
     * Añade un registro en memoria y en la base de datos
     * Tipo de registro: Asistencia
     * @param asistencia 1: Entrada, 2: Salida
     * @param fecha La fecha/tiempo de entrada o salida
     * @param empleado El empleado que asiste
     */
    public boolean añadirRegistro(int asistencia, Date fecha, Empleado empleado){
        java.sql.Timestamp sqlDate = new java.sql.Timestamp(fecha.getTime());

        try {
            this.insertarRegistros.setInt(1, asistencia);
            this.insertarRegistros.setTimestamp(2, sqlDate);
            this.insertarRegistros.setInt(3, empleado.getId());
            this.insertarRegistros.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        this.actualizarRegistros();
        return true;
    }

    /**
     * Obtiene la tabla en un ArrayList
     */
    public ArrayList<RegistroAsistencia> getTabla(){
        return registrosAsistencia;
    }

    public static void main(String[] argv) {
        PlanillaPago planilla = new PlanillaPago();
        TablaAsistencia tabla = new TablaAsistencia(planilla);
        tabla.actualizarRegistros();
        System.out.println(tabla.getTabla());

        planilla.getTablaEmpleados().actualizarRegistros();

        Empleado empleado = planilla.getTablaEmpleados().buscarEmpleado(356);

        Date today = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(df.format(today));

        tabla.añadirRegistro(1, today, empleado);
        System.out.println(tabla.getTabla());
    }
}//end TablaAsistencia
