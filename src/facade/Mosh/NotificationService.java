package facade.Mosh;

public class NotificationService {
    public void send(String text, String targetDevice){
        var server = new NotificationServer();

        Connection connection = server.connect("ip");
        AuthToken token = server.authToken("appID", "key");
        Message message = new Message(text);
        server.send(token, message, targetDevice);
        connection.disconnect();
    }
}
