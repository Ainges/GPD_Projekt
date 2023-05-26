package de.thi.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public  class ReadJsonFile {
        public static String readFile(String filePath) {
        try {
            // Pfad zur JSON-Datei erstellen
            Path path = Paths.get(filePath);

            // Inhalt der Datei als String einlesen
            String jsonString = new String(Files.readAllBytes(path));

            return jsonString;

        } catch (IOException e) {
            e.printStackTrace();
        }
            return null;
        }
}

