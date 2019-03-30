package com.example.combination;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {
    String data_pet_name[], data_pet_description[];
    int img_pet[];
    Context ctx;

    public MyOwnAdapter(Context ct, String d1[], String d2[], int i1[]) {
        data_pet_name = d1;
        data_pet_description = d2;
        ctx = ct;
        img_pet = i1;
    }

    @NonNull
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View myOwnView = myInflater.inflate(R.layout.my_row, parent, false);
        return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder holder, int position) {
        holder.t1.setText(data_pet_name[position]);
        holder.t2.setText(data_pet_description[position]);
        holder.myImage.setImageResource(img_pet[position]);
    }

    @Override
    public int getItemCount() {

        return data_pet_name.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {
        TextView t1,t2 ;
        ImageView myImage;
        public MyOwnHolder(View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.my_textview);
            t2 = itemView.findViewById(R.id.my_textViewDesc);
            myImage = itemView.findViewById(R.id.my_imageView);
        }
    }
}
