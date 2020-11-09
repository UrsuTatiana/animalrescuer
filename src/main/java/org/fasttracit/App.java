package org.fasttracit;



public class App 
{
    public static void main( String[] args ) {

        Animal animal1 = new Animal();
        animal1.name = "Dog";
        animal1.age = 2;
        animal1.favoriteFood = "Brit";
        animal1.favoriteRecreationActivity = "Ball game";
        animal1.levelOfFeelingHungry = 5;
        animal1.levelOfHealth = 8;
        animal1.moodLevel = 6;

        System.out.println("The name of dog is: " + animal1.name);
        System.out.println("The " + animal1.name + "is: " + animal1.age );
        System.out.println(animal1.name + "favorite food is: " + animal1.favoriteFood);
        System.out.println("his favorite recreation activity  is: " + animal1.favoriteRecreationActivity);


        Adopter adopter1 = new Adopter();
        adopter1.name = "John";
        adopter1.availableAmount = 1000;

        PetFood petFood1 = new PetFood();
        petFood1.name = "Brit";
        petFood1.price = 100;
        petFood1.amountOFFood = 5;
        petFood1.isInStock = true;


        RecreationActivity recreationActivity1 = new RecreationActivity();
        recreationActivity1.name = "Ball game";


        Veterinarian veterinarian1 = new Veterinarian();
        veterinarian1.name = "Mike";














    }
}
