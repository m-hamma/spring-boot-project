package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "T_Users")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;

	private String login;

	private String password;

	private int connectionNumber;

	// Autres attributs

	@OneToMany(targetEntity = Command.class, mappedBy = "user")
	private List<Command> commands = new ArrayList<>();

	// Suite de la classe

}