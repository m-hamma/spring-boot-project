package org.example.service;

import lombok.extern.slf4j.XSlf4j;
import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.example.model.Product;

import java.util.*;

@Service
public class ProductService {

	private final ProductRepository repository;

	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}

	public Set<Product> findAll() {
		final Iterable<Product> itProducts = repository.findAll();
		// System.out.println("---->"+itProducts.)
		final Set<Product> results = new HashSet<>();
		// for (Product p : itProducts) {
		// results.add(p);
		// }
		// results = (List<Product>) Arrays.asList(itProducts.iterator());
		itProducts.iterator().forEachRemaining(results::add);
		return results;
	}

}
