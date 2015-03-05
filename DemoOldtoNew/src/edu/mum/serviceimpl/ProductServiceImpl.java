package edu.mum.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.mum.domain.Product;
import edu.mum.service.ProductService;

@Service
public class  ProductServiceImpl implements ProductService {

//	@Autowired
//	ProductRepository productRepository;
	
	public void save(Product product) {
		//  productRepository.save(product);
	}
	public List<Product> findAll() {
		//  List<Product> list = productRepository.findAll( );
		List<Product> list = new ArrayList<Product>();
		return list;

	}

}
