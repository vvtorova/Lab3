package subjects;

public class Brunch {
    private final String weight;
    private final String type;
    public int height;

    public Brunch(String weight,String type, int height) {
        this. weight =  weight;
        this.type=type;
        this.height=height;

    }
    public String getValueWeight()
    {
        return weight;
    }
    public String getType(){
        return type;
    }
    public void toCrunch(){
        if(weight.equals("thick")){

        System.out.printf(getValueWeight()+" brunch crunched\n");
    }
    }
}
