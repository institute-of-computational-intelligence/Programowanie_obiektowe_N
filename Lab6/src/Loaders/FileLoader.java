package Loaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader implements Runnable {
    String fileName;
    List<String> linesListGlobal;

    public FileLoader(String fileName, List<String> linesListGlobal) {
        this.fileName = fileName;
        this.linesListGlobal = linesListGlobal;
    }
    
    public void loadSingleFile(String fileName) {
        long startTime = System.nanoTime();
        try {
            
            File f;
            List<String> fileLinesLocal = new ArrayList<>();
            f = new File(fileName);
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            while ((readLine = b.readLine()) != null) {
                fileLinesLocal.add(readLine);
            }
            linesListGlobal.addAll(fileLinesLocal);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(String.format("File %s is loaded | Execution time: %s ms", fileName, timeElapsed / 1000000));
    }

    @Override
    public void run() {
        this.loadSingleFile(this.fileName);
    }
}
