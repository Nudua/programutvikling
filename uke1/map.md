# Tor's uoffisielle ukesoppgaver for Programutvikling (HioA/OsloMet)
## Uke 1 - Map\<T\>, HashMap\<T\>
`Map<K,V>` Hvor 'K' står for Key og 'V' for value. En Map brukes for å hente ut verdier ut i fra en nøkkel.
Denne klassen er **generisk**, noe som betyr at den kan brukes med alle referansetyper. (klasser/objekter)

```java
// Opprett ett nytt Map<K,V>, K = nøkkelen, V = verdien, kan brukes med alle referansetyper.
Map<K,V> minListe = new HashMap<>();

// Oppretter en ny 'Map' med en Integer som nøkkeltypen og en String som verditypen.
Map<Integer, String> nameMap = new HashMap<>();

// For å legge til elementer bruker vi 'put' metoden.
nameMap.put(0, "Tor");

// Hvis vi overskriver et element med samme nøkkel som før vil put returnere det gamle objektet
// oldValue vil være null hvis elementet ikke finnes fra før av
String oldValue = nameMap.put(0, "Bob");

// For å hente ut verdien bruker vi 'get' metoden med 'nøkkelen' som parameter.
String value = nameMap.get(0);

// Iterasjon over en Map
// Når du trenger både nøkkelen og verdien
for(Map.Entry<Integer, String> entry : nameMap.entrySet()) {
	int key = entry.getKey();
	String value = entry.getValue();
}

// Hvis du kun trenger nøklene
for(int key : nameMap.keySet()) {
}

// Kun verdiene
for(String value : nameMap.values()) {
}

// Fjern elementet med nøkkelen '0'
nameMap.remove(0);

// Slett alle elementene
nameMap.clear();

// Antall elementer i Map'en
nameMap.size();


```
Andre nyttige metoder: **isEmpty()**, **replace()** og **stream()**.

Tips: Bruk **Integer** når du skal bruke **int**. **Float** for **float**, **Double** for **double** osv.
*Dette er fordi generiske klasser ikke støtter primitive datatyper direkte.*

## Oppgaver
Fyll inn kode i klassen NameSet hvor det mangler.
Det anbefales sterkt å laste ned filen og legge den inn IntelliJ (eller Eclipse).
[AgeMap.java](http://nudua.com/files/AgeMap.java) (Lagre som)

```java
public class AgeMap {

    // Nøkkelen her er en String som inneholder et navn
    // Verdien er alderen
    private Map<String, Integer> ages;

    public AgeMap() {
        // Opprett en ny Map<String, Integer> her og sett den til 'ages' feltet
    }

    // Denne metoden skal legge til et nytt element i 'ages'.
    // Legg til parametere!
    public void add() {

    }

    // Denne metoden skal fjerne et element i 'ages' utifra nøkkelen.
    // Legg til parametere!
    public void remove() {

    }

    // Denne metoden skal legge til nye elementer i 'ages' og returnere den gamle verdien hvis den finnes.
    // Legg til parametere og endre retur verdien!
    public void addAndReturnOld() {

    }

    // Denne metoden skal printe ut nøkkelen og alderen til alle elementer i ages.
    public void printInfo() {

    }

    // Hent ut alle nøkklene i listen og returner de som en List<String>
    public void getKeysAsList() {

    }

    // Returner en ny Map<String, Integer> med kun de som har en alder over 20 år, husk verdien = alder.
    public void getOlderThan20() {

    }
}
```
Fasit: [AgeMap.java](http://nudua.com/files/NameCollection.java) (Ikke se før du har prøvd)


# Neste Side: Kommer Snart ... #