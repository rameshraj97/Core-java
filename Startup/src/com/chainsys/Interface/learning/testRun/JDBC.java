package com.chainsys.Interface.learning.testRun;
import java.sql.*;
public class JDBC {
	public static void main(String[] args) {
	    try {
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
	           Connection myCon  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle"); 
	           java.sql.Statement mystat = myCon.createStatement();
	           ResultSet myRs  = mystat.executeQuery("select * from employees");
	           while(myRs.next()) {
	               System.out.println(myRs.getString("last_name") + ", " +myRs.getString("first_name"));
	           }
	       }catch(Exception err) {
	           err.printStackTrace();
	       }
	}
	
}
