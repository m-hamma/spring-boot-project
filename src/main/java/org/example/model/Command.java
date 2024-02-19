package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.example.model.User;
import org.example.model.Product;
import org.hibernate.annotations.OnDelete;

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

	@OneToMany(targetEntity = Product.class, mappedBy = "command", fetch = FetchType.LAZY)
	private List<Product> products = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idUser", nullable = false)
	@JsonIgnore
	private User user;

}