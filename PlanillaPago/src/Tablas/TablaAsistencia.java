package Tablas;

import Planilla.PlanillaPago;
import Registros.RegistroAsistencia;
import Conexion.Conexion;
import java.util.ArrayList;


/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaAsistencia {

    private ArrayList<RegistroAsistencia> registrosAsistencia;
    private Conexion conexion = new Conexion();

    public TablaAsistencia(){

    }

    /**
     * 
     * @param registro
     */
    public void añadirRegistro(RegistroAsistencia registro){
        this.registrosAsistencia.add(registro);
    }

    public ArrayList<RegistroAsistencia> getTabla(){
        return registrosAsistencia;
    }
}//end TablaAsistencia
