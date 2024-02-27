package subjects;

public class Light {
    boolean iswork;
    String size;
    int powerOfLight;
    String material;
    String titleOfObject;

    public Light(boolean iswork, String size,int powerOfLight, String material, String titleOfObject ){
        this.iswork=iswork;
        this.size=size;
        this.powerOfLight=powerOfLight;
        this.material=material;
        this.titleOfObject=titleOfObject;
    }

    public void toShine(){
        if(powerOfLight>0){
            iswork=true;
        }
        if(powerOfLight<0){
            iswork=false;
        }
        System.out.println(getTitleOfObject()+"shines");

    }
    public void changePowerOfLight() {
        if (iswork = true) {
            while (powerOfLight > 0) {
                powerOfLight = powerOfLight - 5;
            }
            if (powerOfLight == 0) {
                iswork = false;
            }
        }
    }

        public String getTitleOfObject() {
        return titleOfObject;
    }

}
