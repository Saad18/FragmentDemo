package com.example.fragmentdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.ViewHolder> {

   private Context context;
   private String[] name;

    ArrayAdapter(Context context, String[] name) {
        this.context = context;
        this.name = name;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       context = parent.getContext();
       LayoutInflater inflater = LayoutInflater.from(context);
       View view = inflater.inflate(R.layout.item_list,parent,false);

       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.personName.setText(name[position]);
        holder.personName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;
                AppCompatActivity activity = (AppCompatActivity) v.getContext();


                if(position == 0){

                    fragment = new JobsFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.detailsFrag,fragment).addToBackStack(null).commit();
                }
                else if(position == 1){
                    fragment = new einstineFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.detailsFrag, fragment).addToBackStack(null).commit();
                }
            }

        });

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView personName;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            personName = itemView.findViewById(R.id.personId);
        }
    }
}
