package Tablas;

import Planilla.PlanillaPago;
import Usuarios.Empleado;
import java.util.ArrayList;


/**
 * @author jezer
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaEmpleados {

	private PlanillaPago m_PlanillaPago;

	public TablaEmpleados(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param empleado
	 */
	public void añadirEmpleado(Empleado empleado){

	}

	public ArrayList<Empleado> getTabla(){
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
        
        
}//end TablaEmpleados