
import body.Body;
import enums.Direction;
import human.*;
import interfaces.Feeling;
import subjects.*;
import subjects.Brunch;
import subjects.Ground;
import enums.Location;
import memory.Sound;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Louis louis = new Louis("Louis", 50, 30, 5);
        Ground ground = new Ground();
        Jud jud = new Jud("jud", 35, 15, 5);
        Brunch brunch = new Brunch("thick", "brunch", 5);
        Tropa tropa = new Tropa("width");
        Girl girl = new Girl("girl", 15, 10, 10);
        Body louisBody =new Body() ;
        Body judBody=new Body();
        Tropa.Trees trees = tropa.new Trees("Trees");
        Tropa.Stars stars = tropa.new Stars("Stars");
        Creature creature = new Creature("creature");
        Flash flash = new Flash(true);
        louis.setEmotion(Emotions.CONFIEDENCE);
        louis.toMakeByFeeling(Emotions.CONFIEDENCE);
        judBody.getLeg().toMakeStep(louis, brunch, ground);
        brunch.toCrunch();
        louis.toNotNotice();
        louis.toMoveDown();
        louis.toBreath(louisBody.getLungs());
        louis.toAnswer();
        louis.toMakeByFeeling(louis.setEmotion(Emotions.NOSTALGY));
        louis.setNewEnergy();
        Sound sound = new Sound();
        Shovel shovel = new Shovel(Location.INTHEHAND);
        louis.useShovel(shovel, jud);
        louisBody.getHand().toBeExhausted(louis,shovel);
        louis.regive(shovel, Location.ONTHEGROUND);
        louisBody.getHead().turnHead(Direction.LEFT);
        jud.setLocation(Location.FOREST);
        Emotions emotion = Emotions.WAITING;
        Location.APPLETREE.isSwinging();
        louis.recallMemory("He remembered memory from the childhood\n");
        louis.setLocation(Location.APPLETREE);
        louis.climbAppleTree(louis.getLocation());
        louis.shareMemory(louis, jud);
        Light light = new Light(true, "enormous", 30, "metal", "light");
        jud.toWaitSmth(Location.FOREST, Emotions.WAITING, light);
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
        Location.PATH.isSwinging();
        louis.setEmotion(Emotions.FEAR);
        louis.toShout(louis);
        louis.toGo();
        louis.setEmotion(Emotions.HYPNOTISED);
        louis.feel(Emotions.TIRED);
        louisBody.beTired(louis,louisBody);
        louisBody.getHand().toHurt(louisBody.getHand(), louis);
        Feeling power = emotion1 -> {
            if (emotion1 == Emotions.POWER) {
                System.out.print("Felt the power of this place\n");
            }
        };
        System.out.println(LPhrase1 + LPhrase2 + "-" + APhrase1);
        System.out.println(JPhrases1+"-"+APhrases2);
        System.out.println(JPhrase2+"-"+APhrase3);
        tropa.toBeWidth(flash,louis,trees);
        flash.toMakeOn();
        light.toShine();
        tropa.toSeem(light,tropa,louis);
        flash.toMakeOff();
        Location.STATION.isSwinging();
        louis.setLocation(Location.STATION);
        girl.setLocation(Location.STATION);
        louis.remember("remembered loving girl from school");
        System.out.println(louis.remember("remembered loving girl from school"));
        girl.toGoForAWalk(louis);
        trees.toTouch(louis);
        tropa.toTaper(light, stars);
        creature.setDescriptionOfCreature("something scary with green eyes");
        creature.toRun(louis,jud, judBody.getEyes());
        louisBody.getHand().setDirection(Direction.UP);
        louisBody.getHand().toIndikate(louis, jud);

    }
}






