package enums;

public enum ColourType {

    RED("Red"),
    BLUE("Blue"),
    GREEN("Green");

    private String colour;

    ColourType(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
