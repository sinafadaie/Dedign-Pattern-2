package facade.exercise;

public class Main {
  public static void main(String[] args) {
    TweeterService service = new TweeterService();
    var twitterClient = new TwitterClient();

    service.getRecentTweets(twitterClient,"key","secret");
  }
}
