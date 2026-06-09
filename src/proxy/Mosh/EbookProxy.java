package proxy.Mosh;

public class EbookProxy implements Ebooks{
    private RealEbook book;         //the point is here, we don't initiate the field
    private String fileName;

    public EbookProxy(String bookName) {
        this.fileName = bookName;
    }

    @Override
    public void show() {
        if (book == null){
            book = new RealEbook(fileName);   //we load the book here
        }                                 //this is lazy initialization
        book.show();                      //initiate on demand
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
