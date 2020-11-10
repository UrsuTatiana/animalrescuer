package org.fasttracit;



public class App 
{
    public static void main( String[] args ) {

        Animal animal1 = new Animal("BOB", 2,1,5,5,"Wiskas", "Bal game");
        animal1.name = " Bob";
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


        Adopter adopter1 = new Adopter("John", 25, 100);
        adopter1.name = "John";
        adopter1.availableAmount = 1000;

        PetFood petFood1 = new PetFood();
        petFood1.name = "Brit";
        petFood1.price = 100;
        petFood1.amountOFFood = 5;
        petFood1.isInStock = true;


        RecreationActivity recreationActivity1 = new RecreationActivity();
        recreationActivity1.name = "running";


        Veterinarian veterinarian1 = new Veterinarian("Mike", 30);
        veterinarian1.name = "Mike";

        System.out.println("====================================");

        System.out.println(animal1.levelOfFeelingHungry);
        adopter1.feedTheAnimal(animal1, petFood1);
        System.out.println(animal1.levelOfFeelingHungry);

        System.out.println("+++++++++++++++++++");

        System.out.println(animal1.moodLevel);
        adopter1.recreateTheAnimal(adopter1,recreationActivity1,animal1 );
        System.out.println(animal1.moodLevel);

        System.out.println(animal1.levelOfFeelingHungry);
        adopter1.feedTheAnimal(animal1,petFood1);
        System.out.println(animal1.levelOfFeelingHungry);


    }
}
