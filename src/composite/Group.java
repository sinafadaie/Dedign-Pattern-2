package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    //List<Shape> shapes = new ArrayList<>();
    List<Object> shapes = new ArrayList<>();    //I forget to make this field private
                                                //but it should be!

    public void addShape(Object obj){
        shapes.add(obj);
    }

    public void render(){
        for (var obj:shapes){
            if (obj instanceof Shape){
                Shape shape = (Shape) obj;
                shape.render();
            }
            else {
                Group group = (Group) obj;
                group.render();             //we call method inside itself
            }                               //it's recursive
        }                                   //so it's cover nested groupe
    }

    //we can have other method here like render
    //for move or resize shapes and groupe
}
