package bridge.Mosh;

public class Main {
    public static void main(String[] args){
        SamsungDevice device = new SamsungDevice();
        RemoteControl remoteControl = new RemoteControl(device);

        remoteControl.turnOn();
    }
}
