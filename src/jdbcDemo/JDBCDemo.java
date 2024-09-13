package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
String url="jdbc:mysql://127.0.0.1:3306/Employees_Database";
int rowAffected;
int rowAffected1;
		try {
			//Establish Connect Object
			Connection conn=DriverManager.getConnection(url,"root","Radhabhav1!");
			//create a statement object to send to the object
			Statement statement=conn.createStatement();
			
			//Execute the statement object
			//ResultSet resultSet=statement.executeQuery("select * from  employees_tbl");;
			//rowAffected=statement.executeUpdate("insert into employees_tbl (id,name,dept,salary) values (1000,'Madhu','Vaikuntha',2000)");
			//rowAffected1=statement.executeUpdate("delete from employees_tbl where id=500");
			rowAffected1=statement.executeUpdate("update employees_tbl set salary=505  0 where id=600;");
			
			
			
			//Process the data
			int salaryTotal = 0;
//			while(resultSet.next()) {
//				//System.out.println(resultSet.getString("name"));
//				//System.out.println(resultSet.getString("dept"));
//				System.out.println(resultSet.getInt("salary"));
//				//salaryTotal=salaryTotal+resultSet.getInt("salary");
//				salaryTotal=salaryTotal+Integer.parseInt(resultSet.getString("salary"));
//			}
//			System.out.println("Salary Total is"+salaryTotal);
			
			System.out.println(rowAffected1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while insertion");
		}
	}

}
