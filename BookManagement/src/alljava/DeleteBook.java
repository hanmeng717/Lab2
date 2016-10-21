package alljava;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteBook extends ActionSupport 
{
	private int isbn;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String Delete()
	{
		Connection conn = null; 
		conn =ConnectSql.connectTheDb();
	    PreparedStatement statement = null;
	    String sql="delete from Book where ISBN='"+isbn+"'";
	    try 
	    {  
	        statement = (PreparedStatement) conn.prepareStatement(sql);
	        statement.executeUpdate();
	        return "OK";
	    }
	    catch (Exception e) {    
            e.printStackTrace();
            return "ERROR";
        } 
	}
}