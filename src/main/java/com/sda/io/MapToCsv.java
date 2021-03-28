package com.sda.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MapToCsv {

    public static void main(String[] args) throws IOException {

        Map<String, String> values = new HashMap<>();
        values.put("Michał", "Bobowski");
        values.put("Franek", "Kimono");
        values.put("John", "Cena");

        Path path = Paths.get("mapa.csv");

        writeToFile(path, values);
    }

    private static void writeToFile(Path path, Map<String, String> values) throws IOException {

        BufferedWriter writer = Files.newBufferedWriter(path);
        for (String name : values.keySet()) {
            String lastName = values.get(name);
            writer.write(name + "," + lastName);
            writer.newLine();
        }
        writer.close();
    }
}
