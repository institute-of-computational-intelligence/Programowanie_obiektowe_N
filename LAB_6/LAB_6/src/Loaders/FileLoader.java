
package Loaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class FileLoader implements Runnable{
    //private List<String>linesList;
    private String fileName;
    List<String> linesList;
    /*
    public FileLoader() {
        linesList = new ArrayList<>();
    }
/*/
    public FileLoader(String fileName, List<String> linesList) {
       this.fileName = fileName;
       this.linesList = linesList;
    }
    
    public void loadSingleFile (String fileName){
        long startTime = System.nanoTime();
        try{
            List <String> fileLinesList = new ArrayList<>();
            File f = new File(fileName);
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine ="";
            while ((readLine = b.readLine()) != null){
                fileLinesList.add(readLine);
            }
            this.linesList.addAll(fileLinesList);
        }catch(IOException e){
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println(String.format("File %s is loaded | Execution time: %s ms", fileName, timeElapsed/100000));
    }
    
    @Override
    public void run(){
       this.loadSingleFile(this.fileName);
    }
    
}
