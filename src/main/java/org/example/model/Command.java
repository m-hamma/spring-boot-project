package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import org.example.model.User;
import org.example.model.Product;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_Commands")
@Data
public class Command {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCommand;

	private LocalDateTime commandDate;

	@OneToMany(targetEntity = Product.class, mappedBy = "command")
	private List<Product> products = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "idUser", nullable = false)
	private User user;

}