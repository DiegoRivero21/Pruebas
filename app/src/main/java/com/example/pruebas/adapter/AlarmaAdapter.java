package com.example.pruebas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.pruebas.R;
import com.example.pruebas.modelo.Alarma;

import java.util.List;

public class AlarmaAdapter extends ArrayAdapter<Alarma> {
    public AlarmaAdapter(Context context, List<Alarma> objects) {
        super(context, R.layout.alarma_template, objects);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = convertView;
        if (convertView == null){
            view = inflater.inflate(R.layout.alarma_template,null);
        }

        //Definicion de objetos de la interfaz grafica
        TextView hora = (TextView) view.findViewById(R.id.hora);
        final TextView activo = (TextView) view.findViewById(R.id.activo);
        Switch btnActivo = (Switch) view.findViewById(R.id.btnActivo);

        //Asignación de valores
        hora.setText(getItem(position).getHora());
        if (getItem(position).isActivo())activo.setText("Activado");
        else activo.setText("Desactivado");

        btnActivo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    activo.setText("Activado");
                    getItem(position).setActivo(isChecked);
                }else {
                    activo.setText("Desactivado");
                    getItem(position).setActivo(isChecked);
                }
            }
        });

        return view;
    }
}
