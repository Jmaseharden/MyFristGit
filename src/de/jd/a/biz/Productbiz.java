package de.jd.a.biz;

import java.util.List;

import de.jd.a.dao.Sqloperate;
import de.jd.a.dao.imp.Sqlimpl;
import de.jd.a.vo.Product;

public interface Productbiz {
	public List<Product> Productall();
	public Product selectid(Integer id);
}
