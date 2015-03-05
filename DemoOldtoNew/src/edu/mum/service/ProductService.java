package edu.mum.service;

import java.util.List;

import edu.mum.domain.Product;

public interface  ProductService {
	
	public void save(Product product);
	public List<Product> findAll();

}
