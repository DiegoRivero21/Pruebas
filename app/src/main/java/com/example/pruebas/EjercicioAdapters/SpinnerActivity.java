package com.example.pruebas.EjercicioAdapters;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pruebas.EjercicioAdapters.adapter.SpinnerItemAdapter;
import com.example.pruebas.EjercicioAdapters.modelo.ListItem;
import com.example.pruebas.R;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinner;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        final SpinnerItemAdapter adapter = new SpinnerItemAdapter(this, listar());
        imagen = (ImageView) findViewById(R.id.imagenSpinner);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imagen.setImageResource(adapter.getItem(position).getImagen());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                imagen.setImageResource(adapter.getItem(0).getImagen());
            }
        });
    }

    private ArrayList<ListItem> listar(){
        String[] titulos = getResources().getStringArray(R.array.titulos);
        String[] subtitulos = getResources().getStringArray(R.array.subtitulos);
        TypedArray imagenes = getResources().obtainTypedArray(R.array.imagenes);

        ArrayList<ListItem> lista = new ArrayList<>();

        for (int i=0; i<titulos.length; i++){
            lista.add(new ListItem(titulos[i], subtitulos[i], imagenes.getResourceId(i,0)));
        }

        return lista;
    }

}
