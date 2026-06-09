package bridge.Mosh;

public class SonyDevice implements Device{
    @Override
    public void turnOn() {
        System.out.println("turn on Sony device");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off Sony device");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("set Sony Channel");
    }
}
