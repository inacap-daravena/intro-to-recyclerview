package com.example.intro_to_recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ObjectViewHolder extends RecyclerView.ViewHolder {

    private TextView txt_listitem_name, txt_listitem_lastname;

    public ObjectViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_listitem_name = itemView.findViewById(R.id.txt_listitem_name);
        txt_listitem_lastname = itemView.findViewById(R.id.txt_listitem_lastname);
    }

    // Alt + Insert

    public TextView getTxt_listitem_name() {
        return txt_listitem_name;
    }

    public TextView getTxt_listitem_lastname() {
        return txt_listitem_lastname;
    }
}
