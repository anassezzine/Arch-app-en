package com.projets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projets.model.Projet;
import com.projets.repository.ProjetRepository;

@Service
public class ProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    // Méthode pour récupérer tous les projets
    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    // Méthode pour récupérer un projet par son ID
    public Projet getProjetById(int id) {
        return projetRepository.findById(id).orElse(null);
    }

    // Méthode pour créer un nouveau projet
    public Projet createProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    // Méthode pour mettre à jour un projet existant
    public boolean updateProjet(int id, Projet projet) {
        if (projetRepository.existsById(id)) {
            projet.setId(id);
            projetRepository.save(projet);
            return true;
        }
        return false;
    }

    // Méthode pour supprimer un projet
    public boolean deleteProjet(int id) {
        if (projetRepository.existsById(id)) {
            projetRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
