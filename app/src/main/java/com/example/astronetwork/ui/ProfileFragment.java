package com.example.astronetwork.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.astronetwork.R;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends AppCompatActivity {

    RecyclerView rv_astro,rv_chat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile);


        rv_astro = findViewById(R.id.rv_astro);
        rv_chat = findViewById(R.id.rv_chat);

        findViewById(R.id.back).setOnClickListener(r->finish());

        List<String> list = new ArrayList<>();
        list.add("User Name");
        list.add("User Name");
        list.add("User Name");

        rv_astro.setAdapter(new ProfilePersonAdapter(this,list));
        rv_chat.setAdapter(new ProfileChatAdapter(this,list));

    }
}