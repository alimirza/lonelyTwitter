package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.IllegalFormatWidthException;

/**
 * Created by ali on 15-09-14.
 */
public abstract class Tweet {
    private String text;
    private Date date;
    private ArrayList<Mood> moods;

    public ArrayList<Mood> getMoods() {
        return moods;
    }

    public void setMoods(ArrayList<Mood> moods) {
        this.moods = moods;
    }

    public Tweet(Date date, String text) {
        this.date = date;
        this.text = text;
        this.moods = new ArrayList<Mood>();
    }

    public Tweet(String text) {
        this.text = text;
        this.date = new Date();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws IOException{
        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new IOException("Tweet was too long!");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();
}
