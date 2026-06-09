package proxy.Mosh;


import java.util.HashMap;
import java.util.Map;

public class Library {

    Map <String, Ebooks> ebooks= new HashMap<>();   //we should use Interface here
                                                    //so tomorrow when we change proxy
                                                    //we don't need to modify this class

    public void add(Ebooks ebook){
        ebooks.put(ebook.getFileName(),ebook);
    }

    public void openEbook(String fileName){
        ebooks.get(fileName).show();            //when we use openEbook on library
    }                                           //he use show(), and load the book obj

}
