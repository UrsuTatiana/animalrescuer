package org.fasttracit;

public class Rescuer extends Person {

    double availableAmount;


    public Rescuer(String name, int age, int availableAmount) {
        super(name, age);
        this.availableAmount = availableAmount;
}

    public void feedTheAnimal(Animal animal, PetFood petFood){
        System.out.println(this.name + " just gave some " + petFood.name + " to "+ animal.name);
        if (petFood.name.equals(animal.favoriteFood)){
           animal.happinessLevel++;}
        animal.levelOfFeelingHungry--;
    }

    public void recreateTheAnimal(Rescuer rescuer, RecreationActivity recreationActivity, Animal animal){
        System.out.println(this.name + " is " + recreationActivity.name + " with " + animal.name);
        if (recreationActivity.name.equals(animal.favoriteRecreationActivity)){
            animal.happinessLevel = animal.happinessLevel + 2;
        }
        animal.happinessLevel++;

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


