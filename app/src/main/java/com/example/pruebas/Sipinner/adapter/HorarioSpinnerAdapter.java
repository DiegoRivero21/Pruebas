package com.example.pruebas.Sipinner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pruebas.R;
import com.example.pruebas.Sipinner.DiaHorario;

import java.util.List;

public class HorarioSpinnerAdapter extends ArrayAdapter<DiaHorario> {
    public HorarioSpinnerAdapter(@NonNull Context context, List<DiaHorario> objects) {
        super(context, R.layout.spinner_template, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View elemento = inflater.inflate(R.layout.spinner_template, null);

        TextView titulo = (TextView) elemento.findViewById(R.id.titulo);
        TextView subtitulo = (TextView) elemento.findViewById(R.id.subtitulo);

        titulo.setText(getItem(position).getAsignatura());
        subtitulo.setText(getItem(position).getDia());

        return elemento;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View elemento = inflater.inflate(R.layout.spinner_template, null);

        TextView titulo = (TextView) elemento.findViewById(R.id.titulo);
        TextView subtitulo = (TextView) elemento.findViewById(R.id.subtitulo);

        titulo.setText(getItem(position).getAsignatura());
        subtitulo.setText(getItem(position).getDia());

        return elemento;
    }
}
