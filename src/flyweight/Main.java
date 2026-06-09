package flyweight;

public class Main {
    public static void main(String[] args){

        PointService service = new PointService();

        for (var point:service.getPoints()){    //draw all loaded points on map!
            point.draw();
        }
    }
}
