package com.example.combination;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivityRecycleView extends AppCompatActivity {
RecyclerView my_recycle;
String my_pet_lists[],my_pet_description[];
MyOwnAdapter ad;

int imageResources [] ={R.drawable.ant,R.drawable.bees, R.drawable.cat, R.drawable.dog, R.drawable.elephant ,R.drawable.shark, R.drawable.piggeon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycle_view);
        my_recycle = findViewById(R.id.my_recycle);

        my_pet_lists = getResources().getStringArray(R.array.my_pet_lists);
        my_pet_description = getResources().getStringArray(R.array.my_pet_description);

        ad = new MyOwnAdapter(this, my_pet_lists, my_pet_description, imageResources);
        my_recycle.setAdapter(ad);
        my_recycle.setLayoutManager(new LinearLayoutManager(this));
    }
}
