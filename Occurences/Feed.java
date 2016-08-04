package Occurences;

import java.util.Date;

/**
 * Created by Freddy on 8/1/2016.
 */
public class Feed extends Occurrence {

    public Feed(Date date, int originalImpact) {
        super(date, originalImpact);
    }

    @Override
    public void occur(Date date) {
        super.occur(date);
    }
}
