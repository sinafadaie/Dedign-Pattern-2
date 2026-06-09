package bridge.Mosh;

public class SamsungDevice implements Device{
    @Override
    public void turnOn() {
        System.out.println("turn on Samsung device");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off Samsung device");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("set Samsung channel");
    }
}
