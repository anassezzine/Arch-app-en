package com.projets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projets.model.Client;
import com.projets.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Méthode pour récupérer tous les clients
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Méthode pour récupérer un client par son ID
    public Client getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    // Méthode pour créer un nouveau client
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    // Méthode pour mettre à jour un client existant
    public boolean updateClient(int id, Client client) {
        if (clientRepository.existsById(id)) {
            client.setIdUtilisateur(id); // Assurez-vous que l'ID est correctement défini
            clientRepository.save(client);
            return true;
        }
        return false;
    }

    // Méthode pour supprimer un client
    public boolean deleteClient(int id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
