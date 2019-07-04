package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private CheckBox pi;
    private CheckBox co;
    private CheckBox ice;
    private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pi = findViewById(R.id.checkBox);
        co = findViewById(R.id.checkBox2);
        ice = findViewById(R.id.checkBox3);

    }
}
