package de.jd.a.dao;

import java.util.List;

import de.jd.a.vo.Product;


public interface Sqloperate {
	public List<Product> Productall();
	public Product Selectpro(Integer id);
}
