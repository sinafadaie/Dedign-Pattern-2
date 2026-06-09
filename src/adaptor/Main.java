package adaptor;

import adaptor.Mosh1.CaramelAdapter;
import adaptor.Mosh2.CaramelAdapter2;
import adaptor.avaFilter.Caramel;

public class Main {
    public static void main(String[] args){
        var imageView = new ImageView(new Image());

        imageView.applyFilter(new VividFilter());
        //imageView.applyFilter(new Caramel());      //we have error here!

        imageView.applyFilter(new CaramelAdapter(new Caramel()));    //Mosh1 (use composition (injection!))
        imageView.applyFilter(new CaramelAdapter2());                //Mosh2 (use inheritance)
    }
}
