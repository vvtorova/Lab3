package dop;
import Exceptions.InvalidHeightExeption;
import Human.Person;


public class Legs {
    public void toMakeStep(Person p, Brunch brunch, Ground ground) {
        while (p.getHeight() > ground.getheightOfGround()) {
            if (p.getHeight() == brunch.height) {
                p.toGo(p);
            }
                if (p.getHeight() == 2) {
                    p.toGo(p);
                    System.out.println( " he started to descend");
                }
                if (p.getHeight() == 1) {
                    p.toGo(p);
                    System.out.println("his foot sank firmly a few inches lower");
                }
                if (p.getHeight()<0){
                    throw new InvalidHeightExeption(p);
                }

            }
        }
}

