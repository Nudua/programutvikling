# Tor's uoffisielle ukesoppgaver for Programutvikling (HioA/OsloMet)
## Uke 1 - Set\<T\>, HashSet\<T\>
`Set<T>` er en samling av data med en dynamisk størrelse, denne er svært like `List<T>` med enkelte unntak.

Denne klassen er **generisk**, noe som betyr at den kan brukes med alle referansetyper. (klasser/objekter)

I motsetning til List<T> kan et Set **ikke inneholde duplikater** og den kan ikke garantere hvor i settet elementene befinner seg, den støtter derfor ikke indeksering.

```java
// Opprett ett nytt Set<T>, hvor T er en referansetype (klasse)
Set<T> minListe = new HashSet<>();

// Opprett ett nytt Set av typen Float (en innpakket float)
Set<Float> floatSet = new HashSet<>();

// Definerer en 'innpakket' float
Float f = 1.0f;

// I et Set vil add metoden kun legge til et element hvis det ikke allerede finnes.
boolean wasAdded = floatSet.add(f);
// wasAdded = true

// Hvis vi prøver å legge til samme element flere ganger vil det ikke bli lagt til
wasAdded = floatSet.add(f);
// wasAdded = false

// Vi kan heller ikke aksessere et set via Indekser som vi kan som en List<T>
// Derfor finnes ikke metodene get(), set(), indexOf() osv.

```
Andre nyttige metoder for et Set: **containsAll()**, **toArray()**, **isEmpty()**, **clear()**, og **stream()**.

Tips: Bruk **Integer** når du skal bruke **int**. **Float** for **float**, **Double** for **double** osv.


*Dette er fordi generiske klasser ikke støtter primitive datatyper direkte.*  

## Oppgaver
Fyll inn kode i klassen hvor det mangler.
Det anbefales sterkt å laste ned filen og legge den inn IntelliJ (eller Eclipse).
[NameSet.java](http://nudua.com/files/NameCollection.java) (Lagre som)

```java
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
```
Fasit: [NameSet.java](http://nudua.com/files/NameCollection.java) (Ikke se før du har prøvd)


# [Neste Side: Map](https://github.com/Nudua/programutvikling/blob/master/uke1/map.md) #