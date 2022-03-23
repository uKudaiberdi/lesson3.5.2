package com.example.lesson352;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ContactAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.contact);
        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Ademi");
        contacts.add("Adis");
        contacts.add("Aisha");
        contacts.add("Diana");
        contacts.add("Aidai");
        contacts.add("Kuba");
        contacts.add("Emil");
        contacts.add("Shirin");
        contacts.add("Uran");
        contacts.add("Faina");
        contacts.add("Nestan");
        contacts.add("Nazima");
        contacts.add("Arsen");
        contacts.add("Adil");
        contacts.add("Aman");
        contacts.add("Aziret");
        contacts.add("Aibek");
        contacts.add("Aidar");
        contacts.add("Aizuura");
        contacts.add("Aisuluu");
        contacts.add("Meerim");
        contacts.add("Alisa");
        contacts.add("Albina");
        contacts.add("Amina");
        contacts.add("Amir");
        contacts.add("Aktan");
        contacts.add("Artem");
        contacts.add("Aniza");
        contacts.add("Arstan");
        contacts.add("Asema");
        contacts.add("Aziza");
        contacts.add("Akun");
        contacts.add("Bogdan");
        adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);
    }
}