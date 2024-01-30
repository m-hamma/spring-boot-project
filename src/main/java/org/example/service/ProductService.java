package org.example.service;

import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

	private final ProductRepository repository;

	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}

	public List<Product> findAll() {
		final Iterable<Product> itProducts = repository.findAll();
		final List<Product> results = new ArrayList<>();
		itProducts.iterator().forEachRemaining(results::add);
		return results;
	}

}
