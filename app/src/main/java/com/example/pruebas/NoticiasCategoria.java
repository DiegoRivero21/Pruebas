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

public class NoticiasCategoria extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.lista_noticias, container, false);

        String [] versionesAndroid = new String[] {"Boca Juniors campeón de américa.", "Comienzan los Juegos Olímpicos.",
                "Sorteo de UEFA Champions League.", "Empieza el Abierto de Autralia.", "Vuelta a España."};

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, versionesAndroid);

        ListView listView = (ListView) view.findViewById(R.id.lista_noticias);
        listView.setAdapter(arrayAdapter);

        return view;

    }
}
