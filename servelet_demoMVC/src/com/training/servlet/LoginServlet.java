package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.service.LoginService;

/**
 * Servlet implementation class homeServlet
 */
@WebServlet("/home")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	String name=null;
	public void init(){
		name="Safia";
	}
	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		LoginService ls = new LoginService();
		RequestDispatcher rd = null;
		String userName = request.getParameter("uname");
		String pword = request.getParameter("pwd");

		try {
			if (ls.validateUser(userName, pword))
			{
				request.setAttribute("userName", userName);
				rd = request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
			}
			else {
				rd = request.getRequestDispatcher("failure.jsp");
				rd.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}



//System.out.println("Inside doGet");
//Connection con = null;
//try {
//	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	String conUrl = "jdbc:sqlserver://localhost; databaseName=MARS; user=sa; password=1234";
//	con = DriverManager.getConnection(conUrl);
//	
//	RequestDispatcher rd = null;
//	String userName = request.getParameter("uname");
//	String pword = request.getParameter("pwd");
//
//	//String selectSql = "select * from user1 where username = userName && password = pword;";
//	String selectSql = "select * from user1;";
//
//	PreparedStatement pstmt = con.prepareStatement(selectSql);
//	ResultSet rss = pstmt.executeQuery();
//	String user = null;
//	String pass = null;
//	while (rss.next()) {
//		System.out.println(rss.getString(1)+"       "+rss.getString(2));
//		user = rss.getString(1);
//		pass = rss.getString(2);
//		System.out.println("Entered Value:"+ userName+"   "+pword);
//		System.out.println("Value from database:"+ user+"   "+pass);
//		if (userName.equalsIgnoreCase(user) && (pword.equals(pass)))
//		{
//			request.setAttribute("userName", userName);
//			rd = request.getRequestDispatcher("home.jsp");
//			rd.forward(request, response);
//		}
//		
//	}
//	rd = request.getRequestDispatcher("failure.jsp");
//	rd.forward(request, response);
//	
//}
//catch (Exception e) {
//
//}

