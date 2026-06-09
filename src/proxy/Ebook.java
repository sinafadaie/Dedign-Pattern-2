package proxy;

public class Ebook {
    private String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){                                         //this is where
        System.out.println("loading the book: " + fileName);     //we actually load the book
    }                                                            //and store it on RAM

    public void show(){
        System.out.println("showing the ebook " + fileName);    //at selection page
    }                                                           //we just need book names

    public String getFileName() {
        return fileName;
    }
}
