package com.nudua.uke2.oppgaver;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionalClass {

    private List<String> list;
    private int index;

    // Kast en Exception (som er relevant) for alle parameterne som ikke er gyldige.
    // 1. 'list' skal ikke være null, størrelsen skal ikke være negativ eller større enn 1000.
    // 2. 'index' skal ikke være utenfor størrelsen til 'list'.
    // 3. sett datafeltene 'list' og 'index' til parameterne hvis de er gyldige.
    public ExceptionalClass(List<String> list, int index) {

    }


    // Legg til en try, catch statement rundt metoden.
    public static void readAllLines(String fileName) {
        // Denne metoden kaster en bla. NoSuchFileException og IOException.
        Files.readAllLines(Paths.get(fileName));
    }

    // Ikke bruk try-catch her, men kast exceptionen ut av metoden.
    public static void readAllLines(String fileName) {
        // Denne metoden kaster en bla. NoSuchFileException og IOException.
        Files.readAllLines(Paths.get(fileName));
    }

    // Skriv om metoden til å ikke bruke en try, catch statement.
    public static int divide(int teller, int nevner) {
        // Aldri gjør dette på 'unchecked' exceptions!
        try {
            return teller / nevner;
        } catch (ArithmeticException exception) {
            return 0;
        }
    }

    // Legg sammen verdiene i tabellene kun hvis begge tabellene ikke er null og har samme lengde, kast en exception ellers.
    // Returner en ny tabell som inneholder summen av hvert par i tabellene.
    public static void addArrays(int[] a, int[] b) {

    }
}
