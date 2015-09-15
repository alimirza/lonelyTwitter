package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali on 15-09-14.
 */
public class SadMood extends Mood {
    public SadMood(Date date) {
        super(date);
        setMood(":(");
    }
}
