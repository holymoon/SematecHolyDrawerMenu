package com.example.sematecholydrawermenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolyRecyclerAdapter  extends RecyclerView.Adapter<HolyRecyclerAdapter.HolyRecyclerViewHolder> {


    @NonNull
    @Override
    public HolyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        HolyRecyclerViewHolder holder = new HolyRecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolyRecyclerViewHolder holder, int position) {
        switch (position) {
            case 0:
                holder.btnProfile.setText("PROFILE");
                break;
            case 1:
                holder.btnDial.setText("DIAL");
                break;

        }
        holder.btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ReviewActivity.class);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class HolyRecyclerViewHolder extends RecyclerView.ViewHolder{
        Button btnProfile;
        Button btnDial;
        public HolyRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
           btnProfile = itemView.findViewById(R.id.btnProfile);
           btnDial = itemView.findViewById(R.id.btnDial);

        }
    }
}
