package po_n_lab6;

import Loaders.FileLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import utils.Parsers;

public class PO_N_Lab6 {

    public static void main(String[] args) throws IOException {
        String folderPath = "path to folder";
        File folder = new File(folderPath);
        List<File> listOfFiles = Arrays.asList(folder.listFiles());
        Searcher searcher = new Searcher();

        long startTime = System.nanoTime();
        ExecutorService executorService = Executors.newCachedThreadPool();
        listOfFiles.forEach((file) -> {
            executorService.execute(new FileLoader(file.getPath(), searcher.getLinesList()));
        });
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(String.format("Loading all files (%d) complete. | Execution time: %s ms", listOfFiles.size(), timeElapsed / 1000000));
        boolean exit = false;
        while (!exit) {
            System.out.println("");
            System.out.println("1. Search dataset");
            System.out.println("2. Exit");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String responseStr = br.readLine();
            int response = -1;
            if (Parsers.tryParseToInt(responseStr)) {
                response = Integer.parseInt(responseStr);
            }
            switch (response) {
                case 1: {
                    System.out.println("Enter search value");
                    String searchValue = br.readLine();
                    List<String> resultLines = searcher.Search(searchValue);
                    resultLines.forEach(ln -> {
                        System.out.println(ln);
                        System.out.println("");
                    });
                    break;
                }
                case 2: {
                    exit = true;
                    break;
                }
                default: {
                    return;
                }
            }
        }
    }

}
