package decorator;

public class Main {
    public static void main(String[] args){
        CloudStream cloudStream = new CloudStream();
        cloudStream.write("just plain data");

        EncryptedCloudStream encryptedCloudStream = new EncryptedCloudStream();
        encryptedCloudStream.write("Cenna credit card information");

        CompressedCloudStream compressedCloudStream = new CompressedCloudStream();
        compressedCloudStream.write("this is big data, and we need to some compaction!");


    }
}
