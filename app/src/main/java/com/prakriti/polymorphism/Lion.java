package com.prakriti.polymorphism;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Lion extends Animal {

    private String gender;
    private int age;

    public Lion(Context context, String animalName, String animalColor, int animalLegs, int animalEyes, String gender, int age) {
        super(context, animalName, animalColor, animalLegs, animalEyes);
        if(gender==null)
            throw new IllegalArgumentException("Gender cannot be null");
        this.gender = gender;
        this.age = age;
        Log.i("INHERITANCE", "LION Class Constructor");
    }

    public String getGender() {
        Toast.makeText(context, "LION CLASS", Toast.LENGTH_SHORT).show();
        return gender;
    }

    public void setGender(String gender) {
        Toast.makeText(context, "LION CLASS", Toast.LENGTH_SHORT).show();
        this.gender = gender;
    }

    public int getAge() {
        Toast.makeText(context, "LION CLASS", Toast.LENGTH_SHORT).show();
        return age;
    }

    public void setAge(int age) {
        Toast.makeText(context, "LION CLASS", Toast.LENGTH_SHORT).show();
        this.age = age;
    }

    @Override
    public void testMethod() {
        Log.i("INHERITANCE", "Inside Class LION");
    }

    @Override
    public String toString() {
        return "Lion -> " + super.toString() + "\nGender= " + getGender() + "\nAge= " + getAge();
    }
}