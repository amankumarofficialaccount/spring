package com.aman.jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.Connection;


public class PropertiesFileTest {
	
	public static void main(String[] args) {
	
	String driver=null,url=null,dbuser=null,dbpwd=null;
	InputStream is = null;
	Properties props = null;
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	
	try {
		
		is = new FileInputStream("src/com/aman/commons/DBDetails.properties");
		props = new Properties();
		props.load(is);
		driver = props.getProperty("jdbc.driver");
		url = props.getProperty("jdbc.url");
		dbuser = props.getProperty("jdbc.user");
		dbpwd = props.getProperty("jdbc.pwd");
		
	//register driver
	Class.forName(driver);
	
	//Establish The Connection
    con=DriverManager.getConnection(url,dbuser,dbpwd);
    
    //Create Statement Object
		if(con!=null)
    st = con.createStatement();
    
    //Execute query
		if(st!=null)
    rs = st.executeQuery("SELECT * FROM STUDENT");
		
		//print result
		if(rs!=null) {
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

			}
		}

	}
	catch(ClassNotFoundException cnf) {
		cnf.printStackTrace();
	}
	catch(SQLException se) {
		se.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
    
	finally {
		
		try {
			if(rs!=null)
				rs.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		try {
			if(st!=null)
				st.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		try {
			if(con!=null)
				con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
    
}
}
