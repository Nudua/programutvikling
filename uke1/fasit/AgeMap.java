package com.nudua.uke1.fasit;

import java.util.*;

public class AgeMap {

    // Nøkkelen her er en String som inneholder et navn
    // Verdien er alderen
    private Map<String, Integer> ages;

    public AgeMap() {
        // Opprett en ny Map<String, Integer> her og sett den til 'ages' feltet
        ages = new HashMap<>();
    }

    // Denne metoden skal legge til et nytt element i 'ages'.
    // Legg til parametere!
    public void add(String key, int alder) {
        ages.put(key, alder);
    }

    // Denne metoden skal fjerne et element i 'ages' utifra nøkkelen.
    // Legg til parametere!
    public void remove(String key) {
        ages.remove(key);
    }

    // Denne metoden skal legge til nye elementer i 'ages' og returnere den gamle verdien hvis den finnes.
    // Legg til parametere og endre retur verdien!
    public int addAndReturnOld(String key, int alder) {
        int age = ages.put(key, alder);

        return age;
    }

    // Denne metoden skal printe ut nøkkelen og alderen til alle elementer i ages.
    public void printInfo() {
        for(Map.Entry<String, Integer> entry : ages.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            System.out.println("Name: " + name + "Age: " + age);
        }
    }

    // Hent ut alle nøkklene i listen og returner de som en List<String>
    public List<String> getKeysAsList() {
        List<String> list = new ArrayList<>();

        for(String key : ages.keySet()) {
            list.add(key);
        }

        return list;
    }

    // Returner en ny Map<String, Integer> med kun de som har en alder over 20 år, husk verdien = alder.
    public Map<String, Integer> getOlderThan20() {

        Map<String, Integer> over20Map = new HashMap<>();

        for(Map.Entry<String, Integer> entry : ages.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            if(age > 20) {
                over20Map.put(name, age);
            }
        }

        return over20Map;
    }

}
