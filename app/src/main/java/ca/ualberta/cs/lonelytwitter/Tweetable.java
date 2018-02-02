package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * this interface is for ensuring that this is tweetable
 *
 * @author jejewitt
 *
 * @version 1.2.0.1.1.2.2.2.3.5
 *
 * @param allows for different implementations of tweetable variable
 *               @see NormalTweet
 *               @see ImportantTweet
 *
 **/

public interface Tweetable {
    String getMessage();
    Date getDate();
}
