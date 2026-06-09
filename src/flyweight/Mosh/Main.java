package flyweight.Mosh;

public class Main {
    public static void main(String[] args){

        PointService service = new PointService(new PointIconFactory());

        for (var point:service.getPoints()){    //draw all loaded points on map!
            point.draw();                       //now we extract icons from point class
        }                                       //he loads point, if he had loads related icon, just use old one!
    }                                           //if not, he loads icon too!
}
