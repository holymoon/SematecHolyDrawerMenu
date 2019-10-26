package com.example.sematecholydrawermenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HolyRecyclerAdapter  extends RecyclerView.Adapter<HolyRecyclerAdapter.HolyRecyclerViewHolder> {
    ArrayList<String> myList;
    public HolyRecyclerAdapter(ArrayList list){
        myList = list;
    }


    @NonNull
    @Override
    public HolyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        HolyRecyclerViewHolder holder = new HolyRecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolyRecyclerViewHolder holder, int position) {
        holder.btnName.setText(myList.get(position));


    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class HolyRecyclerViewHolder extends RecyclerView.ViewHolder{
        Button btnName;
        public HolyRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
           btnName = itemView.findViewById(R.id.btnName);


        }
    }
}
