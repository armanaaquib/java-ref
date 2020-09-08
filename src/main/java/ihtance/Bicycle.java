package ihtance;

public class Bicycle {
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    public String publicField;
    protected String protectedField;
    String defaultField;
    private String privateField;

    public Bicycle() {
        publicField = "publicField";
        protectedField = "protectedField";
        privateField = "privateField";
        defaultField = "defaultFiled";
    }

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        this();
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

}
