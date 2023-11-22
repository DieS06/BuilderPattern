package director;

import builder.Builder;
import instanceEnum.*;


public class Director {
    boolean SI = true;
    boolean NO = false;
    public void  constructorWithLacesShoes (Builder builder){
        builder.lacesOrVelcro(LacesType.CORDONES);
        builder.withOjetes(SI);
        builder.withCarrillera(SI);
        builder.withLaces(LacesColor.BLACK);
        builder.withHeels(SI, HeelHeight.MEDIUM, HeelMaterial.RUBBER);
        builder.withErgoPad(SI, PadMaterial.MEMORYFOAM, PadType.ERGONOMIC);
    }
    public void  constructorWithVelcroShoes (Builder builder){
        builder.lacesOrVelcro(LacesType.VELCRO);
        builder.withOjetes(NO);
        builder.withCarrillera(NO);
        builder.withLaces(LacesColor.BROWN);
        builder.withHeels(SI, HeelHeight.HIGH, HeelMaterial.RUBBER);
        builder.withErgoPad(SI, PadMaterial.SILICON, PadType.NORMAL);
    }
}
