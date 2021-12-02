package Usuarios;

import Planilla.PlanillaPago;


/**
 * @author jezer
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class Administrador extends Empleado {

    protected Integer privilegios = 1;

    public Administrador(Integer id, String nombre, String apellido, String cargo, String contraseña) {
        super(id, nombre, apellido, cargo, contraseña);
    }

    public Administrador(){

    }

    /**
     * Se acepta el adelanto de un empleado
     * @param aceptado El valor del adelanto, ya sea aceptado o rechazado
     * @param num El número del registro
     */
    public boolean aceptarAdelanto(int aceptado, int numRegistro){
        return this.planillaPago.aceptarAdelanto(aceptado, numRegistro);
    }

    /**
     * Se realiza el debido pago del empleado
     * @param empleado El empleado al cual pagar según sus horas
     */
    public boolean realizarPago(Empleado empleado){
        return this.planillaPago.realizarPago(empleado);
    }

    /**
     * Se crea un empleado con privilegios 0
     * @param id El ID del empleado
     * @param nombre El nombre
     * @param apellido Su apellido
     * @param cargo Su cargo en la empresa
     * @param contraseña Su contraseña de accesso
     */
    public boolean crearEmpleado(Integer id, String nombre, String apellido, String cargo, String contraseña) {
        return this.planillaPago.crearEmpleado(id, nombre, apellido, cargo, contraseña);
    }

    /**
     * Se edita el empleado según su ID
     * @param id El ID del empleado
     * @param nombre El nombre
     * @param apellido Su apellido
     * @param cargo Su cargo en la empresa
     * @param contraseña Su contraseña de accesso
     * @param privilegios Sus privilegios. 0: empleado, 1: administrador
     */
    public boolean editarEmpleado(Integer id, String nombre, String apellido, String cargo, String contraseña, Integer privilegios) {
        return this.planillaPago.editarEmpleado(id, nombre, apellido, cargo, contraseña, privilegios);
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
    public PlanillaPago getPlanillaPago() {
        return planillaPago;
    }

    /**
     * @param m_PlanillaPago the m_PlanillaPago to set
     */
    public void setPlanillaPago(PlanillaPago m_PlanillaPago) {
        this.planillaPago = m_PlanillaPago;
    }
}//end Administrador
