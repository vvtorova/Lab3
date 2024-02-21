package dop;

import human.Louis;
import other.Emotions;
import other.Shovel;
import enums.Location;
import enums.Mood;

public class Hands  {
    public Hands(boolean isTired){
        this.isTired=isTired;
    }
    boolean isTired;
    public boolean getIsTired(){
        return isTired;
    }
    public void beTired(Shovel shovel, Louis louis,Hands hands){
        if(isTired=true){
            shovel.toChangePlace(Location.ONTHEGROUND);
            louis.setEmotion(Emotions.TIRED);
            louis.setNewEnergy(louis);
            louis.setMood(Mood.BAD);
            toHurt(hands,louis);
        }
        if(isTired=false){
            louis.setMood(Mood.GOOD);
            louis.toGo(louis);
        }
    }
    public void toHurt(Hands hand, Louis louis){
        hand.isTired=true;
        louis.setEmotion(Emotions.PAIN);

    }
}

