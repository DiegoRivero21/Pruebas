package com.example.pruebas.EjercicioAdapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pruebas.EjercicioAdapters.modelo.ListItem;
import com.example.pruebas.R;

import java.util.List;

public class SpinnerItemAdapter extends ArrayAdapter<ListItem> {

    public SpinnerItemAdapter(Context context, List<ListItem> objects) {
        super(context, R.layout.spinner_template, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        View item = convertView;
        if (convertView == null){
            item = inflater.inflate(R.layout.spinner_template, null);
        }

        TextView titulo = (TextView) item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView) item.findViewById(R.id.subtitulo);

        titulo.setText(getItem(position).getTitulo());
        subtitulo.setText(getItem(position).getSubtitulo());

        return item;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        View item = convertView;
        if (convertView == null){
            item = inflater.inflate(R.layout.spinner_template, null);
        }

        TextView titulo = (TextView) item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView) item.findViewById(R.id.subtitulo);

        titulo.setText(getItem(position).getTitulo());
        subtitulo.setText(getItem(position).getSubtitulo());

        return item;
    }

}
