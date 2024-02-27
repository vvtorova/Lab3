package body;

import enums.Location;
import enums.Mood;
import exceptions.InvalidHeightExeption;
import human.Louis;
import human.Person;
import subjects.Brunch;
import subjects.Emotions;
import subjects.Ground;
import subjects.Shovel;
import enums.Direction;

import java.util.Timer;

public class Body {
    private final Hands hands;
    private final Legs legs;
    private final Eyes eyes;
    private final Head head;
    private boolean isTired;
    private final Lungs lungs;

    public Body() {
        hands = new Hands();
        head = new Head();
        legs = new Legs();
        eyes = new Eyes();
        lungs = new Lungs();

    }

    public boolean getIsTired() {
        return isTired;
    }

    public void beTired(Person person, Body body) {
        if (getIsTired()) {
            person.setEmotion(Emotions.TIRED);
            person.setNewEnergy();
            person.setMood(Mood.BAD);
            toHurt(body, person);
        } else {
            person.setMood(Mood.GOOD);
            person.toGo();
        }
    }

    public void toHurt(Body body, Person person) {
        person.setEmotion(Emotions.PAIN);
        if (toString().equals("hand")) {
            hands.isTired = true;
            if (toString().equals("leg")) {
                legs.isTired = true;
            }
            if (toString().equals("lungs")) {
                System.out.printf("%s + cant breathe\s", person.getName());
            }
        }
    }

    public Lungs getLungs() {
        return lungs;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public Hands getHand() {
        return hands;
    }

    public Head getHead() {
        return head;
    }

    public Legs getLeg() {
        return legs;
    }

    public class Head {
        protected double horizontalPositionDegree = 0.0;
        protected double verticalPositionDegree = 0.0;

        public double getHorizontalPositionDegree() {
            return horizontalPositionDegree;
        }

        public double getVerticalPositionDegree() {
            return verticalPositionDegree;
        }

        public void setHorizontalPositionDegree(double degree) {
            this.horizontalPositionDegree = degree;
        }

        public void setVerticalPositionDegree(double degree) {
            this.verticalPositionDegree = degree;
        }

        public void turnHead(Direction direction) {
            double degree;
            switch (direction) {
                case LEFT:
                    degree = (Math.random()) * (90.0 - 15);
                    head.setHorizontalPositionDegree(degree);
                case RIGHT:
                    degree = -(Math.random()) * (90.0 - 15);
                    head.setHorizontalPositionDegree(degree);
                case DOWN:
                    degree = -Math.random() * (90.00 - 30) - 30.0;
                    head.setVerticalPositionDegree(degree);
                case UP:
                    degree = Math.random() * (90.00 - 30) + 30.0;
                    head.setVerticalPositionDegree(degree);
                case STRAIGHT:
                    degree = 90.0;
                    head.setVerticalPositionDegree(degree);

            }
        }
    }

    public class Hands {
        public boolean isTired;
        Direction direction;

        public void setDirection(Direction direction) {
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }

        public void toBeExhausted(Louis louis, Shovel shovel) {
            isTired = true;
            shovel.toChangePlace(Location.ONTHEGROUND);
            louis.setEmotion(Emotions.TIRED);
            louis.setNewEnergy();
            louis.setMood(Mood.BAD);
        }

        public void handsUp(Direction direction) {
            double degree;
            switch (direction) {
                case LEFT:
                    degree = (Math.random()) * (90.0 - 15);
                    head.setHorizontalPositionDegree(degree);
                case RIGHT:
                    degree = -(Math.random()) * (90.0 - 15);
                    head.setHorizontalPositionDegree(degree);
                case DOWN:
                    degree = -Math.random() * (90.00 - 30) - 30.0;
                    head.setVerticalPositionDegree(degree);
                case UP:
                    degree = Math.random() * (90.00 - 30) + 30.0;
                    head.setVerticalPositionDegree(degree);
                case STRAIGHT:
                    degree = 90.0;
                    head.setVerticalPositionDegree(degree);
            }
        }

        public void toIndikate(Person person1, Person person2) {
            hands.handsUp(hands.getDirection());
            person1.toStop();
            person2.toStop();
        }

        public String toString() {
            return "hand";
        }

        public void toHurt(Hands hand, Person person) {
            person.setEmotion(Emotions.PAIN);
            if (toString().equals("hand")) {
                hand.isTired = true;
            }
        }
    }

    public class Legs {
        boolean isTired;

        public String toString() {
            return "leg";
        }

        public void toMakeStep(Person person, Brunch brunch, Ground ground) {
            while (person.getHeight() > ground.getheightOfGround()) {
                if (person.getHeight() <= 1) {
                    person.toGo(1);
                    System.out.printf("%s foot sank lower\n", person.getName());
                }
                if (person.getHeight() > 1 && person.getHeight() < brunch.height) {
                    person.toGo(3);
                    System.out.println(" he started to descend");
                }
                if (person.getHeight() == brunch.height) {
                    person.toGo(1);
                }
            }
            if (person.getHeight() < 0) {
                throw new InvalidHeightExeption(person);
            }
        }
    }


            public class Lungs {
                int volume = 50;

                public int getVolume() {
                    return volume;
                }

                public void takeaBreath() {
                    volume += 25;
                }

                public String toString() {
                    return "lungs";
                }

            }
            public class Eyes {
                boolean isOpened;

                public void Blink(int timeOfBlinking, int numbersOfBlinking) {
                    Timer timer = new Timer();
                    int count = 0;
                    if (count < timeOfBlinking + 1) {
                        isOpened = false;
                        count++;
                    }
                    if (count <= timeOfBlinking) {
                        isOpened = true;
                        count++;
                    }
                    timer.cancel();
                }

                public void tobeAmazedByEyes(Person person) {
                    person.setEmotion(Emotions.AMAZED);
                    isOpened = true;
                }
            }

                }


