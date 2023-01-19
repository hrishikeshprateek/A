package com.example.astronetwork.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.astronetwork.R;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    RecyclerView rv_astro,rv_chat;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_profile,container,false);



        rv_astro = root.findViewById(R.id.rv_astro);
        rv_chat = root.findViewById(R.id.rv_chat);

        List<String> list = new ArrayList<>();
        list.add("User Name");
        list.add("User Name");
        list.add("User Name");

        rv_astro.setAdapter(new ProfilePersonAdapter(getContext(),list));
        rv_chat.setAdapter(new ProfileChatAdapter(getContext(),list));


        return root;
    }
}