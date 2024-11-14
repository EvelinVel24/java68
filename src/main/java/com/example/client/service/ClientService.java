package com.example.client.service;

import com.example.client.mapper.ClientMapper;
import com.example.client.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientMapper clientMapper;

    public void addClient(Client client) {
        clientMapper.insertClient(client);
    }

    public List<Client> getAllClients() {
        return clientMapper.findAllClients();
    }

    public Client getClientById(int id) {
        return clientMapper.findClientById(id);
    }
}
