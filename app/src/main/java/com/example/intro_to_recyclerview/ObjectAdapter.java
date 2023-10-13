package com.example.intro_to_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;

public class ObjectAdapter extends RecyclerView.Adapter<ObjectViewHolder> {

    private JSONArray objectDataset;

    public ObjectAdapter(JSONArray objectDataset) {
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
        try {
            holder.getTxt_listitem_name().setText(
                    // objectDataset[position]
                    objectDataset.getJSONObject(position)
                            .getJSONObject("name")
                            .getString("spanish")
            );

            holder.getTxt_listitem_lastname().setText(
                    objectDataset.getJSONObject(position)
                            .getJSONObject("name")
                            .getString("latin")
            );
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return objectDataset.length();
    }
}
