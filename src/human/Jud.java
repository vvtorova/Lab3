package human;
import other.Emotions;
import enums.Location;
import other.Light;
import enums.Mood;

import java.util.Objects;

public class Jud extends Person  {

    public Jud(String name, int energy, int mood, int height) {
        super(name, energy, mood, height);
    }

    String name;
    int energy;
    int mood;
    int height;

    public void toBeCheerful(Emotions e, Jud jud) {
        if (e.equals(Emotions.CHEERFULNESS)) {
            jud.toChangeMood();
            jud.toGo();
            System.out.printf(jud.getName() + "was cheerful, lile an oil in the fire%n");
        }
    }


    public int getEnergy() {
        return energy;
    }

    public void feel(Emotions emotion,Jud jud) {
        setEmotion(emotion);
        setNewEnergy(jud);
    }
    public int hashCode(){
return Objects.hash(this.getEnergy(), this.getEmotion(),this.getName());
    }

    public void toWaitSmth(Location location, Emotions emotion, Light light, Jud jud) {
        if ((Location.FOREST).equals(location.getTypeofLocation())) {
            if (Emotions.WAITING.equals(emotion)) {
                light.toShine();
                jud.setMood(Mood.BAD);
                System.out.print(jud.getName()+" was waiting for him");
            }
        }
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void toGo(){
        if (height>0){
            height=height-1;
            energy = energy - (int)(Math.random()*10);
        }
        else{
            doNothing();

        }

    }
}
