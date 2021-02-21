package com.example.pruebas.GridViewAdapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pruebas.GridViewAdapters.modelo.Calendario;
import com.example.pruebas.R;

import java.util.ArrayList;

public class CalendarioAdapter extends BaseAdapter {

    private ArrayList<Calendario> elementos;
    private Context context;

    public CalendarioAdapter(Context context, ArrayList<Calendario> elementos) {
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public int getCount() {
        return elementos.size();
    }

    @Override
    public Calendario getItem(int i) {
        return elementos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = convertView;

        if (convertView == null) {
            view = inflater.inflate(R.layout.grid_template, null);
        }

        TextView tituloImagen = (TextView) view.findViewById(R.id.tituloImagen);
        ImageView imagen = (ImageView) view.findViewById(R.id.imagen);

        tituloImagen.setText(getItem(i).getMes());
        imagen.setImageResource(getItem(i).getImagen());

        return view;
    }
}
