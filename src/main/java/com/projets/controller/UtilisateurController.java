package com.projets.controller;

import com.projets.model.Utilisateur;
import com.projets.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    // Endpoint pour récupérer tous les utilisateurs et afficher la page JSP
    @GetMapping("/page")
    public String showAllUtilisateurs(Model model) {
        List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
        model.addAttribute("utilisateurs", utilisateurs);
        return "Utilisateurs"; // Retourne le nom de la page JSP (sans le suffixe .jsp)
    }

    // Endpoint pour récupérer tous les utilisateurs en format JSON
    @GetMapping
    public ResponseEntity<List<Utilisateur>> getAllUtilisateurs() {
        List<Utilisateur> utilisateurs = utilisateurService.getAllUtilisateurs();
        return new ResponseEntity<>(utilisateurs, HttpStatus.OK);
    }

    // Endpoint pour récupérer un utilisateur par son ID
    @GetMapping("/{id}")
    public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable("id") int id) {
        Utilisateur utilisateur = utilisateurService.getUtilisateurById(id);
        if (utilisateur != null) {
            return new ResponseEntity<>(utilisateur, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint pour créer un nouveau utilisateur
    @PostMapping
    public ResponseEntity<Utilisateur> createUtilisateur(@RequestBody Utilisateur utilisateur) {
        utilisateurService.createUtilisateur(utilisateur);
        return new ResponseEntity<>(utilisateur, HttpStatus.CREATED);
    }

    // Endpoint pour mettre à jour un utilisateur existant
    @PutMapping("/{id}")
    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable("id") int id, @RequestBody Utilisateur utilisateur) {
        boolean updated = utilisateurService.updateUtilisateur(id, utilisateur);
        if (updated) {
            return new ResponseEntity<>(utilisateur, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint pour supprimer un utilisateur
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUtilisateur(@PathVariable("id") int id) {
        boolean deleted = utilisateurService.deleteUtilisateur(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
