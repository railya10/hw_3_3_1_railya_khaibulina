package com.example.hw_3_3_1_railya_khaibulina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        ArrayList<String> names = new ArrayList<>();
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");
        names.add("Railya");


        NameAdapter adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}