package com.projets.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Client extends Utilisateur{
	
	private String Siege;
	private String adresse;
	
	@OneToMany(mappedBy="client")
	private List<Projet> projets;
	
	

	@Override
	public String toString() {
		return "Client [Siege=" + Siege + ", adresse=" + adresse + ", projets=" + projets + "]";
	}

	public String getSiege() {
		return Siege;
	}

	public void setSiege(String siege) {
		Siege = siege;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	
	

}
