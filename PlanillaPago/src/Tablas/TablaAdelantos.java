package Tablas;

import Planilla.PlanillaPago;
import Registros.RegistroAdelanto;
import java.util.ArrayList;


/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaAdelantos {

	private PlanillaPago m_PlanillaPago;

	public TablaAdelantos(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param registro
	 */
	public void actualizarRegistro(RegistroAdelanto registro){

	}

	/**
	 * 
	 * @param registro
	 */
	public void añadirRegistro(RegistroAdelanto registro){

	}

	public ArrayList<RegistroAdelanto> getTabla(){
		return null;
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
        
        
}//end TablaAdelantos