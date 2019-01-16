import enums.MetalType;

public class Chassis {

    private MetalType type;

    public Chassis(MetalType type) {
        this.type = type;
    }


    public MetalType getType() {
        return type;
    }
}
