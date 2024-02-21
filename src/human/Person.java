package human;
import exceptions.SoundAppearanceException;
import interfaces.FirstInterface;
import memory.Sound;
import other.Emotions;
import enums.Mood;
import enums.Location;
import java.util.Objects;

public abstract class Person implements FirstInterface{
   public int height;
    private int energy;
    private final String name;
    private int mood;
    private Emotions emotion = Emotions.CALMNESS;

    public Person(String name, int energy, int mood, int height) {
        this.name = name;
        this.energy = energy;
        this.mood = mood;
        this.height=height;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void feel(Emotions emotion) {
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person that = (Person) o;
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

    public void setNewEnergy(Person p) {
        Emotions emotion =p.getEmotion();
        int thisEnergy = p.getEnergy();
        energy = thisEnergy + emotion.getEffect();
    }
    public int getNewEnergy(){
        energy = getEnergy() + getEmotion().getEffect();
        return energy;
    }
    private Sound sound;
    public void toMakeByFeeling (Emotions emotion) {
        switch (emotion) {
            case NOSTALGY:
                Sound sound = new Sound();
                System.out.println("During the war the commanders led the fighters to attack. It was madness, but really cheered up");
                try {
                    sound.setSound("Tipparary");
                } catch (SoundAppearanceException soundAppearanceException) {
                    System.err.println("Error initiallization sound: " + soundAppearanceException.getMessage());
                }
                sound.setDescription("The marching song of the British Army");
                hearSounds(sound);
                break;
            case CONFIEDENCE:
                System.out.print("Confident, but careful");
                break;
            case CALMNESS:
                System.out.println("He was calm and opened his rather calmly mouth to say");
                doNothing();
                break;
            default:
        }

    }
   public void toGo(Person p) {
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

    public void toStop(Emotions emotion) {
        setEmotion(Emotions.AMAZED);
        energy -= Emotions.AMAZED.getEffect();
    }

    public void toAnswer() {

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
        this.location = location;
    }
    public Location getLocation(){
        return location;
    }
    public int hashCode(){
        return Objects.hash(this.getEnergy(),this.getMood(),this.getMood());
    }
    public String toString(){
        return String.format("Человек %s с силой - %s", getName(),getEnergy());
    }
    public Emotions getEmotion(){
        return emotion;
    }

}

