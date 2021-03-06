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

public class Categorias extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.categorias, container, false);

        String [] versionesAndroid = new String[] {"Principales", "Política", "Economía",
                "Deportes", "Entretenimiento", "Internacional", "Opinión"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, versionesAndroid);

        ListView listView = (ListView) view.findViewById(R.id.lista_categoria);
        listView.setAdapter(arrayAdapter);

        return view;
    }
}
