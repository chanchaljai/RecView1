package com.example.recview1;

import static com.example.recview1.R.id.recView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> arrContacts = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new Contact("A","email@email.com", R.drawable.a));
        arrContacts.add(new Contact("B","email@email.com",R.drawable.b));
        arrContacts.add(new Contact("C","email@email.com",R.drawable.c));
        arrContacts.add(new Contact("D","email@email.com",R.drawable.d));
        arrContacts.add(new Contact("E","email@email.com",R.drawable.e));
        arrContacts.add(new Contact("A","email@email.com", R.drawable.a));
        arrContacts.add(new Contact("B","email@email.com",R.drawable.b));
        arrContacts.add(new Contact("C","email@email.com",R.drawable.c));
        arrContacts.add(new Contact("D","email@email.com",R.drawable.d));
        arrContacts.add(new Contact("E","email@email.com",R.drawable.e));
        arrContacts.add(new Contact("A","email@email.com", R.drawable.a));
        arrContacts.add(new Contact("B","email@email.com",R.drawable.b));
        arrContacts.add(new Contact("C","email@email.com",R.drawable.c));
        arrContacts.add(new Contact("D","email@email.com",R.drawable.d));
        arrContacts.add(new Contact("E","email@email.com",R.drawable.e));
        arrContacts.add(new Contact("A","email@email.com", R.drawable.a));
        arrContacts.add(new Contact("B","email@email.com",R.drawable.b));
        arrContacts.add(new Contact("C","email@email.com",R.drawable.c));
        arrContacts.add(new Contact("D","email@email.com",R.drawable.d));
        arrContacts.add(new Contact("E","email@email.com",R.drawable.e));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);

    }
}