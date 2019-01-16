package enums;

public enum GearboxType {
    MANUAL("manual"),
    AUTOMATIC("automatic");

    private String type;

    GearboxType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
