package Other;


    public enum Emotions {
        CALMNESS("calmness", 10),
        CONFIEDENCE("confiedence", 20),
        NOSTALGY("nostalgy", 5),
        AMAZED("amazed", 7),
        WAITING("waiting", -3),
        CHEERFULNESS("cheerfulness", 15),
        PAIN("pain",-31),
        TIRED("tired",0),
        FEAR("fear",-10),
        HYPNOTISED("hypnotised",3),
        POWER("power", 27),
        ANGRY("angry", -50);


        private int effect;
        private final String title;

        Emotions(String title, int effect) {
            this.effect = effect;
            this.title = title;
        }

        public int getEffect() {
            return effect;
        }

        public String toString() {
            return this.title;
        }

        public String getTitleOfEmotion() {
            return title;
        }


    }


