package Loaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileLoader implements Runnable{
    private List<String> linesList;
    private String filePath;

    public List<String> getLinesList() {
        return linesList;
    } 

    public void setLinesList(List<String> linesList) {
        this.linesList = linesList;
    }    
    public FileLoader(String filePath, List<String> linesList) {
        this.linesList = linesList;
        this.filePath =filePath;
    }    

    @Override
    public void run() {
        loadSingleFile(filePath);
    }
    
    public void loadSingleFile(String fileName){
        long startTime = System.nanoTime();
        try{
            List<String> fileLinestList = new ArrayList<>();
            File f = new File(fileName);
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            while((readLine = b.readLine()) != null){
                fileLinestList.add(readLine);
            }
            this.linesList.addAll(fileLinestList);
            
        } catch(IOException e){
            e.printStackTrace();
        }
        long endtime = System.nanoTime();
        long timeElapsed = endtime - startTime;
        System.out.println(String.format("File %s is loaded | Execution time: %s ms", fileName, timeElapsed / 1000000));
    }
    
}
