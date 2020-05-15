package Instruments;

public class Instrument {
   private String owner;
   private String color;
   private double price;

   public void makeSounds(String action){
       System.out.println(action + " Making sounds");
   }

   public Instrument(String color, double price){
       this.color = color;
       this.price = price;
   }

   public void setOwner(String name){
       this.owner = name;
   }

   public String getColor(){
       return this.color;
   }

   public String getOwner(){
       return this.owner;
   }

   public double getPrice(){
       return this.price;
   }
}
