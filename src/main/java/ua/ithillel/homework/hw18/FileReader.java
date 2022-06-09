package ua.ithillel.homework.hw18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileReader {

    List<String[]> read(String path) {
        List<String> returnList = new ArrayList<>();
        try (Stream<String> lineStream = Files.newBufferedReader(Paths.get(path)).lines()) {
            returnList = lineStream.toList();
        } catch (IOException exception) {
            System.out.println("SWW");
        }
        List<String[]> arr = new ArrayList<>();
        for (int i = 0; i < returnList.size(); i++) {
            arr.add(returnList.get(i).split("\\|"));
        }
        return arr;
    }
}
