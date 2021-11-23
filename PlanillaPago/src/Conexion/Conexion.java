package Conexion;

import Tablas.TablaAdelantos;
import Tablas.TablaAsistencia;
import Tablas.TablaEmpleados;
import Tablas.TablaPagos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class Conexion {

	private static Connection instancia;
	public TablaAdelantos m_TablaAdelantos;
	public TablaPagos m_TablaPagos;
	public TablaAsistencia m_TablaAsistencia;
	public TablaEmpleados m_TablaEmpleados;

    private static final String SERVIDOR = "localhost";
    private static final String USUARIO = "sa";
    private static final String PW = "1234";
    private static final String NOMBREBD = "Libros";
    private static final String PUERTO = "1433";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Connection obtenerConexion(){
        if (Conexion.instancia != null)
            return Conexion.instancia;
        try{
            String conexionUrl = "jdbc:sqlserver://" + SERVIDOR +": " + PUERTO +
                    "; Databasename= " + NOMBREBD +"; user= " + USUARIO +
                    "; password = " + PW + ";";
            Class.forName(DRIVER);
            return (DriverManager.getConnection(conexionUrl));
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Conexion.class.getName()); //.log(Level.WARNING);
        }
        return null;
    }
    
    public void close(Connection conn){
        try{
            conn.close();
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()); //.log(Level.ERROR, null, ex);
        }
    
    }
    
}
