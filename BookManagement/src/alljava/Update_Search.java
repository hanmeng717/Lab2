package alljava;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;
public class Update_Search extends ActionSupport
{
	private int isbn;
	private String title;
	private int authorid;
	private String publishdate;
	private double price;
	private String publisher;
	private List<Book> list= new ArrayList<Book>();
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

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	
	public String Search(){
        Connection conn = null;
		conn =ConnectSql.connectTheDb();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="select * from Book where ISBN = '"+isbn+"'";
        try {
              ps=(PreparedStatement) conn.prepareStatement(sql);
              rs=ps.executeQuery();
              while(rs.next()){
            	Book user= new Book();
            	user.setTitle(rs.getString("Title"));
            	user.setAuthorid(rs.getInt("AuthorID"));
            	user.setIsbn(rs.getInt("Isbn"));
            	user.setPrice(rs.getDouble("Price"));
            	user.setPublishdate(rs.getString("PublishDate"));
            	user.setPublisher(rs.getString("Publisher"));
            	list.add(user);
            }
              return "OK";
              
       } catch (SQLException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
           return "ERROR";
       } 
    }
}
