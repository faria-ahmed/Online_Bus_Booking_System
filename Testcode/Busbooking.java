package runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Busbooking {
	public Busbooking () {Connection connection = null;
    try {
        
	  // Load the MySQL JDBC driver
	 
	  String driverName = "com.mysql.jdbc.Driver";
	 
	  Class.forName(driverName);
	 
	 
	  // Create a connection to the database
	 
	  String serverName = "localhost";
	 
	  String schema = "dbaprtment";
	 
	  String url = "jdbc:mysql://" + serverName +  "/" + schema;
	 
	  String username = "root";
	 
	  String password = "";
	 
	  connection = DriverManager.getConnection(url, username, password);
	 
	   
	 
	  System.out.println("Successfully Connected to the database!");
	 
	   
	    } catch (ClassNotFoundException e) {
	 
	  System.out.println("Could not find the database driver " + e.getMessage());
	    } catch (SQLException e) {
	 
	  System.out.println("Could not connect to the database " + e.getMessage());
	  }
	 
	    try {
	 
	 
	// Get a result set containing all data from test_table
	 
	Statement statement = connection.createStatement();
	 
//	ResultSet results = statement.executeQuery("SELECT * FROM customer");
	for(int i=0; i<1;i++){
		ResultSet results = statement.executeQuery("SELECT * FROM tbl_add_admin");
	    while(results.next()) {
	        String Name = results.getString("name");
	        System.out.print(i);
	        System.out.println("Name:"+Name);
	    }
	}
}
	    catch (Exception e){
}

}
	
private static String busNo [] = {"5003"} ;
private static String busName [] = {"Economy"} ; 
private static String terminalName[] = {"Jamalkhan"} ;
private static String city [] = {"Chattogram"} ;
private static String available [] = {"35"} ;
private static String price [] = {"350"} ;

public String busCheck(String no, String name) {
   Busbooking b = new Busbooking();
    String bno = no;
    String bname = name ;
    String message="fail";
    for (int i = 0; i < b.busNo.length ; i++) {
        if(b.busNo[i].equals(bno)) {
            if (b.busName[i].equals(bname)){
                message = "pass";
            }else {
            message = "fail";
            }
        }
    }
    return message;
}

public String locationCheck(String tname, String cityn) {
	   Busbooking c = new Busbooking();
	    String tername = tname;
	    String ciname = cityn ;
	    String message="fail";
	    
	    for (int i = 0; i < c.terminalName.length ; i++) {
	        if(c.terminalName[i].equals(tername)) {
	            if (c.city[i].equals(ciname)){
	                message = "pass";
	            }
	            else {
	            message = "fail";
	            }
	        }
	    }
	    return message;
	}

public String scheduleCheck(String avail, String pricetk) {
	   Busbooking d = new Busbooking();
	    String availA = avail;
	    String prices = pricetk;
	    String message="fail";
	    
	    for (int i = 0; i < d.price.length ; i++) {
	        if(d.price[i].equals(prices)) {
	        	if (d.available[i].equals(availA)){
	        	message = "pass";
	        }
	        else {
	            message = "fail";
	        }
	        
	    }
	    }
	    return message;
	}
}
