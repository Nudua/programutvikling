package com.nudua.uke1.fasit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NameSet {

    private Set<String> names;
    public NameSet() {
        // Opprett et nytt set av typen String her
        names = new HashSet<>();
    }

    // Denne metoden skal legge til 'name' til settet 'names'
    // returner en boolean som indikerer om navnet ble lagt til eller ikke
    public boolean add(String name) {
        // Husk å bytte returntype fra void!
        return names.add(name);
    }

    // Denne metoden skal fjerne 'name' fra settet 'names'
    // returner en boolean som indikerer om navnet ble fjernet eller ikke
    public boolean remove(String name) {
        return names.remove(name);
    }

    // Kopier Settet 'names' til et array og returner det
    public String[] copyToArray() {
        // Husk å bytte returntype fra void!
        return (String[])names.toArray();
    }

    // Returner et nytt Set<String> fra arrayet 'arr', med kun unike elementer
    public static Set<String> fromArray(String[] arr) {
        Set<String> set = new HashSet<>();

        for(String n : arr) {
            set.add(n);
        }

        return set;
    }

    // Returner en boolean som sjekker om alle navnene i names finnes i peopleSet
    public boolean existsAll(List<String> otherNames) {
        return names.containsAll(otherNames);
    }

    // Returner et Set<Character> med den første bokstaven av alle navnene
    public Set<Character> getFirstLetterOfAll() {
        Set<Character> charSet = new HashSet<>();

        for(String name : names) {
            charSet.add(name.charAt(0));
        }

        return charSet;
    }
}
