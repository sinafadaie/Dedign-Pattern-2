package bridge.Mosh;

public class RemoteControl {
    protected Device device;      //this is bridge!
                                  //we define it protected to subclasses

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }
}
