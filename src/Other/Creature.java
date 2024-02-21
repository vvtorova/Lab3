package Other;

import Human.Jud;
import Human.Louis;

import java.util.Objects;

public class Creature {
    String name;
    String description;
    public Creature(String name){
        this.name=name;
    }
    public void setDescriptionOfCreature(String description){
    }
    public String getDescriptionOfCreature(){
        return description;
    }
    public int hashCode(){
        return Objects.hash(this.getDescriptionOfCreature(), this.getNameOfCreature());

    }
    public String toString(){
        return String.format("Some creature- %s like this - %s",getNameOfCreature(),getDescriptionOfCreature());
    }
    public void toRun(Louis louis, Jud jud){
        louis.toStop(Emotions.AMAZED);
        jud.toStop(Emotions.AMAZED);
        System.out.println(getNameOfCreature()+getDescriptionOfCreature()+"ran along the tropa");

    }
    public String getNameOfCreature(){
        return name;
    }
}
