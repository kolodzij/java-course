package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ExceptionModuleRunner {
    public static void main(String args[]) {

        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
        /*
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();

        try {
            fileReader.readFile();
        } catch (IOException e) {
            System.out.println("Something wrong! Error: " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
*/
    }
}
