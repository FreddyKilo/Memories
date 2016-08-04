package Emotions;

/**
 * Created by Freddy on 8/1/2016.
 */
public class Happiness extends Emotion {

    public Happiness(int intensity) {
        currentLevel = intensity;
        if (intensity > 0) {
            positiveImpact = true;
        }
    }

    @Override
    public void augment(int value) {
        currentLevel += value;
        if (currentLevel > 0) {
            positiveImpact = true;
        } else {
            positiveImpact = false;
        }
    }

    @Override
    public int show() {
        return currentLevel;
    }
}
