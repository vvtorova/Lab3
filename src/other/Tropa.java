package other;
import human.Person;
import enums.Mood;

public class Tropa {
    public Tropa(String width) {
        this.width = width;
    }

    String width;

    public void toBeWidth(Flash flash, Person person, Trees trees) {
        if (Boolean.TRUE.equals(flash.getStatus())) {
            person.setEmotion(Emotions.AMAZED);
            person.setNewEnergy(person);
            trees.toMakeWay();
        }
    }

    public void toSeem(Light light, Tropa tropa, Person person) {
        light.powerOfLight = light.powerOfLight + 5;
        tropa.width = "more width";
        System.out.println("Tropa seemed " + width);
        person.feel(Emotions.FEAR);
        person.setNewEnergy(person);
    }

    public void toTaper(Light light, Tropa.Stars stars) {
        light.changePowerOfLight();
        stars.toSpotlight();
    }

    public class Trees {
        public Trees(String treesName) {
            this.treesName = treesName;
        }

        String treesName;

        public void toTouch(Person person) {
            person.setEmotion(Emotions.PAIN);
            person.setMood(Mood.BAD);
            System.out.format(treesName + " " + "touched him\n");
        }

        public void toMakeWay() {
        }
    }

    public class Stars {
        String nameOfStars;

        public Stars(String nameOfStars) {
            this.nameOfStars = nameOfStars;
        }

        public void toSpotlight() {
            System.out.print("Only " + nameOfStars + " shone\n");
        }
    }
}

