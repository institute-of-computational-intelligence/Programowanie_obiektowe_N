package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Searcher {
    private List<String> linesList;
    
    public Searcher(){
        this.linesList =  Collections.synchronizedList(new ArrayList<String>());
    }
    
    public List<String> getLinesList(){
        return this.linesList;
    }
    
    public List<String> Search(String searchValue) {
        List<String> resultLines = linesList
                .stream()
                .filter(line -> line.contains(searchValue))
                .collect(Collectors.toList());
        return resultLines;
    }
}