package VehicleApp;

public class SUV extends Car{
    public SUV(String name,  boolean isManual) {
        super(name, 4, 5, 6, "SUV", isManual);
    }
    public void accelerate(int rate){
        int newSpeed= getCurrentSpeed() +rate;
        if(newSpeed==0){
            stop();
            changeGear(1);
        } else if (newSpeed>0 && newSpeed<=10) {
            changeGear(2);
        } else if (newSpeed>10 && newSpeed<=20) {
            changeGear(3);
        }else if (newSpeed>20 && newSpeed<=30) {
            changeGear(3);
        }else if (newSpeed>30 && newSpeed<=40) {
            changeGear(4);
        }else if (newSpeed>40 && newSpeed<=50) {
            changeGear(5);
        }else {
            changeGear(6);
        }
        if (newSpeed > 0) {

            changeSpeed(newSpeed,getCurrentDirection());
        }
    }
}
