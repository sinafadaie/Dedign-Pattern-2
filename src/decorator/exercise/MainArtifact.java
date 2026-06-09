package decorator.exercise;

public class MainArtifact implements Component{
    private Component component;

    public MainArtifact(Component component) {
        this.component = component;
    }

    @Override
    public String render() {
        return component.render() + " [Main]";
    }
}
