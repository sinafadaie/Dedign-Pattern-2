package facade;

public class Main {
    public static void main(String[] args){
        var server = new NotificationServer();

        Connection connection = server.connect("ip");
        AuthToken token = server.authToken("appID", "key");
        Message message = new Message("Hello World");
        server.send(token, message, "target");

        connection.disconnect();

    }
}
