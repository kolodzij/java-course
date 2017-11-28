package com.kodilla.exception.io;

import com.sun.deploy.util.SystemUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());

       // System.out.println(file.getPath());

        //Path path = Paths.get("file/names.txt");
        Path path = Paths.get(file.getPath());

        try {
            Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException();
            // System.out.println("Something wrong! Error: " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }

}