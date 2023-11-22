package builder;

import classes.Shoe;
import instanceEnum.*;

public class ShoesBuilder implements Builder{
    private LacesType type;
    private boolean withHeels;
    private HeelHeight height;
    private HeelMaterial material;
    private boolean withErgoPad;
    private PadMaterial padMat;
    private PadType padType;
    private LacesColor color;
    private boolean carrillera;
    private boolean ojetes;

    @Override
    public void lacesOrVelcro(LacesType type) { this.type = type; }

    @Override
    public void withHeels(boolean withHeels, HeelHeight height, HeelMaterial material) {
        this.withHeels= withHeels;
        this.height = height;
        this.material = material;
    }

    @Override
    public void withErgoPad(boolean withErgoPad, PadMaterial padMat, PadType padType) {
        this.withErgoPad = withErgoPad;
        this.padMat = padMat;
        this.padType = padType;
    }

    @Override
    public void withLaces(LacesColor color) {
        this.color = color;
    }

    @Override
    public void withCarrillera(boolean carrillera) {
        this.carrillera = carrillera;
    }

    @Override
    public void withOjetes(boolean ojetes) {
        this.ojetes = ojetes;
    }

    public Shoe getResult(){
        return new Shoe(type, withHeels, height, material,
                withErgoPad, padMat, padType, color, carrillera, ojetes);
    }
}
