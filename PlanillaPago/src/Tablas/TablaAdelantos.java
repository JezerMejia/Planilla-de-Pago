package Tablas;

import Planilla.PlanillaPago;
import Registros.RegistroAdelanto;
import java.util.ArrayList;

import Conexion.Conexion;


/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaAdelantos {

    private ArrayList<RegistroAdelanto> regisrosAdelanto;
    private Conexion conexion = new Conexion();

    public TablaAdelantos(){

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
        this.regisrosAdelanto.add(registro);
    }

    public ArrayList<RegistroAdelanto> getTabla(){
        return regisrosAdelanto;
    }
}//end TablaAdelantos
