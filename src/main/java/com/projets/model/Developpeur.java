package com.projets.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Developpeur extends Utilisateur{
	
	private List<String> competences;
	
	@ManyToMany
	@JoinTable(name ="projetDeveloppeurs",
	joinColumns = @JoinColumn(name = "idUtilisateur"),
	inverseJoinColumns = @JoinColumn(name = "id")
	)
	private List<Projet> historiqueProjet;
	
	public Developpeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developpeur(int id, String name, String email) {
		super(id, name, email);
	}
	public Developpeur(int id, String name, String email, List<String> competences, List<Projet> historiqueProjet) {
		super(id, name, email);
		this.competences = competences;
		this.historiqueProjet = historiqueProjet;
	}
	public List<String> getCompetences() {
		return competences;
	}
	public void setCompetences(List<String> competences) {
		this.competences = competences;
	}
	public List<Projet> getHistoriqueProjet() {
		return historiqueProjet;
	}
	public void setHistoriqueProjet(List<Projet> historiqueProjet) {
		this.historiqueProjet = historiqueProjet;
	}
	
	
	
	
	
	
	
	
	

}
