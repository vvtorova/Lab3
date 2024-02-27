package human;
import body.Body;
import enums.Location;
import enums.Mood;

public class Girl extends Person {
    public Girl(String name, int energy, int mood, int height) {

        super("Girl", energy, mood, height);
    }
    String name; // убрать
    int height;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height=height;
    }

    @Override
    public void toGo(int step) {
        if (height > 0) {
            this.height = height - step;
        }
    }

    public void toGoForAWalk(Louis louis) {
        if (louis.getMemory() == "remembered loving girl from school") {
            louis.toGo();
            louis.setLocation(Location.STATION);
            setLocation(Location.STATION);
            setMood(Mood.LOVED);
            louis.setMood(Mood.LOVED);
        }
            System.out.println(louis.getName() + " and girl went together and got lost");
        }

    @Override
    public void toBreath(Body.Lungs lungs) {
        lungs.takeaBreath();
    }
}

