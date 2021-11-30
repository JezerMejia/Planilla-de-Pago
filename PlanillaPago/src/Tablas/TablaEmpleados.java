package Tablas;

import Planilla.PlanillaPago;
import Usuarios.Empleado;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 * @author jezer
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class TablaEmpleados {

    private ArrayList<Empleado> empleados;
    private final Conexion conexion = new Conexion();
    private Connection conn;
    private PreparedStatement mostrarEmpleados;
    private PreparedStatement insertarRegistros;
    private PreparedStatement modificarRegistros;
    private PreparedStatement eliminarRegistros;
/*
    public TablaEmpleados(){
        try{
            conn = conexion.obtenerConexion();
            mostrarEmpleados = conn.prepareStatement("Select * from Empleados");
            insertarRegistros = conn.prepareStatement("Insert Into Autor(id," + "nombrePila,"
                                + " apellidoPaterno," + "apellido," + "privilegios," + "cargo) Values(?, ?, ?, ?)");
            modificarRegistros = conn.prepareStatement("Update Empleados set id=?, " + "nombre = ?," 
                                + "apellido = ?, " + "privilegios=?," + "cargo=? where id = ?");
            eliminarRegistros = conn.prepareStatement("Delete From  Empleados where idAutor = ?");
            empleados = new ArrayList<>();
            
            empleados = listarEmpleado();
        }catch(SQLException ex){
                System.out.println(ex.getMessage());
                System.exit(1);
        }
    }
    
    private ArrayList<Empleado> listarEmpleado(){
       ArrayList<Empleado> result = null;
       ResultSet rs = null;
       try{
           rs = mostrarEmpleados.executeQuery();
           result = new ArrayList<>();
           
           while(rs.next()){
               result.add(new Empleado(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("privilegios"),
                    rs.getString("cargo"),
                    1 //estado original 
               ));  
           }
       
       }catch(SQLException ex){
            ex.printStackTrace();
       }finally{
           try{
              rs.close();
           }catch(SQLException ex){
              conexion.close(conn);
           }
       }
       return result;
    }
    
    public int agregarLista(int id,String nombre, String apellido, String cargo){
       try{
           empleados.add(new Empleado(0,
                   nombrePila,
                   apellidoPaterno,
                   4 // estado nuevo registrado, sin guardar
                   ));
       return 1;
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }
       
       return 0;
    }
    
    
    public int editarLista(int idAutor, String nombrePila, String apellidoPaterno){
        try{
            Empleado emp = new Empleado(
              id,
              nombre,
              apellido,
              cargo,
              2 // estafdo modifcado de la lista
            );
            
            for(Empleado e: Lista){
                if(e.getId() == emp.getId()){
                    e.setNombre(emp.getNombre());
                    e.setApellido(emp.getApellido());
                    if(emp.getEstado()!=0) e.setEstado(emp.getEstado());
                    return 1;
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    
  */  
    public void mostrarEmpleados(){
    }
    
    
    
    public void añadirEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public ArrayList<Empleado> getTabla(){
        return empleados;
    }
    
    public void buscarEmpleado(){
    
    }
}//end TablaEmpleados
