import Emotions.Happiness;
import Memories.Memory;
import Occurences.Feed;
import Occurences.Occurrence;

import java.util.Date;

/**
 * Created by Freddy on 8/1/2016.
 */
public class Test {

    public static void main(String[] arrrrrgs) {
        Occurrence feed = new Feed(new Date(System.currentTimeMillis()), 10);
        Memory memory = new Memory(feed, new Happiness(10));
        float i = memory.getEmotionalValue();

        memory = new Memory(feed, new Happiness(8));
        i = memory.getEmotionalValue();
        System.out.println(i);
    }

}
