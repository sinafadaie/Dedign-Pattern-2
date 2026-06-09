package facade.exercise;

import java.util.List;

public class TweeterService {
    public List<Tweet>  getRecentTweets(TwitterClient client,String appKey,String appSecret){

        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);
        return client.getRecentTweets(accessToken);
    }
}
