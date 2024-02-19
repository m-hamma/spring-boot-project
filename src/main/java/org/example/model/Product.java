package org.example.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.example.model.Command;
import org.example.model.User;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//@JsonFilter("monFiltreDynamique")
@Entity
@Table(name = "T_Products")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;

	private String nom;

	private int prix;

	// information que nous ne souhaitons pas exposer
	private int prixAchat;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idCommand", nullable = false)
	@JsonIgnore
	private Command command;

}