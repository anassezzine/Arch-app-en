package com.projets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projets.model.Developpeur;
import com.projets.service.DeveloppeurService;

@RestController
public class DeveloppeurController {

    @Autowired
    private DeveloppeurService developpeurService;

    @GetMapping("/developpeurs")
    public ResponseEntity<List<Developpeur>> getAllDeveloppeurs() {
        List<Developpeur> developpeurs = developpeurService.getAllDeveloppeurs();
        return new ResponseEntity<>(developpeurs, HttpStatus.OK);
    }

    @GetMapping("/developpeurs/{id}")
    public ResponseEntity<Developpeur> getDeveloppeurById(@PathVariable int id) {
        Developpeur developpeur = developpeurService.getDeveloppeurById(id);
        if (developpeur != null) {
            return new ResponseEntity<>(developpeur, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/developpeurs")
    public ResponseEntity<Developpeur> createDeveloppeur(@RequestBody Developpeur developpeur) {
        developpeurService.createDeveloppeur(developpeur);
        return new ResponseEntity<>(developpeur, HttpStatus.CREATED);
    }

    @PutMapping("/developpeurs/{id}")
    public ResponseEntity<Developpeur> updateDeveloppeur(@PathVariable int id, @RequestBody Developpeur developpeur) {
        boolean updated = developpeurService.updateDeveloppeur(id, developpeur);
        if (updated) {
            return new ResponseEntity<>(developpeur, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/developpeurs/{id}")
    public ResponseEntity<Void> deleteDeveloppeur(@PathVariable int id) {
        boolean deleted = developpeurService.deleteDeveloppeur(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
