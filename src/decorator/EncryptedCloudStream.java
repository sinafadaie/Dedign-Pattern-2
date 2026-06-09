package decorator;

public class EncryptedCloudStream extends CloudStream{

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        super.write(encrypted);             //write() on parent will store our data on cloud
                                            //due to we have not any constructor on CloudStream (we have default constructor)
                                            //we don't need to initiate it by super()
    }

    private String encrypt(String data){
        return "^%%$%$#%$*)(*_(*&%^";
    }
}
