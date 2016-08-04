package Occurences;

import java.util.Date;

/**
 * Created by Freddy on 8/1/2016.
 */
public class Occurrence {

    private Date date;
    private int count;
    private int influence;
    private int originalImpact;
    private long timePassed;

    public Occurrence(Date date, int originalImpact) {
        this.date = date;
        this.originalImpact = originalImpact;
        count = 1;
    }

    public void occur(Date date) {
        count++;
        // store date of this occurrence in DB
    }

    public Date getDate() {
        return date;
    }

    public long getTimePassed() {
        return System.currentTimeMillis() - date.getTime();
    }

}
