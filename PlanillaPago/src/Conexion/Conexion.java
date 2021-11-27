package Conexion;

import Tablas.TablaAdelantos;
import Tablas.TablaAsistencia;
import Tablas.TablaEmpleados;
import Tablas.TablaPagos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class Conexion {

	private static Connection instancia = null;
	public TablaAdelantos m_TablaAdelantos;
	public TablaPagos m_TablaPagos;
	public TablaAsistencia m_TablaAsistencia;
	public TablaEmpleados m_TablaEmpleados;

    private static final String SERVIDOR = "165.98.12.158\\LP2";
    private static final String USUARIO = "poo3";
    private static final String PW = "eQ33*1";
    private static final String NOMBREBD = "poo3";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Connection obtenerConexion(){
        if (Conexion.instancia != null)
            return Conexion.instancia;
        try{
            String conexionUrl = "jdbc:sqlserver://" + SERVIDOR +
                    ";Databasename=" + NOMBREBD;
            Class.forName(DRIVER);
            return (DriverManager.getConnection(conexionUrl, USUARIO, PW));
        }catch(ClassNotFoundException | SQLException ex){
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void close(Connection conn){
        try{
            conn.close();
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.WARNING, null, ex);
        }
    
    }

    public static void main(String[] argv) {
        Conexion con = new Conexion();
        Connection connection = con.obtenerConexion();
        System.out.println(connection);
        if (connection != null)
            System.out.println("Conexión establecida");
        else
            System.out.println("Conexión rechazada");
    }
    
}
