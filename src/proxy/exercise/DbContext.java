package proxy.exercise;

import java.util.HashMap;
import java.util.Map;

public class DbContext {
  private Map<Integer, Product> updatedObjects = new HashMap<>();

  public ProductProxy getProduct(int id) {

    System.out.printf("SELECT * FROM products WHERE product_id = %d \n", id);
    var product = new ProductProxy(id);   //simulate finding
                                          //proxy decide to fetch real obj or not!
                                          //now we just fetch
                                          //in this exercise our purpose was to proxy
                                          //make a "tracker"

    product.setDbContext(this);
    product.changeName("Product 1");
    return product;
  }

  public void saveChanges() {
    for (var updatedObject : updatedObjects.values())
      System.out.printf("UPDATE products SET name = '%s' WHERE product_id = %d \n", updatedObject.getName(), updatedObject.getId());

    updatedObjects.clear();
  }

  public void markAsChanged(Product product) {
    updatedObjects.put(product.getId(), product);
  }

}
