package de.jd.a.biz.imp;

import java.util.List;

import de.jd.a.biz.Productbiz;
import de.jd.a.dao.Sqloperate;
import de.jd.a.dao.imp.Sqlimpl;
import de.jd.a.vo.Product;

public class Productbizimpl implements Productbiz {
	private Sqloperate sp=new Sqlimpl();
	@Override
	public List<Product> Productall() {
		
		return sp.Productall();
	}
	@Override
	public Product selectid(Integer id) {
		
		return sp.Selectpro(id);
	}

}
