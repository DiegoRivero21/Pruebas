package com.example.pruebas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Email extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.email, container, false);

        String [] emails = new String[]{"Juan Perez", "Maria Villa", "Luis Campos", "Cristiano", "Lionel"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, emails);
        ListView listView = (ListView) view.findViewById(R.id.email);
        listView.setAdapter(arrayAdapter);

        return view;

    }
}
