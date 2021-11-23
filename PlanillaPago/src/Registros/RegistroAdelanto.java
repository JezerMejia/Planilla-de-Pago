package Registros;

import Planilla.PlanillaPago;
import java.util.Date;


/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class RegistroAdelanto {

    private boolean aceptado;
    private float adelanto;
    private Date fecha;
    private String justificacion;
    private PlanillaPago m_PlanillaPago;

    public RegistroAdelanto(){

    }

    /**
     * @return the aceptado
     */
    public boolean isAceptado() {
        return aceptado;
    }

    /**
     * @param aceptado the aceptado to set
     */
    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

    /**
     * @return the adelanto
     */
    public float getAdelanto() {
        return adelanto;
    }

    /**
     * @param adelanto the adelanto to set
     */
    public void setAdelanto(float adelanto) {
        this.adelanto = adelanto;
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
     * @return the justificacion
     */
    public String getJustificacion() {
        return justificacion;
    }

    /**
     * @param justificacion the justificacion to set
     */
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
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
}//end RegistroAdelanto
