package adaptor.Mosh1;

import adaptor.Filter;
import adaptor.Image;
import adaptor.avaFilter.Caramel;

public class CaramelAdapter implements Filter {
    private Caramel caramel;    //we always should store a Caramel obj (Adaptee obj)
                                //because we want to forward the request to caramel obj
                                //that why we use composite relationship(◆)

    public CaramelAdapter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();     //imagine this is the requirement set
                            //by the third party library

        caramel.render(image);
    }
}
