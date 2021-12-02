package Usuarios;

import Planilla.PlanillaPago;
import Registros.RegistroAdelanto;
import Registros.RegistroAsistencia;
import Registros.RegistroPago;


/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class Empleado {

    protected String apellido;
    protected String cargo;
    protected String contraseña;
    protected Integer id;
    protected String nombre;
    protected Integer privilegios = 0;
    protected PlanillaPago planillaPago;

    public Empleado(Integer id, String nombre, String apellido, String cargo, String contraseña, PlanillaPago m_PlanillaPago) {
        this.apellido = apellido;
        this.cargo = cargo;
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.planillaPago = m_PlanillaPago;
    }
    public Empleado(Integer id, String nombre, String apellido, String cargo, String contraseña) {
        this.apellido = apellido;
        this.cargo = cargo;
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public Empleado(){
    }

    /**
     * Se registra la debida asistencia del empleado
     * @param empleado El empleado a registrar su asistencia
     */
    public boolean registrarAsistencia(){
        return this.planillaPago.registrarAsistencia(this);
    }

    /**
     * Solicita el adelanto de un empleado
     * @param empleado El empleado que solicita el adelanto
     * @param adelanto El monto
     * @param justificacion La justificación de tal adelanto
     */
    public boolean solicitarAdelanto(Float adelanto, String justificacion){
        return this.planillaPago.solicitarAdelanto(this, adelanto, justificacion);
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    public String toString() {
        return "{ " +
            "id: " + this.id + ", " +
            "nombre: \"" + this.nombre + "\", " +
            "apellido: \"" + this.apellido + "\", " +
            "cargo: \"" + this.cargo + "\", " +
            "privilegios: " + this.privilegios +
            " }";
    }
}//end Empleado
