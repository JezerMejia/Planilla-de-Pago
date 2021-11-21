package Usuarios;

import Planilla.PlanillaPago;


/**
 * @author jezer
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class Administrador extends Empleado {

	private Integer privilegios = 1;
	private PlanillaPago m_PlanillaPago;
        
        
	public Administrador(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public void aceptarAdelanto(){

	}

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