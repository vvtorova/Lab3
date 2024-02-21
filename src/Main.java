import human.*;
import interfaces.Feel;
import other.*;
import dop.Brunch;
import dop.Ground;
import dop.Hands;
import dop.Legs;
import enums.Location;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Louis louis = new Louis("Louis", 50, 30, 3);
        Ground ground = new Ground();
        Brunch brunch = new Brunch("thick", "brunch", 3);
        Tropa tropa = new Tropa("width");
        Girl girl = new Girl("girl", 15, 10, 10);
        Tropa.Trees trees = tropa.new Trees("Trees");
        Tropa.Stars stars = tropa.new Stars("Stars");
        Creature creature = new Creature("creature");
        Flash flash = new Flash(true);
        louis.setEmotion(Emotions.CONFIEDENCE);
        louis.toMakeByFeeling(Emotions.CONFIEDENCE);
        Legs legs = new Legs();
        legs.toMakeStep(louis, brunch, ground);
        brunch.toCrunch();
        louis.toNotNotice();
        louis.toBreath();
        louis.toAnswer();
        louis.toMakeByFeeling(louis.setEmotion(Emotions.NOSTALGY));
        louis.setNewEnergy(louis);
        Jud jud = new Jud("jud", 35, 15, 5);
        Shovel shovel = new Shovel("shovel", Location.INTHEHAND);
        louis.useShovel(shovel, jud);
        Hands hands = new Hands(true);
        hands.beTired(shovel, louis, hands);
        louis.regive(shovel, Location.ONTHEGROUND);
        jud.setLocation(Location.FOREST);
        Emotions emotion = Emotions.WAITING;
        Location.APPLETREE.isSwinging();
        louis.recallMemory("He remembered memory from the childhood");
        louis.setLocation(Location.APPLETREE);
        louis.climbAppleTree(louis.getLocation());
        louis.shareMemory(louis, jud);
        Light light = new Light(true, "enormous", 30, "metal", "light");
        jud.toWaitSmth(Location.FOREST, emotion, light, jud);
        ArrayList<String> LouisPhrases = new ArrayList<String>(Arrays.asList("We have moved on, Jud", " we have moved on!", "I didnt believe"));

        ArrayList<String> JudPhrases = new ArrayList<String>(Arrays.asList("And what did you think", "Lets go. There are not many miles to go "));
        ArrayList<String> AuthorPhrases = new ArrayList<String>(Arrays.asList("louis said", "jud said", "louis answered"));

        String LPhrase1 = LouisPhrases.get(0);
        String LPhrase2 = LouisPhrases.get(1);
        String LPhrse3 = LouisPhrases.get(2);
        String JPhrases1 = JudPhrases.get(0);
        String JPhrase2 = JudPhrases.get(1);
        String APhrase1 = AuthorPhrases.get(0);
        String APhrases2 = AuthorPhrases.get(1);
        String APhrase3 = AuthorPhrases.get(2);
        System.out.println(LPhrase1 + LPhrase2 + "-" + APhrase1);
        Location.PATH.isSwinging();
        louis.setEmotion(Emotions.FEAR);
        louis.toShout(louis);
        louis.toGo(louis);
        louis.setEmotion(Emotions.HYPNOTISED);
        louis.feel();
        Feel power = new Feel() {
            @Override
            public void feel(Emotions emotion) {
                if (emotion == Emotions.POWER) {
                    System.out.printf("Felt the power of this place\n");
                }
            }
        };
        System.out.println(JPhrases1+"-"+APhrases2);
        System.out.println(JPhrase2+"-"+APhrase3);
        tropa.toBeWidth(flash,louis,trees);
        flash.toMakeOn();
        light.toShine();
        tropa.toSeem(light,tropa,louis);
        flash.toMakeOff();
        trees.toTouch(louis);
        tropa.toTaper(light, stars);
        creature.setDescriptionOfCreature("something scary with green eyes");
        creature.toRun(louis,jud);
        Location.FOREST.isSwinging();
        louis.setLocation(Location.STATION);
        girl.setLocation(Location.STATION);
        girl.toGoForAWalk(louis);

    }
}






