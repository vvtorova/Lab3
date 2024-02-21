package other;
import enums.Location;

public class Shovel {
    public Shovel(String title, Location location ){
        this.title=title;
        this.location = location;
    }
    String title;
    Location location;
    public Location toChangePlace(Location location){
        return location;
    }
    public Location getLocation(){
        return location ;
    }
   @Override
    public String toString(){
        return title;
   }

}
