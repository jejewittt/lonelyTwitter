package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date ;

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }
//    getters and setters. retrive and get data

//    public Date getDate() {
//        return date;
//    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {  // if too long throw to this class

        if (message.length() > 140 ) {
            throw new TweetTooLongException();

        }else{
            this.message = message;
        }

    }
    public abstract Boolean isImportant();
    public Date getDate(){
        return date;
    }
//    public String getMessage(){
//        return message;
//    }


}