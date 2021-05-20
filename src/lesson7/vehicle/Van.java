package lesson7.vehicle;

public class Van extends Vehicle{

    private Speed speed;
    private Wheel wheel;



    public Speed getVanSpeed() {
        return speed;
    }

    public void setVanSpeed(Speed vanSpeed) {
        this.speed = vanSpeed;
    }

    public static void main(String[] args) {
        Van van = new Van();
        van.getVanSpeed().setSpeed();
    }
}
