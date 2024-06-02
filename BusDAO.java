package BusResv;
import java.sql.*;
public class BusDAO {

	public void display() throws SQLException
	{
		String query="Select * from bus";
		Connection con =Dbconnection.getConnection();
		//System.out.println("Bus No:" +busNo +"AC:" +ac+"Total Capacity:"+capacity);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("Bus No:"+rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("Ac:no");
			else
				System.out.println("AC:yes");
			System.out.println("Capacity:"+rs.getInt(3));
		}
		System.out.println("------------------");
	}
	public int getCapacity(int id) throws SQLException
	{
		String query="select capacity from bus table where id="+id;
				
		Connection con=Dbconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
	
}
