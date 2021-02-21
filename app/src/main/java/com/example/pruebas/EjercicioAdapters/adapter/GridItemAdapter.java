package com.example.pruebas.EjercicioAdapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pruebas.EjercicioAdapters.modelo.ListItem;
import com.example.pruebas.R;

import java.util.List;

public class GridItemAdapter extends ArrayAdapter<ListItem> {

    public GridItemAdapter(Context context, List<ListItem> objects) {
        super(context, R.layout.grid_template_adapters, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        View item = convertView;
        if (convertView == null) {
            item = inflater.inflate(R.layout.grid_template_adapters, null);
        }

        TextView titulo = (TextView) item.findViewById(R.id.grid_titulo);
        TextView subtitulo = (TextView) item.findViewById(R.id.grid_subtitulo);
        ImageView imagen = (ImageView) item.findViewById(R.id.grid_imagen);

        titulo.setText(getItem(position).getTitulo());
        subtitulo.setText(getItem(position).getSubtitulo());
        imagen.setImageResource(getItem(position).getImagen());

        return item;
    }

}
