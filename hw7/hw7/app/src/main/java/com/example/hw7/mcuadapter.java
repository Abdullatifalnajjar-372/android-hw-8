package com.example.hw7;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mcuadapter extends RecyclerView.Adapter {


    ArrayList<Marvel> mArray;
    Context c ;

    public mcuadapter(ArrayList<Marvel> mArray, Context c) {
        this.mArray = mArray;
        this.c = c;
    }

    public mcuadapter(ArrayList<Marvel> mArray) {
        this.mArray = mArray;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mculist,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(mArray.get(position).getImage());
        ((ViewHolder) holder).mname.setText(mArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent i = new Intent(c,Main2Activity.class);
             i.putExtra("marvel",mArray.get(position));
             c.startActivity(i);
            }
        });

        ((ViewHolder)holder).del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mArray.remove(position);
                notifyDataSetChanged();
            }
        });


    }

    @Override
    public int getItemCount() {

        return mArray.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public ImageView del;
        public TextView mname;
        public TextView mpower;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            mname = itemView.findViewById(R.id.name);
            mpower= itemView.findViewById(R.id.power);
            img = itemView.findViewById(R.id.profile_image);
            del = itemView.findViewById(R.id.del);

        }
    }
}
