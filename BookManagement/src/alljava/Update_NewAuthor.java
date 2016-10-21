package alljava;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;
public class Update_NewAuthor extends ActionSupport
{
	private int authorid;
	private String name;
	private int age;
	private String country;
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String Search()
	{
		Connection conn = null;
		conn =ConnectSql.connectTheDb();
        PreparedStatement ps1=null;
        String sql1= "insert into Author(AuthorID,Name,Age,Country) values(?,?,?,?)";
        try {
             ps1=(PreparedStatement) conn.prepareStatement(sql1);
             ps1.setInt(1,authorid);
             ps1.setString(2,name);
             ps1.setInt(3,age);
             ps1.setString(4,country);
             ps1.executeUpdate();
                } 
        catch (SQLException e) 
        {
              // TODO Auto-generated catch block
             e.printStackTrace();
             return "ERROR";
        }
          
        return "OK";
	}
}
