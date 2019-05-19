package Loaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileLoader implements Runnable{
    private List<String> linesList;

    public FileLoader() {
        linesList = new ArrayList<>();
    }
    

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void loadSingleFile(String fileName){
        long startTime = System.nanoTime();
        try{
            List<String> fileLinestList = new ArrayList<>();
            File f = new File(fileName);
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            while((readLine = b.readLine()) != null){
                fileLinesList.add(readLine);
            }
            this.linesList.addAll(fileLinesList);
            
        } catch(IOException e){
            e.printStackTrace();
        }
        long endtime = System.nanoTime();
        long timeElapsed = endtime - startTime;
        System.out.println(String.format("File %s is loaded | Execution time: %s ms", fileName, timeElapses / 1000000));
    }
    
}
