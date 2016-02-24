package in.co.psoft.ims.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
 
 
public class ConnectionPool {
 
    /* private static ConPool pool = null;
     private static javax.sql.DataSource dataSource = null;
     * */
    public static Connection getConnection() {
        Connection con = null;
       
        /**
		    * Loading the Driver.. Class.forName
		    * preparing the Connection.. DriverManger.getConnection
		    * prepareing the Statment con.prepareStament()
		    * executing the query .. statmenet.executeQuery
		    * processing the resultset restulSet..
		    * reeasing the connection. Connection
		    * c
		    * 
		    */
        try {
            Context ctx = new InitialContext();
            
            DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/imsDB");
            con = ds.getConnection();
             
        }  
        catch (NamingException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return con;
         
    }
 
    public static void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}