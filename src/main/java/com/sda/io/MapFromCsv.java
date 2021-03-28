package com.sda.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapFromCsv {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("mapa.csv");
        Map<String, String> loaded = readFromFile(path);
        System.out.println(loaded);

    }

    private static Map<String, String> readFromFile(Path path) throws IOException {

        Map<String, String> loadedData = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(path) ) {
            String line = reader.readLine();
            while (line != null) {
                String[] values = line.split(",");

                if (values.length != 2) {
                    throw new RuntimeException("Error");
                }

                String name = values[0];
                String lastName = values[1];
                loadedData.put(name, lastName);

                line = reader.readLine();
            }
        } catch (IOException exception) {
            System.out.println("Error");
        }
        return loadedData;
    }
}
