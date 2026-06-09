package composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component{
  private List<Component> components = new ArrayList<>();

  public void add(Component component) {
    components.add(component);
  }

  @Override
  public void deploy() {
    for (var component : components) {
      component.deploy();
    }
  }
}
