package composite.Mosh;

public class Shape implements Component{

    @Override   //always use @Override!
    public void render(){
        System.out.println("Render Shape");
    }
}
