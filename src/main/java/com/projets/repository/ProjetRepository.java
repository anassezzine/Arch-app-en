package com.projets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projets.model.Projet;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Integer>{

}
