package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali on 15-09-14.
 */
public class HappyMood extends Mood {
    public HappyMood(Date date) {
        super(date);
        this.setMood(":)");
    }
}
