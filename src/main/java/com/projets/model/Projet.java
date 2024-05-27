package com.projets.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Projet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private String statut;
	private List<String> exigences;
	
	@ManyToMany
	@JoinTable(name ="projetDeveloppeurs",
	joinColumns = @JoinColumn(name = "id"),
	inverseJoinColumns = @JoinColumn(name = "idUtilisateur")
	)
	List<Developpeur> developpeurs;

	
	@ManyToOne()
	private Client client;
	
	public Projet() {
		super();
	}


	public Projet(int id, String name, String description, Date dateDebut, Date dateFin, String statut,
			List<String> exigences) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.statut = statut;
		this.exigences = exigences;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public Date getDateFin() {
		return dateFin;
	}


	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public List<String> getExigences() {
		return exigences;
	}


	public void setExigences(List<String> exigences) {
		this.exigences = exigences;
	}
	
}
