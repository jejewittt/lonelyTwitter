package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
/**
 * Created by james on 2018-02-15.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int number){
        return tweets.get(number);
    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

}
