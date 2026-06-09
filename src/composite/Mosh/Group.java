package composite.Mosh;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void addShape(Component component){
        components.add(component);
    }

    public void render(){
        for (var component: components){
            component.render();         //component can be Group or Shape
        }                               //so by polymorphism we remove conditions
    }                                   //if component be a Group obj
                                        //we call render() recursively
}
