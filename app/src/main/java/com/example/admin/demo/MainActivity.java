package com.example.admin.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int i = 0;
        setContentView(R.layout.activity_main);

        onRestart();

        onRestart();

        onResume();
        onResume();
    }
}
