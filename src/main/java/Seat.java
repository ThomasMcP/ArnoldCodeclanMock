import enums.ColourType;
import enums.MaterialType;

public class Seat {
    private MaterialType material;
    private ColourType colour;

    public Seat(MaterialType material, ColourType colour) {
        this.material = material;
        this.colour = colour;
    }

    public MaterialType getMaterial() {
        return material;
    }

    public ColourType getColour() {
        return colour;
    }
}
