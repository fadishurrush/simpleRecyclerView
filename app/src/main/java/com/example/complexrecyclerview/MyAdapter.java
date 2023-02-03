package com.example.complexrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] mDataset;
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textview;
        public MyViewHolder (View v)
        {
            super(v);
            textview=v.findViewById(R.id.tvfirstrow);

        }

    }
    public MyAdapter(String[] mDataset) {
        this.mDataset = mDataset;
    }

        @Override
        public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int Viewtype)
        {

            View v= LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.datarow,parent,false);
            return new MyViewHolder( v);
        }



    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
       holder.textview.setText(mDataset[position]);
    }
    @Override
    public int getItemCount()
    {

        return mDataset.length;
    }
}

