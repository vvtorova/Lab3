package enums;

public enum Location {
    FOREST("forest"),
    PATH("path"),
    APPLETREE("apple tree"),
    STATION("station"),
   INTHEHAND("in the hand"),
    ONTHEGROUND("on the ground");
    private final String title;
    private Location location;


    Location(String title) {
        this.title = title;
    }
    public String getTitleOfLocations(){
        return title;
    }

    public Location getTypeofLocation(){
        return location;
    }

        private boolean isSwinging;

        public boolean isSwinging() {
            isSwinging=true;
            return isSwinging;
        }

        }


