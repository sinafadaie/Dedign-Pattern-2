package bridge;

public class SonyRemoteControl extends RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("turn on");  //we probably use Sony library here!
    }

    @Override
    public void turnOff() {
        System.out.println("turn off");

    }
}
