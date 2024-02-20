package org.example.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_Users")
public class User {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;

	@Getter
	@Setter
	private String login;

	@Getter
	@Setter
	private String password;

	@Getter
	@Setter
	private String token;

	@Getter
	@Setter
	private int connectionNumber;

	// Autres attributs
	@Getter
	@Setter
	@OneToMany(targetEntity = Command.class, mappedBy = "user", cascade = CascadeType.ALL)
	private List<Command> commands;// = new ArrayList<>();

	// Suite de la classe

}