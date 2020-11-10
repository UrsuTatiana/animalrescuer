package org.fasttracit;

public class Animal {

    String name;
    int age;
    int levelOfHealth;
    int levelOfFeelingHungry;
    int moodLevel;
    String favoriteFood;
    String favoriteRecreationActivity;

    public Animal(String name, int age, int levelOfHealth, int levelOfFeelingHungry, int moodLevel, String favoriteFood, String favoriteRecreationActivity) {
        this.name = name;
        this.age = age;
        this.levelOfHealth = levelOfHealth;
        this.levelOfFeelingHungry = levelOfFeelingHungry;
        this.moodLevel = moodLevel;
        this.favoriteFood = favoriteFood;
        this.favoriteRecreationActivity = favoriteRecreationActivity;
    }
}
