import enums.GearboxType;

public class Gearbox {
    private int numberOfGears;
    private GearboxType gearboxType;

    public Gearbox(int numberOfGears, GearboxType gearboxType) {
        this.numberOfGears = numberOfGears;
        this.gearboxType = gearboxType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }
}
