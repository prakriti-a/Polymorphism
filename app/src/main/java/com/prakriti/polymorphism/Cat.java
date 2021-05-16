package com.prakriti.polymorphism;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Cat extends Animal{

    private int catClaws;
    boolean isDomestic;

    public Cat(Context context, String animalName, String animalColor, int animalLegs, int animalEyes, int catClaws, boolean isDomestic) {
        super(context, animalName, animalColor, animalLegs, animalEyes);
        this.catClaws = catClaws;
        this.isDomestic = isDomestic;
        Log.i("INHERITANCE", "CAT Class Constructor");
    }

    public int getCatClaws() {
        Toast.makeText(context, "CAT CLASS", Toast.LENGTH_SHORT).show();
        return catClaws;
    }

    public void setCatClaws(int catClaws) {
        Toast.makeText(context, "CAT CLASS", Toast.LENGTH_SHORT).show();
        this.catClaws = catClaws;
    }

    public boolean isDomestic() {
        Toast.makeText(context, "CAT CLASS", Toast.LENGTH_SHORT).show();
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        Toast.makeText(context, "CAT CLASS", Toast.LENGTH_SHORT).show();
        isDomestic = domestic;
    }

    @Override
    public void testMethod() {
        Log.i("INHERITANCE", "Inside Class CAT");
    }

    @Override
    public String toString() {
        return "Cat -> " + super.toString() + "\nNo. of claws= " +getCatClaws() +"\nIs domestic= " + isDomestic();
    }
}