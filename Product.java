package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String productid = request.getParameter("productid");
		RequestDispatcher rd = request.getRequestDispatcher("product.html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproduct", "root", "Ramcharan@143");
		PreparedStatement pstmt = con.prepareStatement("select * from myproduct where productid = ? ");
		pstmt.setString(1, productid);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			pw.print("product__id fetched successfully");
			pw.print(" productId: "+rs.getInt("productid")+ " Name: "+rs.getString("name")+ " price: "+rs.getFloat("price"));
			rd.include(request, response);
		}else {
			pw.println("product_id doesnot match");
			rd.include(request, response);
		}
		} catch (Exception e) {
			pw.println("provide the correct id"+e.getMessage());
			rd.include(request, response);
		}
		response.setContentType("text/html");
	}
	
	}
