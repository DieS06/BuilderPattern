import builder.ShoesBuilder;
import director.Director;
import classes.Shoe;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ShoesBuilder builder = new ShoesBuilder();

        director.constructorWithLacesShoes(builder);
        Shoe shoeCordones = builder.getResult();
        System.out.println("Shoe built:\n" + shoeCordones.getType() + ":\n"
                +"Laces color:"+ shoeCordones.getColor() + "\n"
                +"Cheek piece:" + shoeCordones.isCarrillera() + "\n"
                +"Eyelest:" + shoeCordones.isOjetes() + "\n"
                +"Heel height:" + shoeCordones.getHeight() + "\n"
                +"Heel material:" + shoeCordones.getMaterial()+ "\n"
                +"Pad type:" + shoeCordones.getPadType() + "\n"
                +"Pad material:" + shoeCordones.getPadMat() + "\n"
        );

        director.constructorWithVelcroShoes(builder);
        Shoe shoeVelcro = builder.getResult();
        System.out.println("Shoe built:\n" + shoeVelcro.getType()+ ":\n"
                +"Laces color:" + shoeVelcro.getColor() + "\n"
                +"Cheek piece:" + shoeVelcro.isCarrillera() + "\n"
                +"Eyelest:" + shoeVelcro.isOjetes() + "\n"
                +"Heel height:" + shoeVelcro.getHeight() + "\n"
                +"Heel material:" + shoeVelcro.getMaterial()+ "\n"
                +"Pad type:" + shoeVelcro.getPadType() + "\n"
                +"Pad material:" + shoeVelcro.getPadMat() + "\n"
        );
    }
}