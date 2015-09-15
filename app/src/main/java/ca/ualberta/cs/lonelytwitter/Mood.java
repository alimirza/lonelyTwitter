package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ali on 15-09-14.
 */
public abstract class Mood {
    private Date date;
    private String mood;

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Mood(Date date) {

        this.date = new Date();
    }
}
