package Tablas;

import Planilla.PlanillaPago;
import Usuarios.Empleado;
import Conexion.Conexion;
import java.util.ArrayList;

/**
 * @author jezer
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaEmpleados {

    private ArrayList<Empleado> empleados;
    private Conexion conexion = new Conexion();

    public TablaEmpleados(){

    }

    /**
     * 
     * @param empleado
     */
    public void añadirEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public ArrayList<Empleado> getTabla(){
        return empleados;
    }
}//end TablaEmpleados
