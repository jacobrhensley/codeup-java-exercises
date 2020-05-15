package Instruments;

public class Guitars extends Instrument {

    private String guitarType;

    public Guitars(String color, double price, String type){
        super(color, price);
        guitarType = type;
    }

    @Override
    public void makeSounds(String action){
        System.out.println(action + " Making grungy noises");
    }
}
