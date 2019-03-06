package com.luxoft.jva007.BankApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.luxoft.jva007.BankApp.Client;

public class Bank {

    public List<Client> clients = new ArrayList<>();

    public void addClient(Client client){
        clients.add(client);
    }


}
