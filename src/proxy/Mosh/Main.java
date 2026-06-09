package proxy.Mosh;


import java.util.List;

public class Main {
    public static void main(String[] args){

        Library library = new Library();

        List<String> books = List.of("book1", "book2", "book3", "book4");

        for (var book:books){
            EbookProxy ebook = new EbookProxy(book);
            library.add(ebook);
        }

        library.openEbook("book3");         //just load book3!


    }
}
