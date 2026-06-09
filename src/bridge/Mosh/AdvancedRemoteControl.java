package bridge.Mosh;

public class AdvancedRemoteControl extends RemoteControl{

   //private Device device;     //we don't need it here
                                //it's inherits it!

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number) {
        device.setChannel(number);
    }


}
