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
public class RegistroPago {

    private int num;
    private Date fecha;
    private Float monto;
    private Empleado empleado;

    public RegistroPago(int num, Float monto, Date fecha){
        this.num = num;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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
     * @return the monto
     */
    public Float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "{ " +
            "num: " + this.num + ", " +
            "fecha: \"" + df.format(this.fecha) + "\", " +
            "monto: " + this.monto +
            " }";
    }
}//end RegistroPago
