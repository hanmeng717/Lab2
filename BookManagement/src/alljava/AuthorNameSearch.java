package alljava;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;
public class AuthorNameSearch extends ActionSupport {
	private String authorname;
	private List<Book> list= new ArrayList<Book>();
	public List<Book> getList() {
	return list;
}
public void setList(List<Book> list) {
	this.list = list;
}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public void Output() {
		System.out.println(authorname);
	}
	public String Search(){
        Connection conn = null;
		conn =ConnectSql.connectTheDb();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="select * from Book where AuthorId = any(select AuthorId from Author where Author.Name = '"+authorname+"')";
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
