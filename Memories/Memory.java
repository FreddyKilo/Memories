package Memories;

import Emotions.Emotion;
import Occurences.Occurrence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Freddy on 8/1/2016.
 */
public class Memory {

    private Occurrence occurrence;
    private List<Emotion> emotions;
    private int intensity;
    private float clarity;

    public Memory(Occurrence occurrence, Emotion emotion) {
        this.occurrence = occurrence;
        emotions = new ArrayList<>();
        emotions.add(emotion);
        // store this memory in the DB with name and date of occurrence and emotions involved
    }

    public void addEmotion(Emotion emotion) {
        emotions.add(emotion);
    }

    public Occurrence getOccurrence() {
        return occurrence;
    }

    public float getEmotionalValue() {
        float value = 0;
        Emotion emotion = null;
        for (int i = 0; i < emotions.size(); i++) {
            emotion = emotions.get(i);
            if (emotion.isPositiveImpact()) {
                value += emotion.show();
            } else {
                value -= emotion.show();
            }
        }
        return value * clarity;
    }
}
