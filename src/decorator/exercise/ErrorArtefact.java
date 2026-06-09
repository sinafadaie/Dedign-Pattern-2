package decorator.exercise;

public class ErrorArtefact implements Component{
    private Component component;

    public ErrorArtefact(Component component) {
        this.component = component;
    }

    @Override
    public String render() {
        return component.render() + " [Error]";

    }
}
