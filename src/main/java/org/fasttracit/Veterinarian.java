package org.fasttracit;

public class Veterinarian extends Person{

    String specialization;

    public Veterinarian(String name, int age,  String specialization){
        super(name, age);
        this.specialization = specialization;

    }


}
