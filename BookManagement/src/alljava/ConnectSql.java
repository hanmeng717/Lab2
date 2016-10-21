package alljava;
import java.sql.*;  

import com.mysql.jdbc.Connection;
public class ConnectSql  {   
    private static String DBDRIVER   = "com.mysql.jdbc.Driver";                                      
    private static String DBURL      = "jdbc:mysql://xdlfpoldprqj.rds.sae.sina.com.cn:10655/bookdb?useSSL=false";               
    private static String DBUSER     = "root";  
    private static String DBPASSWORD = "19950812";  
    public static Connection connectTheDb(){
    	try{
    		Class.forName(DBDRIVER); 
            Connection conn = (Connection) DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
            return conn;
    	}catch(Exception e){
    		e.printStackTrace();
    		return null;
    	}
    }
} 