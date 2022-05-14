package com.example.hw_3_3_1_railya_khaibulina;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;


public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView tvNames;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNames = itemView.findViewById(R.id.names);

    }

    public void bind(String name) {
        tvNames.setText(name);
    }
}

