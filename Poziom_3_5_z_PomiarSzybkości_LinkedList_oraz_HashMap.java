import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
 
/*
Część 1
Stwórz klasę reprezentującą książkę o nazwie Book. Klasa powinna mieć dwa pola: author oraz title.
 Pamiętaj o implementacji metod hashCode() oraz equals(Object o).
 Będziemy jej używali jako obiektów kolekcji LinkedList.
 
Stwórz program, który zmierzy czas operacji
wyszukiwania i usunięcia obiektu na początku (z użyciem metody remove(Object o)),
wyszukiwania i usunięcia obiektu na końcu (z użyciem metody remove(Object o)),
wstawiania na początku
oraz wstawiania na kończy listy LinkedList liczącej kilka milionów obiektów.
 
Część 2
Stwórz program, który zmierzy czas operacji
wyszukiwania po kluczu,
a także czas dodawania
i usuwania obiektu z mapy HashMap liczącej kilka milionów obiektów
 
Link do rezultatu wklej poniżej i wyślij do mentora.
*/
class Kodilla {
    public static void main(String[] args) {
        // your code goes here
 
        // nazwy obiektow z malej litery, tylko nazwy klas z duzej:)
        // konoMysterygaSugoi
        List<Book> KonoMysterygaSugoi = new LinkedList<>();
        KonoMysterygaSugoi.add(new Book("The Main", "Trevanian"));
        KonoMysterygaSugoi.add(new Book("Presumed Innocent", "Scott Turow"));
        KonoMysterygaSugoi.add(new Book("A Taste for Death", "P. D. James"));
        KonoMysterygaSugoi.add(new Book("Traverse of the Gods", "Bob Langley"));
        KonoMysterygaSugoi.add(new Book("Strega", "Andrew Vachss"));
        KonoMysterygaSugoi.add(new Book("The Sisters", "Robert Littell"));
        KonoMysterygaSugoi.add(new Book("Late Payments", "Michael Z. Lewin"));
        KonoMysterygaSugoi.add(new Book("Hooligans", "William Diehl"));
        KonoMysterygaSugoi.add(new Book("A Dark-Adapted Eye", "Barbara Vine"));
        KonoMysterygaSugoi.add(new Book("The Silence of the Lambs", "Thomas Harris"));
        KonoMysterygaSugoi.add(new Book("Memoirs of an Invisible Man", "H. F. Saint"));
        KonoMysterygaSugoi.add(new Book("Densetsu Naki Chi (伝説なき地)", "Yoichi Funado"));
        KonoMysterygaSugoi.add(new Book("Soshite Yoru wa Yomigaeru (そして夜は甦る)", "Ryo Hara (ja)"));
        KonoMysterygaSugoi.add(new Book("Tasogare no Berurin (黄昏のベルリン)", "Mikihiko Renjo"));
        KonoMysterygaSugoi.add(new Book("Berurin Hiko Shirei (ベルリン飛行指令)", "Joh Sasaki"));
        KonoMysterygaSugoi.add(new Book("Iho no Kishi (異邦の騎士)", "Soji Shimada"));
        KonoMysterygaSugoi.add(new Book("Futari Okajima (ja)", "Soshite Tobira ga Tozasareta (そして扉が閉ざされた)"));
        KonoMysterygaSugoi.add(new Book("Meirokan no Satsujin (迷路館の殺人)", "Yukito Ayatsuji"));
        KonoMysterygaSugoi.add(new Book("Mippei Kyoshitsu (密閉教室)", "Rintaro Norizuki"));
        KonoMysterygaSugoi.add(new Book("Samayoeru Nozui (さまよえる脳髄)", "Go Osaka"));
        KonoMysterygaSugoi.add(new Book("Daburu Suchiru (ダブル・スチール)", "Yoshinaga Fujita"));
 
        long begin = System.nanoTime();
        // analogicznie co ponizej,
        // przetestowales metodę o sygnaturze: "remove(int index)", a oni chcieli w zadaniu "remove(Object o)"
        // zamiast podawać index, powinieś podac obiekt do usunięcia:
        // Book last = new Book("Daburu Suchiru (ダブル・スチール)", "Yoshinaga Fujita")
        // inne add..
        // konoMysterygaSugoi.add(last);
        // konoMysterygaSugoi.remove(last);
        KonoMysterygaSugoi.remove(KonoMysterygaSugoi.size() - 1);
        long end = System.nanoTime();
        System.out.println("Removing element at the end of the collection has taken: " + (end - begin) + "ns");
 
        // przetestowales metodę o sygnaturze: "remove(int index)", a oni chcieli w zadaniu "remove(Object o)"
        // zamiast podawać index, powinieś podac obiekt do usunięcia, czyli
        // tam gdzie dodajesz ksiazke "The Main" to dodaj ją pierw tworząc obiekt (zeby miec do niego referencje)
        // i moc to potem usunac:
        // Book first = new Book("The Main", "Trevanian");
        // konoMysterygaSugoi.add(first);
        // inne add..
        // konoMysterygaSugoi.remove(first);
        begin = System.nanoTime();
        KonoMysterygaSugoi.remove(0);
        end = System.nanoTime();
        System.out.println("Removing element at the start of the collection has taken: " + (end - begin) + "ns");
 
        Map<Integer, Integer> kobayashiMaru = new HashMap<>();
        Random randomGenerator = new Random();
        int MAX_KOBAYASHIMARU = 7483647;
        for (int i = 0; i < MAX_KOBAYASHIMARU; i++) {
            kobayashiMaru.put(i, randomGenerator.nextInt(101));
        }
        begin = System.nanoTime();
        kobayashiMaru.get(99);
        end = System.nanoTime();
        System.out.println("Searching key number: 99 in: " + kobayashiMaru.size() + " list long, in: " + (end - begin) + "ns");
 
        begin = System.nanoTime();
        kobayashiMaru.put(MAX_KOBAYASHIMARU, 99);
        end = System.nanoTime();
        System.out.println("Adding new element in: " + MAX_KOBAYASHIMARU + " position in list: " + kobayashiMaru.size() + " long, in: " + (end - begin) + "ns");
 
        // sprawdzasz, jak spadnie wydajnosc jak juz jest element i zastępuje? cool
        begin = System.nanoTime();
        kobayashiMaru.put(MAX_KOBAYASHIMARU, 99);
        end = System.nanoTime();
        System.out.println("Adding new element in: " + MAX_KOBAYASHIMARU + " position in list currently: " + kobayashiMaru.size() + " long, in: " + (end - begin) + "ns");
 
        begin = System.nanoTime();
        kobayashiMaru.remove(MAX_KOBAYASHIMARU, 99);
        end = System.nanoTime();
        System.out.println("Removing element: " + MAX_KOBAYASHIMARU + " in list: " + kobayashiMaru.size() + " long, in: " + (end - begin) + "ns");
 
 
    }
}
 
class Book {
    private String title;
    private String author;
 
    public Book(final String title, final String author) {
        this.title = title;
        this.author = author;
    }
 
    public String getTitle() {
        return this.title;
    }
 
    public String getAuthor() {
        return this.author;
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        final Book book = (Book) obj;
        return this.title.equals(book.getTitle()) &&
                this.author.equals(book.getAuthor());
    }
}