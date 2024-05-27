package com.projets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projets.model.Developpeur;

@Repository
public interface DeveloppeurRepository extends JpaRepository<Developpeur, Integer>{

}
