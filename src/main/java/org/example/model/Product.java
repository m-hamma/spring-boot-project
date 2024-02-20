package org.example.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.model.Command;
import org.example.model.User;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//@JsonFilter("monFiltreDynamique")
@Entity
@Table(name = "T_Products")
public class Product {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;

	@Getter
	@Setter
	private String nom;

	@Getter
	@Setter
	private int prix;

	// information que nous ne souhaitons pas exposer
	@Getter
	@Setter
	private int prixAchat;

	@Getter
	@Setter
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idCommand", nullable = false)
	@JsonIgnore
	private Command command;

}