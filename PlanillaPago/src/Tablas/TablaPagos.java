package Tablas;

import Planilla.PlanillaPago;
import Registros.RegistroPago;
import Usuarios.Empleado;
import Conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaPagos {

    private ArrayList<RegistroPago> registrosPago;
    private Conexion conexion = new Conexion();
    private Connection conn;
    private PreparedStatement mostrarRegistros;
    private PreparedStatement insertarRegistros;
    private PreparedStatement modificarRegistros;
    private PreparedStatement eliminarRegistros;
    private PlanillaPago planillaPago;

    public TablaPagos(PlanillaPago planilla){
        this.planillaPago = planilla;
        this.conn = this.conexion.obtenerConexion();
        try {
            this.mostrarRegistros = this.conn.prepareStatement("SELECT * FROM Pagos");
            this.insertarRegistros = this.conn.prepareStatement("INSERT INTO " +
                    "Pagos(monto, fecha, idEmpleado) " +
                    "VALUES(?, ?, ?)");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void actualizarRegistros() {
        ArrayList<RegistroPago> result = new ArrayList<>();
        ResultSet rs;

        try {
            rs = this.mostrarRegistros.executeQuery();

            while (rs.next()) {
                int idEmpleado = rs.getInt("idEmpleado");
                Empleado empleado = this.planillaPago.getTablaEmpleados().buscarEmpleado(idEmpleado);
                RegistroPago nuevoAdelanto = new RegistroPago(
                    rs.getInt("num"),
                    rs.getFloat("monto"),
                    rs.getTimestamp("fecha")
                    );
                nuevoAdelanto.setEmpleado(empleado);
                result.add(nuevoAdelanto);
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.registrosPago = result;
    }

    /**
     * Añade un registro en memoria y en la base de datos
     * Tipo de registro: Pago
     * @param monto Monto pagado
     * @param fecha La fecha al momento de realizar el pago
     * @param empleado El epleado al que se le realiza el pago
     */
    public boolean añadirRegistro(float monto, Date fecha, Empleado empleado){
        java.sql.Timestamp sqlDate = new java.sql.Timestamp(fecha.getTime());
        System.out.println(sqlDate);

        try {
            this.insertarRegistros.setFloat(1, monto);
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
    public ArrayList<RegistroPago> getTabla(){
        return registrosPago;
    }

    public static void main(String[] argv) {
        PlanillaPago planilla = new PlanillaPago();
        TablaPagos tabla = new TablaPagos(planilla);
        tabla.actualizarRegistros();
        System.out.println(tabla.getTabla());

        planilla.getTablaEmpleados().actualizarRegistros();

        Empleado empleado = planilla.getTablaEmpleados().buscarEmpleado(356);

        java.util.Date today = java.util.Calendar.getInstance().getTime();
        java.text.DateFormat df = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(df.format(today));

        tabla.añadirRegistro(509f, today, empleado);
        System.out.println(tabla.getTabla());
    }
}//end TablaPagos
