package human;

import interfaces.FirstInterface;
import enums.Location;
import enums.Mood;

public class Girl extends Person implements FirstInterface {
    public Girl(String name, int energy, int mood, int height) {
        super(name, energy, mood, height);
    }

    String name;
    int height;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
    }

    @Override
    public void toGo() {
        if (height > 0) {
            this.height = height - 1;
        }
    }

    public void toGoForAWalk(Louis louis) {
        if (louis.getMemory() == "He remembered loving girl from school") {
            louis.toGo();
            louis.setLocation(Location.STATION);
            setLocation(Location.STATION);
            setMood(Mood.LOVED);
            louis.setMood(Mood.LOVED);
            System.out.println(" " + louis.getName() + "and" + getName() + "went together and got lost then");
        }
    }
}

