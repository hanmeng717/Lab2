package alljava;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;
public class Add_Check_Book extends ActionSupport
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
	
	public String Search()
	{
		boolean flag;
		flag=false;
		Connection conn = null;
		conn =ConnectSql.connectTheDb();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="select * from Book where ISBN = '"+isbn+"'";
        try 
        {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
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
        	return "isbnAlreadyExits";
        }
        else
        {
        	PreparedStatement ps1=null;
            String sql1= "insert into Book(ISBN,Title,AuthorID,PublishDate,Price,Publisher) values(?,?,?,?,?,?)";
            try {
                ps1=(PreparedStatement) conn.prepareStatement(sql1);
                ps1.setInt(1,isbn);
                ps1.setString(2,title);
                ps1.setInt(3,authorid);
                ps1.setString(4,publishdate);
                ps1.setDouble(5,price);
                ps1.setString(6,publisher);
                ps1.executeUpdate();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "ERROR";
            }
        }
        return "OK";
	}
}
