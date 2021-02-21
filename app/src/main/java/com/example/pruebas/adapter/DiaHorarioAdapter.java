package com.example.pruebas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pruebas.R;
import com.example.pruebas.modelo.DiaHorario;

import java.util.List;

public class DiaHorarioAdapter extends ArrayAdapter<DiaHorario> {

    public DiaHorarioAdapter(@NonNull Context context, List<DiaHorario> objetos) {
        super(context, R.layout.list_template, objetos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.list_template, null);

        TextView titulo = (TextView) item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView) item.findViewById(R.id.subtitulo);

        titulo.setText(getItem(position).getAsignatura());
        subtitulo.setText(getItem(position).getDia());

        return item;
    }
}
