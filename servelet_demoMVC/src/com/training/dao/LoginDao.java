package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.model.user1;

public class LoginDao implements ILoginDao{

	@Override
	public List<user1> getUsers() throws ClassNotFoundException, SQLException {
		Connection con = null;

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String conUrl = "jdbc:sqlserver://localhost; databaseName=MARS; user=sa; password=1234";
		con = DriverManager.getConnection(conUrl);
		
		List<user1> lstusr = new ArrayList<user1>(); 
		
		String selectSql = "select * from user1;";

		PreparedStatement pstmt = con.prepareStatement(selectSql);
		ResultSet rss = pstmt.executeQuery();
		
		while(rss.next()) {
			user1 usr = new user1();
			usr.setUserName(rss.getString(1));
			usr.setPassword(rss.getString(2));
			lstusr.add(usr);
		}
		return lstusr;
	}


}

