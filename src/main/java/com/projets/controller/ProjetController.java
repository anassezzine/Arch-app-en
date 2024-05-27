package com.projets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projets.model.Projet;
import com.projets.service.ProjetService;

import java.util.List;

@RestController
@RequestMapping("/projets")
public class ProjetController {

    @Autowired
    private ProjetService projetService;

    // Endpoint pour récupérer tous les projets
    @GetMapping
    public ResponseEntity<List<Projet>> getAllProjets() {
        List<Projet> projets = projetService.getAllProjets();
        return new ResponseEntity<>(projets, HttpStatus.OK);
    }

    // Endpoint pour récupérer un projet par son ID
    @GetMapping("/{id}")
    public ResponseEntity<Projet> getProjetById(@PathVariable("id") int id) {
        Projet projet = projetService.getProjetById(id);
        if (projet != null) {
            return new ResponseEntity<>(projet, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint pour créer un nouveau projet
    @PostMapping
    public ResponseEntity<Projet> createProjet(@RequestBody Projet projet) {
        projetService.createProjet(projet);
        return new ResponseEntity<>(projet, HttpStatus.CREATED);
    }

    // Endpoint pour mettre à jour un projet existant
    @PutMapping("/{id}")
    public ResponseEntity<Projet> updateProjet(@PathVariable("id") int id, @RequestBody Projet projet) {
        boolean updated = projetService.updateProjet(id, projet);
        if (updated) {
            return new ResponseEntity<>(projet, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint pour supprimer un projet
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProjet(@PathVariable("id") int id) {
        boolean deleted = projetService.deleteProjet(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
