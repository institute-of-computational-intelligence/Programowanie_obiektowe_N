
package lab_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Searcher {
    private final List<String> linesList;

    public List<String> getLinesList() {
        return linesList;
    }


    public Searcher(){
        this.linesList = Collections.synchronizedList(new ArrayList<>());
    }
    
    public List<String> Search(String searchValue) {
        List<String> resultLines = linesList
                .stream()
                .filter(line ->line.contains(searchValue))
                .collect(Collectors.toList());
        
        return resultLines;      
    }
    
}
