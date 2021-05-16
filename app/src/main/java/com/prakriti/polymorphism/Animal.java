package com.prakriti.polymorphism;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Animal {

    protected Context context;
    private String animalName, animalColor;
    private int animalLegs, animalEyes;

    public Animal(Context context, String animalName, String animalColor, int animalLegs, int animalEyes) {
        if(animalName==null)
            throw new IllegalArgumentException("Name cannot be null");
        this.context = context;
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalLegs = animalLegs;
        this.animalEyes = animalEyes;
        Log.i("INHERITANCE", "ANIMAL Class Constructor");
    }

    public String getAnimalName() {
        Toast.makeText(context, "ANIMAL CLASS", Toast.LENGTH_SHORT).show();
        return animalName;
    }

    public void setAnimalName(String animalName) {
        Toast.makeText(context, "ANIMAL CLASS", Toast.LENGTH_SHORT).show();
        this.animalName = animalName;
    }

    public String getAnimalColor() {
        Toast.makeText(context, "ANIMAL CLASS", Toast.LENGTH_SHORT).show();
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        Toast.makeText(context, "ANIMAL CLASS", Toast.LENGTH_SHORT).show();
        this.animalColor = animalColor;
    }

    public int getAnimalLegs() {
        Toast.makeText(context, "ANIMAL CLASS", Toast.LENGTH_SHORT).show();
        return animalLegs;
    }

    public void setAnimalLegs(int animalLegs) {
        Toast.makeText(context, "ANIMAL CLASS", Toast.LENGTH_SHORT).show();
        this.animalLegs = animalLegs;
    }

    public int getAnimalEyes() {
        Toast.makeText(context, "ANIMAL CLASS", Toast.LENGTH_SHORT).show();
        return animalEyes;
    }

    public void setAnimalEyes(int animalEyes) {
        Toast.makeText(context, "ANIMAL CLASS", Toast.LENGTH_SHORT).show();
        this.animalEyes = animalEyes;
    }

    public void testMethod() {
        Log.i("INHERITANCE", "Inside Class ANIMAL");
    }

    @Override
    public String toString() {
        return "Animal -> \nName= " + getAnimalName() + "\nColor= " + getAnimalColor() +
                "\nNo. of legs= " + getAnimalLegs() + "\nNo. of eyes= " + getAnimalEyes();
    }
}