package de.jd.a.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.jd.a.biz.Productbiz;
import de.jd.a.biz.imp.Productbizimpl;
import de.jd.a.vo.Orderltem;
import de.jd.a.vo.Product;


public class addOrderItem extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			int productid=Integer.valueOf(request.getParameter("pid"));
			int num=Integer.valueOf(request.getParameter("num"));
			Productbiz prs=new Productbizimpl();
			Product product=prs.selectid(productid);
			
			Orderltem orderltem=new Orderltem();
			orderltem.setNum(num);
			orderltem.setProduct(product);
			List<Orderltem> list=(List<Orderltem>) request.getSession().getAttribute("list");
			if(list==null) {
				list = new ArrayList<Orderltem>();
				request.getSession().setAttribute("list", list);
			}
			list.add(orderltem);
			
			request.getRequestDispatcher("Order.jsp").forward(request, response);
		}

}
