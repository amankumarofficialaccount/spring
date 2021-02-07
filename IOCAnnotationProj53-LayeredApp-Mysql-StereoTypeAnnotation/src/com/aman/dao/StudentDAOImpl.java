package com.aman.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.aman.bo.StudentBO;

@Repository("studDAO")
@Scope("singleton")
@DependsOn("drds")
public final class StudentDAOImpl implements StudentDAO {
	private static final String  INSERT_STUDENT_QUERY="INSERT INTO LAYERED_STUDENT1(SNO,SNAME,SADD,TOTAL,AVG,RESULT) VALUES(?,?,?,?,?,?)";
		
	@Autowired
	 private DataSource ds;

   public StudentDAOImpl() {
	   System.out.println("StudentDAOImpl:0-Param Constructor");
   }
	

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get Pooled JDBC con obj from JDBC Con pool
		con=ds.getConnection();
		//create JDBC PreparedStatement object
		ps=con.prepareStatement(INSERT_STUDENT_QUERY);
		//set values to query params
		ps.setString(1,bo.getSno());
		ps.setString(2,bo.getSname());
		ps.setString(3,bo.getSadd());
		ps.setInt(4,bo.getTotal());
		ps.setFloat(5,bo.getAvg());
		ps.setString(6,bo.getResult());

		//execute the Query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}//method
}//class
