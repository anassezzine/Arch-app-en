package com.projets.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projets.model.Projet;
import com.projets.repository.ProjetRepository;

@Service
public class ProjetService {
	
	@Autowired ProjetRepository projetRepository;
	
	public void addOrUpdateProjet(Projet projet) {
		projetRepository.save(projet);
	}
	
	public Optional<Projet> getProjetById(int id){
		return projetRepository.findById(id);
	}

}
