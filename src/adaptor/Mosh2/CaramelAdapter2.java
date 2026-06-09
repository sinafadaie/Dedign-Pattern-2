package adaptor.Mosh2;

import adaptor.Filter;
import adaptor.Image;
import adaptor.avaFilter.Caramel;

public class CaramelAdapter2 extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
