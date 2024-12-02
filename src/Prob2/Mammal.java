package Prob2;

public abstract class Mammal implements Comparable<Mammal>{
    private String name;
    private int age;
    private double weight;

    public Mammal(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract String animalSound();

    public String toString(){
        return "Their name is " + name + ". They are " + age + " years old. Their weight is " + weight + ". They go " + animalSound();
    }

    public int getAge(){
        return age;
    }

    //Compares Age
    public int compareTo(Mammal other){
        if(this.age > other.getAge()){
            return 1;
        } else if(this.age == other.getAge()){
            return 0;
        } else if(this.age < other.getAge()){
            return -1;
        }
        return 0;
    }
}
