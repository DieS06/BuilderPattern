package classes;

import instanceEnum.*;

import static instanceEnum.LacesType.VELCRO;

public class Shoe {
    private final LacesType type;
    private final boolean withHeels;
    private final HeelHeight height;
    private final HeelMaterial material;
    private final boolean withErgoPad;
    private final PadMaterial padMat;
    private final PadType padType;
    private final LacesColor color;
    private final boolean carrillera;
    private final boolean ojetes;

    public Shoe(LacesType type, boolean withHeels, HeelHeight height, HeelMaterial material, boolean withErgoPad, PadMaterial padMat, PadType padType, LacesColor color, boolean carrillera, boolean ojetes) {
        this.type = type;
        this.withHeels = withHeels;
        this.height = height;
        this.material = material;
        this.withErgoPad = withErgoPad;
        this.padMat = padMat;
        this.padType = padType;
        this.color = color;
        this.carrillera = carrillera;
        this.ojetes = ojetes;
    }

    public LacesType getType() {
        return type;
    }

    public boolean isWithHeels() {
        return withHeels;
    }

    public HeelHeight getHeight() {
        return height;
    }

    public HeelMaterial getMaterial() {
        return material;
    }

    public boolean isWithErgoPad() {
        return withErgoPad;
    }

    public PadMaterial getPadMat() {
        return padMat;
    }

    public PadType getPadType() {
        return padType;
    }

    public LacesColor getColor() {
        return color;
    }

    public boolean isCarrillera() {
        return carrillera;
    }

    public boolean isOjetes() {
        return ojetes;
    }
}
