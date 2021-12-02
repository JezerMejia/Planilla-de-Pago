package Registros;

import Planilla.PlanillaPago;
import Usuarios.Empleado;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class RegistroAdelanto {

    private int num;
    private int aceptado;
    private float adelanto;
    private Date fecha;
    private String justificacion;
    private Empleado empleado;

    public RegistroAdelanto(int num, int aceptado, float adelanto, Date fecha, String justificacion){
        this.num = num;
        this.aceptado = aceptado;
        this.adelanto = adelanto;
        this.fecha = fecha;
        this.justificacion = justificacion;
    }

    /**
     * @return the aceptado
     */
    public int getAceptado() {
        return aceptado;
    }

    /**
     * @param aceptado the aceptado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the aceptado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param aceptado the aceptado to set
     */
    public void setAceptado(int aceptado) {
        this.aceptado = aceptado;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param aceptado the aceptado to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the adelanto
     */
    public float getAdelanto() {
        return adelanto;
    }

    /**
     * @param adelanto the adelanto to set
     */
    public void setAdelanto(float adelanto) {
        this.adelanto = adelanto;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the justificacion
     */
    public String getJustificacion() {
        return justificacion;
    }

    /**
     * @param justificacion the justificacion to set
     */
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return "{ " +
            "num: " + this.num + ", " +
            "aceptado: " + this.aceptado + ", " +
            "adelanto: " + this.adelanto + ", " +
            "justificacion: \"" + this.justificacion + "\", " +
            "fecha: \"" + df.format(this.fecha) + "\", " +
            "idEmpleado: " + this.empleado.getId() +
            " }";
    }
}//end RegistroAdelanto
