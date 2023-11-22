package builder;

import instanceEnum.*;

public interface Builder {
    void lacesOrVelcro (LacesType type);
    void withHeels (boolean withHeels, HeelHeight height, HeelMaterial mat);
    void withErgoPad (boolean withErgoPad, PadMaterial mat, PadType type);
    /** Color de cordones, carrillera, ojetes condicionado a si es con cordones y no de velcro */
    void withLaces (LacesColor color);
    void withCarrillera (boolean carrillera);
    void withOjetes(boolean ojetes);
}
