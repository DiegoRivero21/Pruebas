package com.example.pruebas.EjercicioAdapters;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pruebas.EjercicioAdapters.adapter.GridItemAdapter;
import com.example.pruebas.EjercicioAdapters.modelo.ListItem;
import com.example.pruebas.R;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    private GridView grid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridItemAdapter adapter = new GridItemAdapter(this, listar());
        grid = (GridView) findViewById(R.id.gridAc);
        grid.setAdapter(adapter);

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
