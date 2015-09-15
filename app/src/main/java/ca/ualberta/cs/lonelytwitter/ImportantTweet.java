package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by ali on 15-09-14.
 */
public class ImportantTweet extends Tweet implements Tweetable{
    public ImportantTweet(Date date, String text) {
        super(date, text);
    }

    public ImportantTweet(String text) throws IOException{
        super(text);
        this.setText(text);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
