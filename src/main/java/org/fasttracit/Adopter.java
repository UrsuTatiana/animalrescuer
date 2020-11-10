package org.fasttracit;

public class Adopter extends Person {

    double availableAmount;


    public Adopter(String name, int age, int availableAmount) {
        super(name, age);
        this.availableAmount = availableAmount;
}

    public void feedTheAnimal(Animal animal, PetFood petFood){
        System.out.println(this.name + " just gave some " + petFood.name + " to "+ animal.name);
        animal.levelOfFeelingHungry --;
    }

    public void recreateTheAnimal(Adopter adopter,RecreationActivity recreationActivity, Animal animal){

        System.out.println(this.name + " is " + recreationActivity.name + " with " + animal.name);
        animal.moodLevel ++;
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "availableAmount=" + availableAmount +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


