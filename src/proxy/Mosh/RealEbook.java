package proxy.Mosh;

public class RealEbook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("loading the book: " + fileName);
    }

    public void show(){
        System.out.println("showing the ebook " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
