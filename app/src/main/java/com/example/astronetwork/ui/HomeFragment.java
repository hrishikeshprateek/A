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

public class HomeFragment extends Fragment {

    RecyclerView ver_astr,rv_home_blogs , rv_shops;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);

        ver_astr = root.findViewById(R.id.ver_astr);
        rv_home_blogs = root.findViewById(R.id.rv_home_blogs);
        rv_shops = root.findViewById(R.id.rv_shops);

        List<String> list = new ArrayList<>();
        list.add("User Name");
        list.add("User Name");
        list.add("User Name");

        ver_astr.setAdapter(new HomeAstroAdapter(getContext(),list));
        rv_home_blogs.setAdapter(new HomeBlogsAdapter(getContext(),list));
        rv_shops.setAdapter(new HomeShopAdapter(getContext(),list));

        return root;
    }

}