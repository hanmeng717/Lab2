package alljava;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ShowBookMessage 
{
	private String title;
	private List<Book> list= new ArrayList<Book>();
	public List<Book> getList() {
	return list;
}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	
	private String authorid;
	private List<Author> list1= new ArrayList<Author>();
	
	public String getAuthorid() {
		return authorid;
	}

	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}

	public List<Author> getList1() {
		return list1;
	}

	public void setList1(List<Author> list1) {
		this.list1 = list1;
	}
	public String Search(){
        Connection conn = null;
		conn =ConnectSql.connectTheDb();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="select * from Book where title = '"+title+"'";
        PreparedStatement ps1=null;
        ResultSet rs1=null;
        String sql1="select * from Author where AuthorID = '"+authorid+"'";
        try {
              ps=(PreparedStatement) conn.prepareStatement(sql);
              rs=ps.executeQuery();
              while(rs.next())
              {
            	Book user= new Book();
            	user.setTitle(rs.getString("Title"));
            	user.setAuthorid(rs.getInt("AuthorID"));
            	user.setIsbn(rs.getInt("Isbn"));
            	user.setPrice(rs.getDouble("Price"));
            	user.setPublishdate(rs.getString("PublishDate"));
            	user.setPublisher(rs.getString("Publisher"));
            	list.add(user);
              }
            	
              ps1=(PreparedStatement) conn.prepareStatement(sql1);
              rs1=ps1.executeQuery();
              while(rs1.next())
              {
               	Author user1= new Author();
               	user1.setAge(rs1.getInt("age"));
               	user1.setAuthorid(rs1.getInt("authorid"));
               	user1.setCountry(rs1.getString("country"));
               	user1.setName(rs1.getString("name"));
               	list1.add(user1);
              }
              System.out.println(list1.toString());
              System.out.println(list.toString());
              return "OK";
       }
        catch (SQLException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
           return "ERROR";
       } 
    }
	@Override
	public String toString() {
		return "ShowBookMessage [list=" + list + "]";
	}
	
}
