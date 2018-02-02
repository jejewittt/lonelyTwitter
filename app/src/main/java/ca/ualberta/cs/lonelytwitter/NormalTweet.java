package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * this class represents a tweet
 *
 * @author jejewitt
 *
 * @version 1.2.0.1.1.2.2.2.3.5
 *
 * @param message the message of the tweet
 *                @see nomralTweet
 *                @ee IMportant tweet
 *                @throws TweetToolog exception // if the tweet is too long, form an error
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
