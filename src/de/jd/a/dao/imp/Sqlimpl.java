package de.jd.a.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import de.jd.a.dao.Sqloperate;
import de.jd.a.dbc.Conntion;
import de.jd.a.vo.Product;


public class Sqlimpl implements Sqloperate {
	private Conntion cdc=new Conntion();
	private Connection conn=null;
	private PreparedStatement prsm=null;
	private ResultSet rs=null;
	@Override
	public List<Product> Productall() {
		List<Product> all=new ArrayList();
		Product product=null;
		conn=cdc.getConnerctions();
		String sql="select id,name,price from product order by id desc";
		try {
			prsm=conn.prepareStatement(sql);
			rs=prsm.executeQuery();
			while(rs.next()) {
				product=new Product();
				product.setProductid(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				all.add(product);
			}return all;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			cdc.close(conn, prsm, rs);
		}
		return null;
	}
	@Override
	public Product Selectpro(Integer id) {
		conn=cdc.getConnerctions();
		Product product=null;
		String sql="select id,name,price from product where id=?";
		try {
			prsm=conn.prepareStatement(sql);
			prsm.setInt(1, id);
			rs=prsm.executeQuery();
			while(rs.next()) {
				product=new Product();
				product.setProductid(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
			}return product;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
