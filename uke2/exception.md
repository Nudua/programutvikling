# Tor's uoffisielle ukesoppgaver for Programutvikling (OsloMet)
## Uke 2 - Exceptions / Checked og Unchecked
`Checked Exception` en *eksepsjonell handling* (exception) som programmet **forventer** at kan skje og kan håndtere og fortsette programmet etterpå.  
I Java er det et **krav** at alle slike exceptions **må fanges opp**.

```java
public static void ReadFirstLine() {
    // Vi bruker try og catch for å fange opp Exceptions.
    try {
        // Hvis filen 'teksdokument.txt' ikke finnes vil programmet 'kaste' en IOException her.
        BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\mappe\\tekstdokument.txt"));

        // Og dermed ikke kjøre linjene under!

        // Les første linje fra tekstdokumentet og gjør noe med det!
        String line = reader.readLine();

        // Vi må alltid 'lukke' filen etter at vi har brukt den
        // Det finnes en bedre måte å gjøre det på som vi kommer tilbake til senere
        reader.close();
    }
    catch (IOException ex) {
        System.out.println("Error! Filen eksisterer ikke!" + ex.getMessage());
    }
}

// Vi kan også velge å kaste en exception ut av metoden, da må den som kaller på metoden fange den.
public static void ReadFirstLine() throws IOException {
    // Hvis filen 'teksdokument.txt' ikke finnes vil programmet 'kaste' en IOException her.
    BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\mappe\\tekstdokument.txt"));
    ...
}

public static void main(String[] args) {
    // Da må vi ha en try, catch statement her istedet.
    try {
            ReadFirstLine();
        } catch (NoSuchFileException ex) {
            // Vi kan også fange opp flere typer Exceptions i en try-catch statement
        } catch (IOException e) {
            e.printStackTrace();
        }
}
```

`Unchecked Exception` er interne feil som programmet vanligvis **ikke kan forutse** eller fortsette programmet fra.  Disse er også kjent som **RuntimeExceptions**.  Disse feilene **bør ikke** fanges opp med en try, catch statement.

```java
public class Person {
    private String petName;

    public Person(Pet pet) {
		
        // Hvis Objektet 'pet' er null her vil vi få en Exception av typen 'NullPointerException'
        petName = pet.getName();

        // Disse typene feil bør vi fange opp med en enkel if test
        // Da vi velge om kan godta at 'pet' kan være null (ikke satt)
        if(pet == null) {
            petName = "Ingen";
        }

        // Det er alltid lurt å validere parameterne til et objekt
        // for å sjekke at de er gyldige eller har verdier som gir mening.
        if(pet == null) {
            // Her kaster vi en Exception av typen NullPointerException med 'throw' nøkkelordet.
            throw new NullPointerException("myPet cannot be null");
        }

        // Denne typen sjekk er så vanlig at det fins en innebygd funksjon for dette.
        Pet myPet = Objects.requireNonNull(pet);

        // Hvis du kun vil sjekke at noe er ikke er null bruker denne
        Objects.requireNonNull(pet);
    }
}

// Andre vanlige Unchecked Exceptions
int[] arr = {0,1,2};

int indeks = -1;

// Her vil vi få en 'ArrayIndexOutOfBoundsException' fordi -1 ikke er innenfor tabellen.
int utenfor = arr[indeks];

int teller = 2;
int nevner = 0;

// Her får vi en 'ArithmeticException': divide by zero
int resultat = teller / nevner;
```
Vanlige exceptiontyper: `RuntimeException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`

*"Exceptions are, as their name implies, to be used only for exceptional conditions; they should never be used for ordinary control flow".  
\- Effective Java: Item 69*

Det fins også en tredje type exception, **Error**, dette er såpass alvorlige feil at det ikke er mulig at program skal fortsette, f.eks `OutOfMemoryError`, `StackOverflowError`. Disse typene **bør aldri** fanges opp.

## Oppgaver
Fyll inn kode i klassen ExceptionalClass hvor det mangler.  
Det anbefales sterkt å laste ned filen og legge den inn IntelliJ (eller Eclipse).  
[ExceptionalClass.java](https://raw.githubusercontent.com/Nudua/programutvikling/master/uke2/oppgaver/ExceptionalClass.java) (Lagre som)

```Java
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
    public static void readAllLines2(String fileName) {
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
```
Løsningsforslag: [ExceptionalClass.java](https://raw.githubusercontent.com/Nudua/programutvikling/master/uke2/fasit/ExceptionalClass.java)  

# [Neste Side: Filbehandling](https://github.com/Nudua/programutvikling/blob/master/uke2/filbehandling.md) #