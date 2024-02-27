package human;
import body.Body;
import enums.Direction;
import exceptions.InvalidLocationExeption;
import exceptions.SoundAppearanceException;
import interfaces.Breathing;
import interfaces.Feeling;
import interfaces.Going;
import memory.Sound;
import subjects.Emotions;
import enums.Mood;
import enums.Location;
import java.util.Objects;

public abstract class Person implements Going, Feeling, Breathing {
    private int height;
    private int energy;
    private final String name;
    private int mood;
    private Emotions emotion = Emotions.CALMNESS;
    private Body body;

    public Person(String name, int energy, int mood, int height) {
        this.name = name;
        this.energy = energy;
        this.mood = mood;
        this.height=height;
        this.body=new Body();
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy){
        this.energy=energy;
    }

    public void feel(Emotions emotion) {
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Person that = (Person) object;
        return this.name.equals(that.name) && that.energy == this.energy;
    }

    public int getMood() {
        return mood;
    }

    public void doNothing(){
        energy=energy+1;
    }

    protected Mood mod;

    public void setMood(Mood mod) {
        this.mod = mod;
    }

    public void setNewEnergy() {
        Emotions emotion =getEmotion();
        int thisEnergy = getEnergy();
        energy = thisEnergy + emotion.getEffect();
    }
    public int getNewEnergy(){
        energy = getEnergy() + getEmotion().getEffect();
        return energy;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void toMakeByFeeling (Emotions emotion) {
        switch (emotion) {
            case NOSTALGY:
                Sound sound = new Sound();
                System.out.println("During the war the commanders led the fighters to attack");
                try {
                    sound.setSound("Tipparary");
                } catch (SoundAppearanceException soundAppearanceException) {
                    System.err.println("Error initiallization sound: " + soundAppearanceException.getMessage());
                }
                sound.setDescription("The marching song");
                hearSounds(sound);
                break;
            case CONFIEDENCE:
                System.out.print("Confident, but careful");
                break;
            case CALMNESS:
                System.out.println("He was calm and opened mouth to say");
                doNothing();
                break;
            default:
        }

    }
   public void toGo() {
        energy=energy- (int) (Math.random()*10);
        height=height-1;
    }

    public void feel() {
    }
    public void toCalm(){

    }
    public int getHeight(){
        return height;
    }
    public void hearSounds(Sound sound) {
    }

    public Body getBody() {
        return body;
    }

    public void toStop() {
        setEmotion(Emotions.AMAZED);
        energy -= Emotions.AMAZED.getEffect();
        body.getEyes().Blink(5,1);
    }

    public void toAnswer() {
        body.getHead().setVerticalPositionDegree(50);
        body.getHead().turnHead(Direction.UP);
        body.getHead().setVerticalPositionDegree(-50);
        body.getHead().turnHead(Direction.DOWN);
        body.getHead().turnHead(Direction.STRAIGHT);



    }
    public Emotions setEmotion(Emotions emotion) {
        return emotion;
    }
    public void toChangeMood() {
        int mood;
        mood = 2 * (getMood() - getEnergy());
    }
Location location;
    public void setLocation(Location location) {
        if (getLocation() == Location.INTHEHAND || getLocation() == Location.ONTHEGROUND) {
            throw new InvalidLocationExeption("It`s invalid Location:"+getLocation()+" change it");
        } else {
            this.location = location;
        }
    }
    public Location getLocation(){
        return location;
    }

    public int hashCode(){
        return Objects.hash(this.getEnergy(),this.getMood(),this.getMood());
    }
    public String toString(){
        return String.format("person %s with energy - %s", getName(),getEnergy());
    }
    public Emotions getEmotion(){
        return emotion;
    }

}

