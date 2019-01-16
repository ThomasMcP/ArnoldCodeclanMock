package enums;

public enum MaterialType {

    LEATHER("Leather"),
    METAL("Metal");

    private String material;

    MaterialType(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
