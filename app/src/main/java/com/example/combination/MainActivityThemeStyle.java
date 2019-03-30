package com.example.combination;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityThemeStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_theme_style);
    }

    public void doImage1(View view) {
        Toast.makeText(this,"Image Button1 Clicked", Toast.LENGTH_SHORT).show();
    }
}
