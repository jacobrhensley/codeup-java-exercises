package Instruments;

public class Flute extends Instrument{

    private String flutetype;


    public Flute(String color, double price, String fluteType){
        super(color, price);
        this.flutetype = fluteType;
    }

    @Override
    public void makeSounds(String action){
        System.out.println(action + " Making sounds beautifully");
    }
}
