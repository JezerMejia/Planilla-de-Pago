package Usuarios;

import Planilla.PlanillaPago;


/**
 * @author jezer
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class Administrador extends Empleado {

    protected Integer privilegios = 1;

    public Administrador(Integer id, String nombre, String apellido, String cargo, PlanillaPago m_PlanillaPago) {
        super(id, nombre, apellido, cargo, m_PlanillaPago);
    }

    public Administrador(){

    }

    /**
     * Se acepta el adelanto de un empleado
     */
    public void aceptarAdelanto(){

    }

    /**
     * Se realiza el debido pago del empleado
     */
    public void realizarPago(){

    }

    /**
     * @return the privilegios
     */
    public Integer getPrivilegios() {
        return privilegios;
    }

    /**
     * @param privilegios the privilegios to set
     */
    public void setPrivilegios(Integer privilegios) {
        this.privilegios = privilegios;
    }

    /**
     * @return the m_PlanillaPago
     */
    public PlanillaPago getM_PlanillaPago() {
        return m_PlanillaPago;
    }

    /**
     * @param m_PlanillaPago the m_PlanillaPago to set
     */
    public void setM_PlanillaPago(PlanillaPago m_PlanillaPago) {
        this.m_PlanillaPago = m_PlanillaPago;
    }
}//end Administrador
