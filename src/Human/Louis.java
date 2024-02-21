package Human;
import Interfaces.Feel;
import Interfaces.FirstInterface;
import Interfaces.Remembering;
import Memory.Memories;
import Other.Emotions;
import Other.Shovel;
import enums.Location;
import java.util.Objects;

public class Louis extends Person implements FirstInterface,Feel, Remembering {
    public Louis(String name, int energy, int mood, int height) {
        super(name, energy, mood, height);
    }

    String name = "Louis";
    int energy;
    int mood;
    int height;

    @Override
    public void feel(Emotions e) {
        toChangeMood();
        setEmotion(e);

    }
@Override
    public void toCalm() {
        feel(Emotions.CALMNESS);
    }

    public void toShout(Object object) {
        if (object instanceof Louis) {
            Louis louis = (Louis) object;
            setEmotion(Emotions.ANGRY);
            setNewEnergy(louis);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void toGo() {
        energy -= (int) (Math.random() * 5);
        height = height - 1;
    }

    boolean result = true;

    public void toNotNotice() {
        if (result == true) {
            System.out.println("he didn`t take any attention.");
        } else {
            System.out.println(getName() + " take any attention");
        }
    }

    public void toBreath() {
        System.out.format("He breathed a sigh of relief\n");
    }

    public void setNewEnergy(Emotions emotion, Louis louis) {
        getEnergy();
        if (getEnergy() <= 50) {
            setEnergy(energy = getEnergy() + emotion.getEffect());
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
                memory.remember(name + " remembered how climbed the swaying apple tree from childhood");
                System.out.println(memory.getMemory());
            }
        }
    }
    public void recallMemory(String s) {
        memory.remember(s);
        System.out.println(memory.getMemory());
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

    public int toMoveDown(Louis louis) {
        louis.toGo(louis);
        return energy;
    }

    public void toAnswer() {
        System.out.print("He realized, how");

    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void useShovel(Shovel shovel, Jud jud) {
        if (shovel.getLocation() == Location.ONTHEGROUND) {
            jud.feel(Emotions.PAIN);
            jud.setEnergy(jud.getEnergy() - Emotions.PAIN.getEffect());
        }
    }

    public void increaseEnergy(int amount) {
        energy += amount;
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
}
