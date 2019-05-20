/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Rafal
 */
public class FileLoader implements Runnable {

    private List<String> linesList;
    private final String filePath;

    public FileLoader(String filePath, List<String> linesList) {
        this.linesList = linesList;
        this.filePath = filePath;
    }

    public void loadSingleFile(String fileName) {
        long startTime = System.nanoTime();
        try {
            List<String> fileLinesList = new ArrayList<>();
            File f = new File(fileName);
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            while ((readLine = b.readLine()) != null) {
                fileLinesList.add(readLine);
            }
            this.linesList.addAll(fileLinesList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(String.format("File %s is loaded | Execution time: %s ms", fileName, timeElapsed / 1000000));
    }

    public List<String> getLinesList() {
        return linesList;
    }

    @Override
    public void run() {
        this.loadSingleFile(filePath);
    }
}
