# Tor's uoffisielle ukesoppgaver for Programutvikling (OsloMet)
## Uke 2 - Filbehandling med java.nio

```java
// Som sett på forrige side kan vi fange opp Exceptions med en try, catch statement
try {
    BufferedReader reader = Files.newBufferedReader(Paths.get("src/minmappe/fil.txt"));
    // Her må vi eksplisitt kalle metoden reader.close() for å lukke filen.
    reader.close();
} catch (IOException ex) { }

// Men vi kan istedet bruke try-with-resources
// Da vil resurssen automatisk bli 'lukket' etter at try metoden er ferdig.
try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/minmappe/fil.txt"))) { 
    // Alltid bruk try-with-resources der det går!
} catch (IOException ex) { }

// Lese en enkel tekstfil
try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/minmappe/fil.txt"))) {

    String line = "";

    // Les tekstfilen linje for linje til det ikke er flere linjer å lese
    while((line = reader.readLine()) != null) {
        System.out.println(line);
    }

    } catch (NoSuchFileException ex) { // Vi kan også fange opp flere typer Exceptions
        // Filen finnes ikke!
    } catch (IOException ex) { // Hvis noe annet enn 'NoSuchFileException' skjedde
        ex.printStackTrace();
}

// På tilsvarende måte kan du bruke BufferedWriter til å skrive tekst til en fil.
try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(source))) {
    writer.write("MinTekst");
    writer.newLine();
    // Skriver teksten til den faktiske filen.
    writer.Flush();
} catch (IOException ex) { }

// Når du jobber med rene bytes kan du bruke OutputStream og InputStream
InputStream inputStream = Files.newInputStream(Paths.get("src/minmappe/fil.txt");

// Disse klassene bruker et byte[] array for å skrive og lese fra som regel.
byte[] buff = new byte[1024];

// Her får du antall bytes som ble lest inn i buff arrayet
// bytesRead vil være 0 når det ikke fins mer data å lese.
int bytesRead = inputStream.read(buff);

OutputStream outputStream = Files.newOutputStream(Paths.get("src/minmappe/fil.txt");
outputStream.write(buff);
```
### Nyttige metoder i java.nio.Files
java.nio.Files klassen inneholder mange nyttige statiske metoder som gjør ting mye enklere for oss.
```Java
// relativ eller unix stil path
Path src = Paths.get("home/name/file.txt");
// Windows
Path src = Paths.get("C:\\MinMappe\\file.txt");

boolean finnes = Files.exists(src);

List<String> lines = Files.readAllLines(src);
long fileSize = Files.size(src));

// Kopier, kan også kopieres direkte inn i en OutputStream
Files.copy(src, Paths.get("src/ny/file.txt"));

// Flytt
Files.move(src, Paths.get("src/ny/file.txt"));

// Slett
Files.delete(src);
        
// Felles fil/mappe egenskaper
BasicFileAttributes basicAttr = Files.readAttributes(src, BasicFileAttributes.class);
// Windows
DosFileAttributes DOSattr = Files.readAttributes(src, DosFileAttributes.class);
// Linux/Unix/Mac etc.
PosixFileAttributes unixAttr = Files.readAttributes(src, PosixFileAttributes.class);

```
Andre nyttige metoder: `Files.getFileStore`, `Files.getOwner`, `Files.createFile`, `Files.deleteIfExists`, `Files.lines`, `Files.createDirectory`

## Oppgaver
Fyll inn kode i klassen FileUtils hvor det mangler.  
Det anbefales sterkt å laste ned filen og legge den inn IntelliJ (eller Eclipse).  
[FileUtils.java](https://raw.githubusercontent.com/Nudua/programutvikling/master/uke2/oppgaver/FileUtils.java) (Lagre som)


```Java
public class FileUtils {
    
    // Denne statiske metoden skal returnere en boolean som indikerer om begge filene finnes på disken.
    public static void bothExists(String file1, String file2) {
        
    }

    // Bruk try-with-resources og opprett en ny OutputSream som skriver 'data' til den.
    public static void writeBytes(String fileName, byte[] data) {
        
    }

    // Kopier en fil fra 'src' til 'dest', legg til en try-catch som fanger opp NoSuchFileException og IOException.
    public static void copy(String src, Path dest) {
        
    }

    // Flytt en fil fra 'src' til 'dest', men kast exceptionen ut av metoden istedet for en try-catch
    public static void move(String src, Path dest) {
        
    }

    // Sjekk at mappen 'directory' eksisterer, hvis den ikke fins, opprett den.
    public static void createDirectoryIfNotExists(String directory) {
        
    }

    // Denne statiske metoden skal lese tekstdokumentet til 'fileName'
    // Og printe ut hvor mange linjer som er lik verdien i 'value' variabelen.
    public static void lineCount(String fileName, String value) {
        
    }
}
```
Løsningsforslag: [FileUtils.java](https://raw.githubusercontent.com/Nudua/programutvikling/master/uke2/fasit/FileUtils.java) 

# Neste Side: ...