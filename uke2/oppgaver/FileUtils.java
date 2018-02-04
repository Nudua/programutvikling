package com.nudua.uke2.oppgaver;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

    // Denne statiske metoden skal returnere en boolean som indikerer om begge filene finnes på disken.
    public static void bothExists(String file1, String file2) {

    }

    // Bruk try-with-resources og opprett en ny OutputSream som skriver 'data' til den.
    public static void writeBytes(String fileName, byte[] data) {

    }

    // Kopier en fil fra 'src' til 'dest', legg til en try-catch som fanger opp NoSuchFileException og IOException.
    public static void copy(String src, Path dest) {

    }

    // Flytt en fil fra 'src' til 'dest', men kast exceptionen ut av metoden istedet for en try-catch
    public static void move(String src, Path dest) {

    }

    // Sjekk at mappen 'directory' eksisterer, hvis den ikke fins, opprett den.
    public static void createDirectoryIfNotExists(String directory) {

    }

    // Denne statiske metoden skal lese tekstdokumentet til 'fileName'
    // Og printe ut hvor mange linjer som er lik verdien i 'value' variabelen.
    public static void lineCount(String fileName, String value) {

    }
}
