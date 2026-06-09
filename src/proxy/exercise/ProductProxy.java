package proxy.exercise;

public class ProductProxy implements Product{

    private RealProduct product;
    private String productName;
    private DbContext dbContext;
    private int productId;

    public ProductProxy(int id) {
        this.product=new RealProduct(id);       //or we can set some lazy logic
    }                                           //create RealProduct obj (load RealProduct obj)
                                                //on demand (we are eager now!)

    public void changeName(String name){
        product.setName(name);
        dbContext.markAsChanged(product);       //this is tracker
    }

    @Override
    public int getId() {
        return product.getId();
    }

    @Override
    public String getName() {
        return productName;
    }

    public void setDbContext(DbContext dbContext) {
        this.dbContext = dbContext;
    }
}
