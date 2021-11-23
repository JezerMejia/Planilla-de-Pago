package Tablas;

import Planilla.PlanillaPago;
import Registros.RegistroPago;
import Conexion.Conexion;
import java.util.ArrayList;

/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaPagos {

    private ArrayList<RegistroPago> registrosPago;
    private Conexion conexion = new Conexion();

    public TablaPagos(){

    }

    public void añadirRegistro(RegistroPago registro){
        this.registrosPago.add(registro);
    }

    public ArrayList<RegistroPago> getTabla(){
        return registrosPago;
    }
}//end TablaPagos
