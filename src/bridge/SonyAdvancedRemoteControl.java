package bridge;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl{
    @Override
    public void setChannel(int number) {
        System.out.println("channel changed");
    }

    @Override
    public void turnOn() {
        System.out.println("turn on");  //we should use inheritance to avoid duplicate code here!
    }                                   //but just focus on design pattern!

    @Override
    public void turnOff() {
        System.out.println("turn off");
    }
}
