package com.model2.mvc.service.product;

import java.util.List;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;


public interface ProductDao {
	
	// INSERT
	public int addProduct(Product productVO) throws Exception;

	// SELECT ONE
	public Product getProduct(int prodNo) throws Exception;

	// UPDATE
	public int updateProduct(Product product) throws Exception;

	// SELECT LIST
	public List<Product> getProductList(Search search) throws Exception;
	
	// �Խ��� Page ó���� ���� ��üRow(totalCount)  return
	public int getTotalCount(Search search) throws Exception ;

}