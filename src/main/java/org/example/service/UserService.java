package org.example.service;

import java.util.HashSet;
import java.util.Set;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final UserRepository repository;

	public UserService(UserRepository repository) {
		this.repository = repository;
	}

	public Set<User> findAll() {
		final Iterable<User> itProducts = repository.findAll();
		// System.out.println("---->"+itProducts.)
		final Set<User> results = new HashSet<>();
		// for (Product p : itProducts) {
		// results.add(p);
		// }
		// results = (List<Product>) Arrays.asList(itProducts.iterator());
		itProducts.iterator().forEachRemaining(results::add);
		return results;
	}

	public User authentificate(User user) {
		return user;
	}

}
