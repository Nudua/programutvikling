package com.nudua.uke2.fasit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class ExceptionalClass {

    private List<String> list;
    private int index;

    // Kast en Exception (som er relevant) for alle parameterne som ikke er gyldige.
    // 1. 'list' skal ikke være null, størrelsen skal ikke være negativ eller større enn 1000.
    // 2. 'index' skal ikke være utenfor størrelsen til 'list'.
    // 3. sett datafeltene 'list' og 'index' til parameterne hvis de er gyldige.
    public ExceptionalClass(List<String> list, int index) {
        if(list == null) {
            throw new NullPointerException("list cannot be null");
        }

        // Eller
        this.list = Objects.requireNonNull(list);

        if(index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException();
        }

        this.index = index;
    }


    // Legg til en try, catch statement rundt metoden.
    public static void readAllLines(String fileName) {
        // Denne metoden kaster en bla. NoSuchFileException og IOException.
        try {
            Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ikke bruk try-catch her, men kast exceptionen ut av metoden.
    public static void readAllLines2(String fileName) throws IOException {
        // Denne metoden kaster en bla. NoSuchFileException og IOException.
        Files.readAllLines(Paths.get(fileName));
    }

    // Skriv om metoden til å ikke bruke en try, catch statement.
    public static int divide(int teller, int nevner) {

        // Vi har ikke lov til å dele på 0!
        // Det er opp til deg å velge hvordan du vil håndtere dette.
        if(nevner == 0) {
            // Enten ved å returnere 0
            return 0;
        } else {
            return teller / nevner;
        }

        // Alternativ
        if(nevner == 0) {
            // Eller ved at du kaster en exception
            throw new IllegalArgumentException("nevner kan ikke være 0");
        } else {
            return teller / nevner;
        }
    }

    // Legg sammen verdiene i tabellene kun hvis begge tabellene ikke er null og har samme lengde, kast en exception ellers.
    // Returner en ny tabell som inneholder summen av hvert par i tabellene.
    public static int[] addArrays(int[] a, int[] b) {

        if(a == null || b == null) {
            throw new NullPointerException("a or b cannot be null");
        }

        if(a.length != b.length) {
            throw new IllegalArgumentException("a and b cannot be of a different length");
        }

        // Nå vet vi at a og b ikke er null, og at de har samme lengde.
        int[] parSum = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            parSum[i] = a[i] + b[i];
        }

        return parSum;
    }
}
