package com.nudua.uke1.oppgaver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NameSet {

    private Set<String> names;
    public NameSet() {
        // Opprett et nytt set av typen String her
    }

    // Denne metoden skal legge til 'name' til settet 'names'
    // returner en boolean som indikerer om navnet ble lagt til eller ikke
    public void add(String name) {
        // Husk å bytte returntype fra void!
    }

    // Denne metoden skal fjerne 'name' fra settet 'names'
    // returner en boolean som indikerer om navnet ble fjernet eller ikke
    public void remove(String name) {

    }

    // Kopier Settet 'names' til et array og returner det
    public void copyToArray() {
        // Husk å bytte returntype fra void!
    }

    // Returner et nytt Set<String> fra arrayet 'arr', med kun unike elementer
    public static void fromArray(String[] arr) {

    }

    // Returner en boolean som sjekker om alle navnene i names finnes i peopleSet
    public void existsAll(List<String> otherNames) {

    }

    // Returner et Set<Character> med den første bokstaven av alle navnene
    public void getFirstLetterOfAll() {

    }
}
