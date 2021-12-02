package Planilla;

import Tablas.TablaAdelantos;
import Tablas.TablaAsistencia;
import Tablas.TablaEmpleados;
import Tablas.TablaPagos;
import Usuarios.Empleado;

/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class PlanillaPago {

    private TablaEmpleados tablaEmpleados;
    private TablaPagos tablaPagos;
    private TablaAdelantos tablaAdelantos;
    private TablaAsistencia tablaAsistencia;

    public PlanillaPago(){
        this.tablaEmpleados = new TablaEmpleados(this);
        this.tablaPagos = new TablaPagos(this);
        this.tablaAdelantos = new TablaAdelantos(this);
        this.tablaAsistencia = new TablaAsistencia(this);
    }

    public TablaEmpleados getTablaEmpleados() {
		return tablaEmpleados;
	}

	public void setTablaEmpleados(TablaEmpleados tablaEmpleados) {
		this.tablaEmpleados = tablaEmpleados;
	}

	public TablaPagos getTablaPagos() {
		return tablaPagos;
	}

	public void setTablaPagos(TablaPagos tablaPagos) {
		this.tablaPagos = tablaPagos;
	}

	public TablaAdelantos getTablaAdelantos() {
		return tablaAdelantos;
	}

	public void setTablaAdelantos(TablaAdelantos tablaAdelantos) {
		this.tablaAdelantos = tablaAdelantos;
	}

	public TablaAsistencia getTablaAsistencia() {
		return tablaAsistencia;
	}

	public void setTablaAsistencia(TablaAsistencia tablaAsistencia) {
		this.tablaAsistencia = tablaAsistencia;
	}

	public void aceptarAdelanto(boolean aceptado, Empleado empleado){

    }

    private void calcularPago(Empleado empleado){

    }

    private void cargarDatos(){

    }

    /**
     * 
     * @param pago
     */
    public void realizarPago(){

    }

    /**
     * 
     * @param adelanto
     * @param empleado
     */
    public void registrarAsistencia(Float adelanto, Empleado empleado){

    }

    /**
     * 
     * @param empleado
     * @param adelanto
     * @param justificacion
     */
    public void solicitarAdelanto(Empleado empleado, Float adelanto, String justificacion){
            
    }
}//end PlanillaPago
