package com.projets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projets.model.Developpeur;
import com.projets.repository.DeveloppeurRepository;

@Service
public class DeveloppeurService {

    @Autowired
    private DeveloppeurRepository developpeurRepository;

    public List<Developpeur> getAllDeveloppeurs() {
        return developpeurRepository.findAll();
    }

    public Developpeur getDeveloppeurById(int id) {
        return developpeurRepository.findById(id).orElse(null);
    }

    public void createDeveloppeur(Developpeur developpeur) {
        developpeurRepository.save(developpeur);
    }

    public boolean updateDeveloppeur(int id, Developpeur developpeur) {
        if (developpeurRepository.existsById(id)) {
            developpeur.setIdUtilisateur(id);
            developpeurRepository.save(developpeur);
            return true;
        }
        return false;
    }

    public boolean deleteDeveloppeur(int id) {
        if (developpeurRepository.existsById(id)) {
            developpeurRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
