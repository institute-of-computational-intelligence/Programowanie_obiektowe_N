/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Rafal
 */
public class Searcher {

    private final List<String> linesList;

    public Searcher() {
        this.linesList = Collections.synchronizedList(new ArrayList<>());
    }

    public List<String> Search(String searchValue) {
        List<String> resultLines = linesList
                .stream()
                .filter(line -> line.contains(searchValue))
                .collect(Collectors.toList());
        return resultLines;
    }

    public List<String> getLinesList() {
        return linesList;
    }

}
