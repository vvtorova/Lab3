package human;
import body.Body;
import enums.Location;
import subjects.Emotions;
import subjects.Light;
import enums.Mood;

import java.util.Objects;

public class Jud extends Person  {

    public Jud(String name, int energy, int mood, int height) {

        super("Jud", energy, mood, height);
    }

    public void toBeCheerful(Emotions emotion) {
        if (emotion.equals(Emotions.CHEERFULNESS)) {
            toChangeMood();
            toGo();
            System.out.printf("%s was cheerful\n",getName());
        }
    }

    public void feel(Emotions emotion) {
        setEmotion(emotion);
    }
    public int hashCode(){
return Objects.hash(this.getEnergy(), this.getEmotion(),this.getName());
    }

    public void toWaitSmth(Location location, Emotions emotion, Light light) {
        if ((Location.FOREST).equals(location.getTypeofLocation())) {
            if (Emotions.WAITING.equals(emotion)) {
                light.toShine();
                setMood(Mood.BAD);
                System.out.printf("%s was waiting for him\n",getName());
            }
        }
    }

    public void toGo(int step){
        if (getHeight()>0){
            setHeight(getHeight()-step);
            setEnergy(getEnergy() - (int)(Math.random()*10));
        }
        else{
            doNothing();
        }
    }
    @Override
    public void toStop(){
        setEmotion(Emotions.AMAZED);
        setEnergy(getEnergy()-Emotions.AMAZED.getEffect());
        getBody().getEyes().Blink(5,1);
        System.out.printf("%s stopped\n",getName());

    }

    @Override
    public void toBreath(Body.Lungs lungs) {
        lungs.takeaBreath();
    }
}
