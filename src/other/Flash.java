package other;

public class Flash {
    private boolean isOn;

    public Flash(boolean isOn){
        this.isOn=isOn;
    }

    public boolean getStatus(){
    return isOn;
    }
    public void toMakeOn() {
        isOn = true;
    }

    public void toMakeOff() {
        isOn = false;
    }
}


