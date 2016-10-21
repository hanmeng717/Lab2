package alljava;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;
public class Add_Check_Author extends ActionSupport{
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String Search()
	{
		boolean flag=false;
		Connection conn = null;
		conn =ConnectSql.connectTheDb();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="select * from Author where name = '"+name+"'";
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
        if(flag==false)//新增的作者姓名在原来的数据库表中不存在
        {
        	boolean flag1=false;
        	PreparedStatement ps2=null;
            ResultSet rs2=null;
            String sql2="select * from Author where authorid = '"+authorid+"'";
            try 
            {
                ps2=(PreparedStatement) conn.prepareStatement(sql2);
                rs2=ps2.executeQuery();
                while(rs2.next())
                	{
                		flag1=true;
                	}
             }
            catch (SQLException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "ERROR";
            } 
            if(flag1==false)//作者名不存在，并且作者id也没有与已存在的发生重复
            {
            	PreparedStatement ps1=null;
                String sql1= "insert into Author(AuthorID,Name,Age,Country) values(?,?,?,?)";
                try {
                    ps1=(PreparedStatement) conn.prepareStatement(sql1);
                    ps1.setInt(1,authorid);
                    ps1.setString(2,name);
                    ps1.setInt(3,age);
                    ps1.setString(4,country);
                    ps1.executeUpdate();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return "ERROR";
                }
           }
            else
            {
            	return "IDAlreadyExits";
            }
          }
        return "OK";
	}
}
