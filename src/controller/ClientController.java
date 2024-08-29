package controller;

import java.util.HashMap;
import java.util.Map;

import model.Client;

public class ClientController {
    private Map<String, Client> clients;

    public ClientController() {
        this.clients = new HashMap<>();
    }

    public boolean addCustomer(Client client) {
        if (clients.containsKey(client.getId())) {
            System.out.println("Customer with ID: " + client.getId() + " already exists.");
            return false;
        }
        clients.put(client.getId(), client);
        System.out.println("Customer: " + client.getId() + " has been successfully added.");
        return true;
    }

    public boolean deleteCustomer(String clientId) {
        if (clients.containsKey(clientId)) {
        	clients.remove(clientId);
            System.out.println("Customer with ID: " + clientId + " has been successfully removed.");
            return true;
        }
        System.out.println("Customer with ID: " + clientId + " could not be found.");
        return false;
    }

    public boolean updateCustomer(Client client) {
        if (clients.containsKey(client.getId())) {
        	clients.put(client.getId(), client);
            System.out.println("Customer with ID: " + client.getId() + " has been successfully updated.");
            return true;
        }
        System.out.println("Customer with ID: " + client.getId() + " could not be found.");
        return false;
    }

    public Client getCustomerById(String id) {
        return clients.get(id);
    }

    public Map<String, Client> getAllCustomers() {
        return new HashMap<>(clients);  // Return a copy to prevent external modification
    }
}
