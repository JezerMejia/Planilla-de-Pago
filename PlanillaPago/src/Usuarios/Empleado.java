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
    protected Integer id;
    protected String nombre;
    protected Integer privilegios = 0;
    protected PlanillaPago m_PlanillaPago;

    public Empleado(Integer id, String nombre, String apellido, String cargo, PlanillaPago m_PlanillaPago) {
        this.apellido = apellido;
        this.cargo = cargo;
        this.id = id;
        this.nombre = nombre;
        this.m_PlanillaPago = m_PlanillaPago;
    }

    public Empleado(){
    }

    /**
     * Se registra la asistencia con el input
     * del empleado
     */
    public void registrarAsistencia(){
    }

    /**
     * Se obtiene el input y se solicita el adelanto
     * con la Planilla de Pago
     */
    public void solicitarAdelanto(){
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
}//end Empleado
