package com.nudua.uke1.fasit;

import java.util.ArrayList;
import java.util.List;

public class NameCollection {

    private List<String> names;

    public NameCollection() {
        // Opprett en ny liste og sett den til 'names' variabelen.
        names = new ArrayList<>();
    }

    // Legg til et nytt element i listen names
    public void add(String name) {
        names.add(name);
    }

    // Denne metoden skal fjerne elementet name fra listen.
    public void remove(String name) {
        names.remove(name);
    }

    // Denne metoden skal fjerne alle objektene fra listen names.
    public void removeAll() {
        names.clear();
    }

    // Denne metoden skal returnere hvor mange objekter som finnes i listen names.
    public int getCount() {
        return names.size();
    }

    // Denne metoden skal returnere en 'boolean' som indikerer om elementet finnes i listen eller ikke.
    public boolean exists(String name) {
        return names.contains(name);
    }

    // Kun legg til hvis elementet ikke allerede finnes i listen.
    public void addUnique(String name) {
        if(!names.contains(name)) {
            names.add(name);
        }
    }

    // Denne metoden skal returnere et 'String' objekt i listen ut i fra indeksen i listen.
    public String get(int index) {
        return names.get(index);
    }

    // Fjern første element i listen
    // Hint, sjekk at det faktisk finnes elementer i listen først.
    public void removeFirst() {
        if(names.size() > 0) {
            names.remove(0);
        }
    }

    // Fjern siste element i listen
    public void removeLast() {
        if(names.size() > 0) {
            int lastIndex = names.size() - 1;

            names.remove(lastIndex);
        }
    }

    // Denne metoden skal sjekke hvor mange ganger et navn forekommer i listen names.
    public int getNameCount(String otherName) {

        int count = 0;

        for(String name: names) {
            if(name.equals(otherName)) {
                count++;
            }
        }

        return count;
    }

    // Denne metoden skal returnere en ny 'List<String>' med navn som kun starter på 'name'.
    // *Hint: .startsWith
    public List<String> getNamesThatStartsWith(String otherName) {

        List<String> list = new ArrayList<>();

        for(String name : names) {
            if(name.startsWith(otherName)) {
                list.add(name);
            }
        }

        return list;
    }


    // Returner en 'List<Integer>' som inneholder lengden på alle elementen i listen names.
    public List<Integer> getNamesLength() {
        // Husk å endre returtypen!
        List<Integer> nameLengths = new ArrayList<>();

        for(String name : names) {
            nameLengths.add(name.length());
        }

        return nameLengths;
    }

}
