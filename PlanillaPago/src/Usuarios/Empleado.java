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

	private String apellido;
	private String cargo;
	private Integer id;
	private String nombre;
	private Integer privilegios = 0;
	private RegistroPago m_RegistroPago;
	private RegistroAdelanto m_RegistroAdelanto;
	private RegistroAsistencia m_RegistroAsistencia;
	private PlanillaPago m_PlanillaPago;

    public Empleado(String apellido, String cargo, Integer id, String nombre, RegistroPago m_RegistroPago, RegistroAdelanto m_RegistroAdelanto, RegistroAsistencia m_RegistroAsistencia, PlanillaPago m_PlanillaPago) {
        this.apellido = apellido;
        this.cargo = cargo;
        this.id = id;
        this.nombre = nombre;
        this.m_RegistroPago = m_RegistroPago;
        this.m_RegistroAdelanto = m_RegistroAdelanto;
        this.m_RegistroAsistencia = m_RegistroAsistencia;
        this.m_PlanillaPago = m_PlanillaPago;
    }
        
	public Empleado(){
            
	}

	public void finalize() throws Throwable {

	}
	public void registrarAsistencia(){

	}

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
     * @return the m_RegistroPago
     */
    public RegistroPago getM_RegistroPago() {
        return m_RegistroPago;
    }

    /**
     * @param m_RegistroPago the m_RegistroPago to set
     */
    public void setM_RegistroPago(RegistroPago m_RegistroPago) {
        this.m_RegistroPago = m_RegistroPago;
    }

    /**
     * @return the m_RegistroAdelanto
     */
    public RegistroAdelanto getM_RegistroAdelanto() {
        return m_RegistroAdelanto;
    }

    /**
     * @param m_RegistroAdelanto the m_RegistroAdelanto to set
     */
    public void setM_RegistroAdelanto(RegistroAdelanto m_RegistroAdelanto) {
        this.m_RegistroAdelanto = m_RegistroAdelanto;
    }

    /**
     * @return the m_RegistroAsistencia
     */
    public RegistroAsistencia getM_RegistroAsistencia() {
        return m_RegistroAsistencia;
    }

    /**
     * @param m_RegistroAsistencia the m_RegistroAsistencia to set
     */
    public void setM_RegistroAsistencia(RegistroAsistencia m_RegistroAsistencia) {
        this.m_RegistroAsistencia = m_RegistroAsistencia;
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