package subjects;
import enums.Location;

public class Shovel {
    public Shovel(Location location ){
        this.location = location;
    }
    String title="shovel";
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
