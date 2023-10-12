package com.example.intro_to_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ObjectAdapter extends RecyclerView.Adapter<ObjectViewHolder> {

    private String[] objectDataset;

    public ObjectAdapter(String[] objectDataset) {
        this.objectDataset = objectDataset;
    }

    @NonNull
    @Override
    public ObjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.listitem_object, parent, false);
        return new ObjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ObjectViewHolder holder, int position) {
        holder.getTxt_listitem_name().setText(objectDataset[position]);
    }

    @Override
    public int getItemCount() {
        return objectDataset.length;
    }
}
