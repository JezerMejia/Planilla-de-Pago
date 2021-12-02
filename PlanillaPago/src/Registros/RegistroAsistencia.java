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
public class RegistroAsistencia {

    private int num;
    private int asistencia;
    private Date fecha;
    private Empleado empleado;

    public RegistroAsistencia(int num, int asistencia, Date fecha){
        this.num = num;
        this.asistencia = asistencia;
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the asistencia
     */
    public int getAsistencia() {
        return asistencia;
    }

    /**
     * @param asistencia the asistencia to set
     */
    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
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

    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return "{ " +
            "num: " + this.num + ", " +
            "fecha: \"" + df.format(this.fecha) + "\", " +
            "asistencia: " + this.asistencia + ", " +
            "idEmpleado: " + this.empleado.getId() +
            " }";
    }
}//end RegistroAsistencia
