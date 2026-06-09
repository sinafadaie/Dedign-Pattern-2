package decorator.exercise;

public class Artefact implements Component{
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return String.format("%s", name);
    }

}
