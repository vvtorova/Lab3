package human;

import body.Body;
import enums.Direction;
import interfaces.Remembering;
import memory.Memories;
import subjects.Emotions;
import subjects.Shovel;
import enums.Location;
import java.util.Objects;

public class Louis extends Person implements Remembering {
    public Louis(String name, int energy, int mood, int height) {
        super("Louis", energy, mood, height);
    }


    @Override
    public void feel(Emotions e) {
        toChangeMood();
        setEmotion(e);
        setNewEnergy(getEmotion());
    }
@Override
    public void toCalm() {
        feel(Emotions.CALMNESS);
    }

    public boolean toShout(Object object) {
        if (object instanceof Louis) {
            Louis louis = (Louis) object;
            setEmotion(Emotions.ANGRY);
            setNewEnergy();
            return this == object;
        } else {
            toCalm();
            return false;
        }
    }

    @Override
    public void toGo(int step) {
        setEnergy(getEnergy()-(int) (Math.random() * 5));
        setHeight(getHeight()-step);
    }

    boolean result = true;

    public void toNotNotice() {
        if (result) {
            toGo();
            System.out.printf("%s didn`t take any attention\n",getName());
        } else {
            System.out.println(getName() + " take any attention");
            toGo();
        }
    }
    public void setNewEnergy(Emotions emotion) {
        getEnergy();
        if (getEnergy() <= 50) {
            setEnergy(getEnergy() + emotion.getEffect());
        } else {
            setEnergy(emotion.getEffect() - ((int) (Math.random() * 5)));
        }
    }
    public void setLocation(Location location){
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void useShovel(Jud jud, Shovel shovel) {
        if (shovel.getLocation() == Location.ONTHEGROUND) {
            jud.feel(Emotions.PAIN);
            jud.setEnergy(jud.getEnergy() - Emotions.PAIN.getEffect());
        }
    }
     Remembering memory= new Memories("apple tree");

    public void climbAppleTree(Location location) {
        if (location.isSwinging()){
        if (location.equals(Location.APPLETREE)) {
                memory.remember( "Louis remembered how climbed the swaying apple tree from childhood");
                System.out.println(memory.getMemory());
            }
        }
    }
    public void recallMemory(String s) {
        memory.remember(s);
        System.out.print(memory.getMemory());
    }

    public void shareMemory(Person person, Jud jud) {
        if (person instanceof Louis) {
            ((Louis) person).memory.remember(this.memory.getMemory());
        }
        jud.feel(Emotions.NOSTALGY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Louis louis = (Louis) o;
        return Objects.equals(memory, louis.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memory);
    }

    public int toMoveDown() {
        toGo();
        return getEnergy();
    }

    public void toAnswer() {
        Body body=new Body();
        body.getHead().setVerticalPositionDegree(50);
        body.getHead().turnHead(Direction.UP);
        body.getHead().setVerticalPositionDegree(-50);
        body.getHead().turnHead(Direction.DOWN);
        body.getHead().turnHead(Direction.STRAIGHT);
        System.out.printf("%s realized, how ",getName());
    }

    public void useShovel(Shovel shovel, Jud jud) {
        if (shovel.getLocation() == Location.ONTHEGROUND) {
            jud.feel(Emotions.PAIN);
            jud.setEnergy(jud.getEnergy() - Emotions.PAIN.getEffect());
        }
    }

    public void increaseEnergy(int amount) {
        setEnergy(getEnergy() + amount);
    }

    public void regive(Shovel shovel, Location location) {
        if (location == Location.ONTHEGROUND) {
            int randomEnergy = (int) (Math.random() * 10) + 1;
            shovel.toChangePlace(Location.ONTHEGROUND);
            increaseEnergy(randomEnergy);
            toCalm();
        } else if (location == Location.INTHEHAND) {
            shovel.toChangePlace(Location.INTHEHAND);
            int randomEnergy = (int) ((Math.random() * 10) + 1) * (-1);
            increaseEnergy(randomEnergy);
        }
    }

    @Override
    public String remember(String memory) {
        return memory;
    }
    @Override
    public String getMemory() {
        String memoryString = String.valueOf(memory);
        return memoryString;
    }
    @Override
    public void toBreath(Body.Lungs lungs) {
        lungs.takeaBreath();
        System.out.printf("%s breathed a sigh of relief\n",getName());
    }
}
