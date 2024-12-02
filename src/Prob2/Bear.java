package Prob2;

public class Bear extends Mammal{
    
    private String color;

    public Bear(String name, int age, double weight, String color){
        super(name, age, weight);
        this.color = color;
    }

    @Override
    public String animalSound(){
        return "ROAR!";
    }

    @Override
    public String toString(){
        return super.toString() + "This is a " + color + " bear";
    }

}
