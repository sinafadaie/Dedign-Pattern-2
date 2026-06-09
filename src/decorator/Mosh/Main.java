package decorator.Mosh;

public class Main {
    public static void main(String[] args){

        EncryptedCloudStream encryptedCompressedCloudStream =
                new EncryptedCloudStream(
                        new CompressedCloudStream(
                                new CloudStream()       //at the core we just have base stream
                        )                               //but now we just have a "EncryptedCloudStream" obj
                );                                      //we WRAP CloudStream by CompressedCloudStream
                                                        //then WRAP CompressedCloudStream by EncryptedCloudStream

        encryptedCompressedCloudStream.write("this is big and secure data");

    }
}
