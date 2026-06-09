package adaptor.exercise;

import adaptor.exercise.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider{
    private GmailClient gmailClient = new GmailClient();    //instead of injection and use constructor
                                                            //initiate it directly!
                                                            //but we have coupling now!
    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
