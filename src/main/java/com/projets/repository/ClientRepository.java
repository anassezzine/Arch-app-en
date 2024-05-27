package com.projets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projets.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
