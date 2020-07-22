package com.example.projecta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.libsubmodulea.model.Module;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Module module = new Module();
    }
}