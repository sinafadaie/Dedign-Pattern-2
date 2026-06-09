package adaptor.exercise.Gmail;

//These class are shipped as a
//third-party library that we can add to our application.
//but it has not the type of our interface (EmailProvider)

public class GmailClient  {
  public void connect() {
    System.out.println("Connecting to Gmail");
  }

  public void getEmails() {
    System.out.println("Downloading emails from Gmail");
  }

  public void disconnect() {
    System.out.println("Disconnecting from Gmail");
  }
}
