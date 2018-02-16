package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by james on 2018-02-15.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
//        assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal teweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("added ");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("added ");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }
    public void testDeleteTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal teweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void addTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal teweet");
        tweets.add(tweet);
        assertFalse( tweets.hasTweet(tweet));
    }

    public void testGetListTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal teweet");
        Tweet tweet2 = new NormalTweet("adding another normal tweet");
        tweets.add(tweet);
        tweets.add(tweet2);
        ArrayList<Tweet> tweetsgotten = tweets.getTweets();
    }

    public void hasTweetTest(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal teweet");
        Tweet tweet2 = new NormalTweet("adding a normal teweet");
        tweets.add(tweet);
        tweets.add(tweet2);

       assertEquals(tweets.getTweet(0),tweets.getTweet(1));

    }
    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal teweet");
        Tweet tweet2 = new NormalTweet("adding a normal tweet");
        tweets.add(tweet);
        tweets.add(tweet2);
        tweets.getCount();
    }

}
