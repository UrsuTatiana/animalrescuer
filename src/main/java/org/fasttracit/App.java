package org.fasttracit;



public class App 
{
    public static <Adopter> void main(String[] args ) {

        Animal animal1 = new Animal("BOB", 2,1,5,5,"Wiskas", "Ball game");
        animal1.name = " Bob";
        animal1.age = 2;
        animal1.favoriteFood = "Brit";
        animal1.favoriteRecreationActivity = "Ball game";
        animal1.levelOfFeelingHungry = 5;
        animal1.levelOfHealth = 8;
        animal1.happinessLevel = 7;

        System.out.println("The name of dog is: " + animal1.name);
        System.out.println("The " + animal1.name + "is: " + animal1.age );
        System.out.println(animal1.name + "favorite food is: " + animal1.favoriteFood);
        System.out.println("his favorite recreation activity  is: " + animal1.favoriteRecreationActivity);


        Rescuer rescuer1 = new Rescuer("John", 25, 100);
        rescuer1.name = "John";
        rescuer1.availableAmount = 1000;

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        PetFood petFood1 = new PetFood("Brit", 100, 5, 10,true);
        /*petFood1.name = "Brit";
        petFood1.price = 100;
        petFood1.amountOFFood = 5;
        petFood1.isInStock = true;*/


        System.out.println(petFood1.expirationDate);

        System.out.println("------------------------------");

        RecreationActivity recreationActivity1 = new RecreationActivity("running");
        recreationActivity1.name = "running";


        Veterinarian veterinarian1 = new Veterinarian ("Mike", 30, "surgeon");
        veterinarian1.name = "Mike";

        System.out.println("====================================");

        System.out.println(animal1.levelOfFeelingHungry);
        rescuer1.feedTheAnimal(animal1, petFood1);
        System.out.println(animal1.levelOfFeelingHungry);

        System.out.println("+++++++++++++++++++");

        System.out.println(animal1.happinessLevel);
        rescuer1.recreateTheAnimal(rescuer1,recreationActivity1,animal1 );
        System.out.println("level of happiness is: " + animal1.happinessLevel);

        System.out.println(animal1.levelOfFeelingHungry);
        rescuer1.feedTheAnimal(animal1,petFood1);
        System.out.println(animal1.levelOfFeelingHungry);


    }
}
