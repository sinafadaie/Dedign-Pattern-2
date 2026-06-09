package flyweight.Mosh;

public class Point {

    private int x;
    private int y;
    private PointIcon icon;     //we can store icon here (reference of PointIcon)
                                //reference it across multiple points
                                //we are not storing same area of bytes in many places in memory!


    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;

    }

    public void draw(){
        System.out.printf("%s at (%d, %d)",icon.getType(),x,y);
    }
}
