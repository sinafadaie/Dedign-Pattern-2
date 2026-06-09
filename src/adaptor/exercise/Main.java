package adaptor.exercise;

public class Main {
    public static void main(String[] args){
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter()) ;   //we can initiate GmailClient here
                                                        //and inject it to GmailAdapter to prevent coupling

        emailClient.downloadEmails();       //we can have multiple email on emailClient!
                                            //like Microsoft Outlook (it's 365 service!)
    }
}
