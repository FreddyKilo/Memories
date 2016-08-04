package Emotions;

public abstract class Emotion {

    protected int currentLevel;
    protected boolean positiveImpact;

    public void augment(int value){
        currentLevel += value;
    }

    public int show(){
        return currentLevel;
    }

    public boolean isPositiveImpact() {
        return positiveImpact;
    }

}
