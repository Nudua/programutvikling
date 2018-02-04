package com.nudua.uke2.fasit;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.*;
import java.nio.file.attribute.FileAttributeView;
import java.util.List;

public class FileUtils {

    // Denne statiske metoden skal returnere en boolean som indikerer om begge filene finnes på disken.
    public static boolean bothExists(String file1, String file2) {
        return Files.exists(Paths.get(file1)) && Files.exists(Paths.get(file2));
    }

    // Bruk try-with-resources og opprett en ny OutputSream som skriver 'data' til den.
    public static void writeBytes(String fileName, byte[] data) {
        try(OutputStream outputStream = Files.newOutputStream(Paths.get(fileName))) {
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Kopier en fil fra 'src' til 'dest', legg til en try-catch som fanger opp NoSuchFileException og IOException.
    public static void copy(String src, Path dest) {
        try {
            Files.copy(Paths.get(src), dest);
        } catch(NoSuchFileException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Flytt en fil fra 'src' til 'dest', men kast exceptionen ut av metoden istedet for en try-catch
    public static void move(String src, Path dest) throws IOException {
        Files.move(Paths.get(src), dest);
    }

    // Sjekk at mappen 'directory' eksisterer, hvis den ikke fins, opprett den.
    public static void createDirectoryIfNotExists(String directory) {
        Path directoryPath = Paths.get(directory);

        if(!Files.exists(directoryPath)) {
            try {
                Files.createDirectory(directoryPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Denne statiske metoden skal lese tekstdokumentet til 'fileName'
    // Og printe ut hvor mange linjer som er lik verdien i 'value' variabelen.
    public static void lineCount(String fileName, String value) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get(fileName));

            int count = 0;

            for(String line : allLines) {
                if(line.equals(value)) {
                    count++;
                }
            }

            System.out.println("Count:" + count);

        } catch (NoSuchFileException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
