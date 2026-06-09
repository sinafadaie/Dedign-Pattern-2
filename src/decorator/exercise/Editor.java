package decorator.exercise;

public class Editor {
    public void openProject(String path) {
        Component[] artefacts = {
                new MainArtifact(
                        new Artefact("Main")),
                new Artefact("Demo"),
                new ErrorArtefact(
                        new Artefact("EmailClient")),
                new Artefact("EmailProvider"),

                new ErrorArtefact(                              //is main, has error
                        new MainArtifact(                       //we create complex combination!
                                new Artefact("Main")))
        };


        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
