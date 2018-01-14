# Tor's uoffisielle ukesoppgaver for Programutvikling (HioA/OsloMet)
## Uke 1 - Collections - Del 1 - List

### List\<T\>, ArrayList\<T\>
`List<T>` er en samling av data med en dynamisk størrelse.
Denne klassen er **generisk**, noe som betyr at den kan brukes med alle referansetyper. (klasser/objekter)

```java
// Opprett en ny liste, hvor T er en referansetype (klasse)
List<T> minListe = new ArrayList<>();

// Ny List av typen String
List<String> list = new ArrayList<>();

// Legg til et element
String name = "Tor";
list.add(name);

// Fjern
list.remove(name);

// Sjekk om et element finnes i listen
boolean finnes = list.exists("Tor");
// eller
boolean finnes = list.exists(name);

// Gå igjennom en Liste, det anbefales å bruke en enhanced for løkke som regel
for(int number : numberList) {
	System.out.println(number + 1);
}

```

```java
// Ny List<T> av typen Integer (denne klassen er en int som er pakket inn i en klasse)
List<Integer> numberList = new ArrayList<>();

numberList.add(42);

// Hvor mange elementer som finnes
int count = numberList.size();

// Hent ut første element i listen
int first = numberList.get(0);

// Siste element
int last = numberList.get(numberList.size() - 1);

// Finn posisjonen til et element i listen
// Hvis elementet ikke finnes vil index få verdien -1
int index = numberList.indexOf(42);

```
Andre nyttige metoder på en liste: **set()**, **toArray()**, **isEmpty()**, **clear()**, **lastIndexOf()** og **stream()**.

Tips: Bruk **Integer** når du skal bruke **int**. **Float** for **float**, **Double** for **double** osv.
*Dette er fordi generiske klasser ikke støtter primitive datatyper direkte.*

## Oppgaver
Fyll inn kode i klassen NameCollection hvor det mangler.
Det anbefales sterkt å laste ned filen og legge den inn IntelliJ (eller Eclipse).
[NameCollection.java](http://nudua.com/files/NameCollection.java) (Lagre som)

```java
public class NameCollection {

    private List<String> names;

    public NameCollection() {
        // Opprett en ny liste og sett den til 'names' variabelen.
    }

    // Legg til et nytt element i listen names
    public void add(String name) {

    }

    // Denne metoden skal fjerne elementet name fra listen.
    public void remove(String name) {

    }

    // Denne metoden skal fjerne alle objektene fra listen names.
    public void removeAll() {

    }

    // Denne metoden skal returnere hvor mange objekter som finnes i listen names.
    public void getCount() {
        // Husk å endre returtypen!
    }

    // Denne metoden skal returnere en 'boolean' som indikerer om elementet finnes i listen eller ikke.
    public void exists(String name) {
        // Husk å endre returtypen!
    }

    // Kun legg til hvis elementet ikke allerede finnes i listen.
    public void addUnique(String name) {

    }

    // Denne metoden skal returnere et 'String' objekt i listen ut i fra indeksen i listen.
    public void get(int index) {
        // Husk å endre returtypen!
    }

    // Fjern første element i listen
    // Hint, sjekk at det faktisk finnes elementer i listen først.
    public void removeFirst() {

    }

    // Fjern siste element i listen
    public void removeLast() {

    }

    // Denne metoden skal sjekke hvor mange ganger et navn forekommer i listen names.
    public void getNameCount(String otherName) {

    }

    // Denne metoden skal returnere en ny 'List<String>' med navn som kun starter på 'name'.
    // *Hint: .startsWith
    public void getNamesThatStartsWith(String name) {

    }


    // Returner en 'List<Integer>' som inneholder lengden på alle elementen i listen names.
    public void getNamesLength() {
        // Husk å endre returtypen!
    }

}
```
Fasit: [NameCollection.java](http://nudua.com/files/NameCollection.java) (Ikke se før du har prøvd)


