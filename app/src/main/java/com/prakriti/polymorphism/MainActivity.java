package com.prakriti.polymorphism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnimal, txtLion, txtPoly, txtCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnimal = findViewById(R.id.txtAnimal);
        txtLion = findViewById(R.id.txtLion);
        txtPoly = findViewById(R.id.txtPoly);
        txtCat = findViewById(R.id.txtCat);

        createAnimal();
    }

    public void createAnimal() {

        Animal firstAnimal = new Animal(this, "Big Black Bear", "Black", 4, 2);
     //   Animal secondAnimal = new Animal(this, "Rattlesnake", "Black",0, 2);

        Lion myLion = new Lion(this, "African Lion","Yellow",
                4, 2, "Male",4);

        txtAnimal.setText(firstAnimal.toString());
        firstAnimal.testMethod();

        txtLion.setText(myLion.toString());
        myLion.testMethod();

        Animal thirdAnimal = new Lion(this, "White Lion", "White",
                4, 2, "Female", 5);
        txtPoly.setText(thirdAnimal.toString());

        Cat myCat = new Cat(this, "Bobcat", "Black and White",
                4, 2, 5, true);
        txtCat.setText(myCat.toString());
        myCat.testMethod();

    }
}