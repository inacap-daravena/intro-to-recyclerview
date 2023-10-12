package com.example.intro_to_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvIntro = findViewById(R.id.rvIntro);
        rvIntro.setLayoutManager(new LinearLayoutManager(this));

        String[] dataset = new String[5];
        dataset[0] = "Hola mundo";

        rvIntro.setAdapter(new ObjectAdapter(dataset));
    }
}