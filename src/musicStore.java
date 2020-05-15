import Instruments.Drums;
import Instruments.Flute;
import Instruments.Guitars;
import Instruments.Instrument;

public class musicStore {


    public static void main(String[] args) {

        Instrument guitar = new Guitars("blue", 199.99, "electric");
        guitar.setOwner("Jacob");
        guitar.makeSounds("Strum");
        System.out.println("");
        System.out.println("Owner: " + guitar.getOwner());
        System.out.println("Color: " + guitar.getColor());
        System.out.println("Price: " + guitar.getPrice());

        System.out.println("");

        Instrument drums = new Drums("Natural", 399.99, "brushes");
        drums.setOwner("Jake");
        drums.makeSounds("Hit");
        System.out.println("Owner: " + drums.getOwner());
        System.out.println("Color: " + drums.getColor());
        System.out.println("Price: " + drums.getPrice());

        System.out.println("");

        Instrument flute = new Flute("Silver", 1200.57, "Piccolo");
        flute.setOwner("Emily");
        flute.makeSounds("Blow");
        System.out.println("Owner: " + flute.getOwner());
        System.out.println("Color: " + flute.getColor());
        System.out.println("Price: " + flute.getPrice());

        System.out.println("");

    }
}
