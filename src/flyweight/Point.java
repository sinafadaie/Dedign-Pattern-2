package flyweight;

public class Point {

    private int x;
    private int y;
    private PointType type;
    private byte[] icon;    //imagine we represent icon as array of bytes

    public Point(int x, int y, byte[] icon, PointType type) {
        this.x = x;
        this.y = y;
        this.icon = icon;
        this.type = type;
    }

    public void draw(){         //the method that draw our point on map

        System.out.printf("%s at (%d, %d)",type,x,y);   //we call %s, %d
    }                                                   //as PLACEHOLDER
}
