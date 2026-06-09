package composite;

public class Main {
    public static void main(String[] args){

        Group group1 = new Group();
        group1.addShape(new Shape());   //one square
        group1.addShape(new Shape());   //another square

        Group group2 = new Group();
        group2.addShape(new Shape());   //one circle
        group2.addShape(new Shape());   //another circle

        Group group = new Group();
        group.addShape(group2);
        group.addShape(group1);

        group.render();                 //render all 4 shapes


    }
}
