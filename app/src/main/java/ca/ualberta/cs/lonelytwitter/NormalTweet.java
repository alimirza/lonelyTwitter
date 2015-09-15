package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali on 15-09-14.
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(String text) {
        super(text);
    }

    public NormalTweet(Date date, String text) {
        super(date, text);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
