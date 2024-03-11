package org.lecture;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class CSVCleaner {
    /**
     * Loads all Lines from a File into the Storage
     * @param location the path located in Resources folder
     * @return all Lines as List of Strings
     * @throws IOException if file not Found
     */
    private static List<String> loadFile(Path location) throws IOException {
        if(Files.notExists(location))
            throw new IOException("File not Found");
        List<String> lines =  Files.readAllLines(location);

        return lines;
    }

    /**
     * Refectors all Lines and replaces ';' with ','
     * @param loadedLines the lines you want to refactor
     * @return a List of cleaned up Lines
     */
    private static List<String> cleanUp(List<String> loadedLines) {
        //replace all ";" with ","
        LinkedList<String> newLines = new LinkedList<>();
        loadedLines.forEach(line -> {
            String refLine= line.replace(","," ");
            refLine = refLine.replace(";",",");
            refLine = refLine.replace(",,",",.,");
            newLines.add(refLine);
        });
        return newLines;
    }

    /**
     * Saves files to the location
     */
    private static void createCleanedFile(List<String> lines, Path location){
        try(BufferedWriter writer = Files.newBufferedWriter(location)) {
            for(String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Loads a File and Creates the refectored file all ";" are replaces with ","
      * @param fileName the filename located in Resources folder
     * @throws IOException if file not found
     */
    public static void doCleanupProcess(String fileName) throws IOException {
        Path source = Paths.get("src","main","resources",fileName);
        Path destination = Paths.get("src","main","resources","Refectored_"+fileName);
        List<String> cleanLines = cleanUp(loadFile(source));
        createCleanedFile(cleanLines,destination);
    }




}
