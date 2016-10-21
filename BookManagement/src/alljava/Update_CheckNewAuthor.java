package alljava;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;
public class Update_CheckNewAuthor extends ActionSupport
{
	private int isbn;
	private String title;
	private int authorid;
	private String publishdate;
	private double price;
	private String publisher;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String Check()
	{
		Connection conn=null;
        conn =ConnectSql.connectTheDb();
		boolean flag;
		flag=false;
        PreparedStatement ps1=null;
        ResultSet rs1=null;
        String sql1="select * from Author where AuthorID = '"+authorid+"'";
        try 
        {
            ps1=(PreparedStatement) conn.prepareStatement(sql1);
            rs1=ps1.executeQuery();
            while(rs1.next())
            	{
            		flag=true;
            	}
         }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "ERROR";
        } 
        System.out.println(flag);
        if(flag==true)
        {
        	PreparedStatement ps=null;
            String sql="update Book set AuthorID=?,PublishDate=?,Price=?,Publisher=? where ISBN='"+isbn+"'";
            try {
                ps=(PreparedStatement) conn.prepareStatement(sql); 
                ps.setInt(1, authorid);
                ps.setString(2, publishdate);
                ps.setDouble(3,price);
                ps.setString(4, publisher);
                ps.executeUpdate();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "ERROR";
            }
            return "OK";
        }
        else
        {
        	return "newauthor";
        }
	}
}
