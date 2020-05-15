package Instruments;

public class Drums extends Instrument{

    private String stickType;


    public Drums(String color, double price, String stickType){
        super(color, price);
        this.stickType = stickType;
    }

    @Override
    public void makeSounds(String action){
        System.out.println(action + " Making sounds loudly");
    }


}
