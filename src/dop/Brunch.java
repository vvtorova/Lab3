package dop;

public class Brunch {
    private final String weight;
    private final String type;
    int height;

    public Brunch(String weight,String type, int height) {
        this. weight =  weight;
        this.type=type;
        this.height=height;

    }
    public String getValueWeight()
    {
        return weight;
    }
    Brunch brunch;
    public String getType(){
        return type;
    }
    public void toCrunch(){
        if(weight.equals("thick")){

        System.out.print(getValueWeight()+" brunch crunched under his leg\n");
    }
    }
}
