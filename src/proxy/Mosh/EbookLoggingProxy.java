package proxy.Mosh;

public class EbookLoggingProxy implements Ebooks {

        private RealEbook book;
        private String fileName;

        public EbookLoggingProxy(String bookName) {
            this.fileName = bookName;
        }

        @Override
        public void show() {
            if (book == null){
                book = new RealEbook(fileName);
            }

            System.out.println("implement some logging logic");
            book.show();
        }

        @Override
        public String getFileName() {
            return fileName;
        }
    }


