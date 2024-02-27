package subjects;

import body.Body;
import human.Jud;
import human.Louis;
import memory.Sound;

import java.util.Objects;

public class Creature {
    String name;
    String description;
    public Creature(String name){
        this.name=name;
    }
    public String getDescriptionOfCreature(){
        return description;
    }
    public int hashCode(){
        return Objects.hash(this.getDescriptionOfCreature(), this.getNameOfCreature());

    }
    public void setDescriptionOfCreature(String description){
        this.description = description;
    }
    public String toString(){
        description = getDescriptionOfCreature();
        return String.format("Some creature- %s like this - %s ",getNameOfCreature(),description);
    }
    public void toRun(Louis louis, Jud jud, Body.Eyes eyes ){
        louis.toStop();
        jud.toStop();
        eyes.tobeAmazedByEyes(jud);
        System.out.println(toString()+"ran along the tropa");



    }
    public String getNameOfCreature(){
        return name;
    }
}
