package Emotions;

import Occurences.Feed;

/**
 * Created by Freddy on 8/1/2016.
 */
public class Fear extends Emotion {

    public Fear(int intensity) {
        currentLevel = intensity;
    }

    @Override
    public void augment(int value) {
        currentLevel += value;
    }

    @Override
    public int show() {
        return currentLevel;
    }
}
