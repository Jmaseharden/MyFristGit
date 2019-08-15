package de.jd.a.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.jd.a.biz.Productbiz;
import de.jd.a.biz.imp.Productbizimpl;
import de.jd.a.vo.Product;


public class Productservlet extends HttpServlet {
	


	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			Productbiz pb=new Productbizimpl();
			List<Product> product=pb.Productall();
			request.setAttribute("product", product);
			request.getRequestDispatcher("Product.jsp").forward(request, response);
			
	}

}
