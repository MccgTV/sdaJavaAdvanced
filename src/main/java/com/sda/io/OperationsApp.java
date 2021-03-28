package com.sda.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class OperationsApp {
    public static void main(String[] args) {

        Path relativePath = Paths.get("input.txt");
        System.out.println(relativePath + " istnieje: " + Files.exists(relativePath));

        Path projectRootDirectory = Paths.get("C:\\Users\\Mccg\\IdeaProjects\\java_zaawansowana_sda");
        Path inputPath = projectRootDirectory.resolve("input.txt");
        System.out.println(inputPath + " jest plikiem " + Files.isRegularFile(inputPath));

        Path path = Paths.get("C", "Windows", "system.ini");
        System.out.println("Zapis do pliku " + path + ": " + Files.isWritable(path));

        Path path1 = Paths.get("C:\\Users\\Mccg\\IdeaProjects\\java_zaawansowana_sda");
        try {
            Set<Path> pathSet = Files.list(path1)
                    .collect(Collectors.toSet());
            System.out.println(pathSet.toString());
        } catch (IOException ioe) {
            System.out.println("Był błąd IOException, ale jest ok " + ioe);
        }
    }
}
