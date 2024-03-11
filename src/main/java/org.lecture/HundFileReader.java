package org.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HundFileReader {

    public static List<Hundi> dogfile (String fileName) throws IOException {
        Path path = Paths.get("src","main","resources",fileName);
        if (!Files.exists(path)){
            System.out.println("Datei existiert nicht " + path);
        }
        List<String> allLines = Files.readAllLines(path);
            allLines.removeFirst();

        List<Hundi> hundis = new ArrayList<>();
        for (String line : allLines){
            String[] parts = line.split(",");
            Hundi hundi = new Hundi.dogBuilder().name(parts[0]).age(Integer.parseInt(parts[1])).breed(parts[2]).build();
            hundis.add(hundi);
        }
        return hundis;
    }
}
