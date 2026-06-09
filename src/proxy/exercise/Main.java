package proxy.exercise;

public class Main {
  public static void main(String[] args) {

    var dbContext = new DbContext();
    var product = dbContext.getProduct(1);


    product.changeName("Updated Name");
    dbContext.saveChanges();

    product.changeName("Another name");
    dbContext.saveChanges();
  }
}
