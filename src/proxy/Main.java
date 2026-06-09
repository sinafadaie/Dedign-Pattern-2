package proxy;

import java.util.List;

public class Main {
    public static void main(String[] args){

        Library library = new Library();

        List<String> books = List.of("book1", "book2", "book3", "book4");

        for (var book:books){
            Ebook ebook = new Ebook(book);
            library.add(ebook);                //these steps simulating real app,
        }                                      //a real app the library from disk

        library.openEbook("book3");   //user probably just open one book
                                               //but we load all the books!

    }
}
