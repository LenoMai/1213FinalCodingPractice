package Prob2;

public class Human extends Mammal{
    
    public Human(String name, int age, double weight){
        super(name, age, weight);
    }

    @Override 
    public String animalSound(){
        return "Hello!";
    }

}
