package com.example.newfragmentbundleargumentsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// changed with static method
//        ExampleFragment fragment = new ExampleFragment();
//        Bundle args = new Bundle();
//        args.putString("argText", "text example");
//        args.putInt("argNumber", 123);
//        fragment.setArguments(args);

        int theNumber = 666;
//        ExampleFragment fragment = ExampleFragment.newInstance("Fragment is opened and this Text and this Number are passed to it by static constructor newInstance Two parameters Text and Number!, theNumber);
        ExampleFragment fragment = ExampleFragment.newInstance(String.format("Fragment is opened and this Text with this Number %s line parameter in the text are passed to it by static constructor newInstance only one parameter Text!",theNumber));


        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}