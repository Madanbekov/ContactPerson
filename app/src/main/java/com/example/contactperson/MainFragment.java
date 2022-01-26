package com.example.contactperson;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Contact> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Contact("Geektech O!","+996 507 05 20 18"));
        list.add(new Contact("Geektech Beeline","+996 777 05 20 18"));
        list.add(new Contact("Geektech MegaCom","+996 557 05 20 18"));
        list.add(new Contact("Optima Bank","+996 312 90 59 59"));
        list.add(new Contact("MBank","+996 312 61 33 33"));
        list.add(new Contact("MBank","+996 312 61 33 33"));
        list.add(new Contact("Beka","+996 999 08 87 86"));
        list.add(new Contact("Работа","+996 312 00 00 00"));
        list.add(new Contact("FreshBox","+996 559 00 11 22"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));
        list.add(new Contact("Империя Пиццы","+996 312 54 94 11"));

    }
}
