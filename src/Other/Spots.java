package Other;
import enums.Location;


public class Spots {
    String toMoveaPlace(Location location) {
        String where = location.getTitleOfLocations();
        if(where.equals(Location.STATION)){
            System.out.println("");
        }


        return where;

    }
}

