package org.fasttracit;

public class Animal {

    public int moodLevel;
    String name;
    int age;
    int levelOfHealth;
    int levelOfFeelingHungry;
    int happinessLevel;
    String favoriteFood;
    String favoriteRecreationActivity;

    public Animal(String name, int age, int levelOfHealth, int levelOfFeelingHungry, int happinessLevel, String favoriteFood, String favoriteRecreationActivity) {
        this.name = name;
        this.age = age;
        this.levelOfHealth = levelOfHealth;
        this.levelOfFeelingHungry = levelOfFeelingHungry;
        this.happinessLevel = happinessLevel;
        this.favoriteFood = favoriteFood;
        this.favoriteRecreationActivity = favoriteRecreationActivity;
    }
}
