package de.thi.services;

import camundajar.impl.com.google.gson.Gson;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
* Hubertus Seitz
* */
public class ReadMember implements JavaDelegate {

    // Get Logger
    private static final Logger LOG = LoggerFactory.getLogger(ReadMember.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOG.info("ReadMember.class wurde durch Task >>>Mitglieder Einlesen<<< aufgerufen!");
        LOG.info("Lese Mitglieder aus JSON-String... (produktiv natürlich aus DB!)");


        // Generated by ChatGPT
        String userString = """
                
                [
                    {
                      "vorname": "Max",
                      "nachname": "Mustermann",
                      "alter": 30,
                      "mitgliedschaft": "Aktiv",
                      "mitgliedschaftsdauer": 2,
                      "artDerAktivitaet": "Freizeit",
                      "ehrenmitglied": false,
                      "BeitragsanpassungGestartet": false,
                      "beitrag" : 1
                    },
                    {
                      "vorname": "Anna",
                      "nachname": "Schmidt",
                      "alter": 25,
                      "mitgliedschaft": "Aktiv",
                      "mitgliedschaftsdauer": 1,
                      "artDerAktivitaet": "Wettkampf",
                      "ehrenmitglied": false,
                      "beitragsanpassungGestartet": false,
                      "beitrag" : 1
                    },
                    {
                      "vorname": "Michael",
                      "nachname": "Müller",
                      "alter": 40,
                      "mitgliedschaft": "Passiv",
                      "mitgliedschaftsdauer": 3,
                      "artDerAktivitaet": "Freizeit",
                      "ehrenmitglied": true,
                      "beitragsanpassungGestartet": true,
                      "beitrag" : 10
                    },
                    {
                      "vorname": "Julia",
                      "nachname": "Schneider",
                      "alter": 35,
                      "mitgliedschaft": "Aktiv",
                      "mitgliedschaftsdauer": 2,
                      "artDerAktivitaet": "Wettkampf",
                      "ehrenmitglied": false,
                      "beitragsanpassungGestartet": false,
                      "beitrag" : 1
                    },
                    {
                      "vorname": "Thomas",
                      "nachname": "Fischer",
                      "alter": 28,
                      "mitgliedschaft": "Aktiv",
                      "mitgliedschaftsdauer": 1,
                      "artDerAktivitaet": "Freizeit",
                      "ehrenmitglied": false,
                      "beitragsanpassungGestartet": false,
                      "beitrag" : 1
                    }
                  ]
                
                """;


        // Convert JSON-String to List of User-Objects

        // Parse JSON-String to User-Array
        Gson gson = new Gson();
        User[] userArray = gson.fromJson(userString, User[].class);

        // Convert User-Array to List of Users
        List<User> userList = new ArrayList<>();
        Collections.addAll(userList, userArray);

        // Set Variable "users" in Camunda
        execution.setVariable("users", userList);

    }
}
