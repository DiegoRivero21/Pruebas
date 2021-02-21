package com.example.pruebas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pruebas.adapter.AlarmaAdapter;
import com.example.pruebas.modelo.Alarma;

import java.util.ArrayList;

public class AlarmaActivity extends AppCompatActivity {
    private ListView listaAlarma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        AlarmaAdapter adapter = new AlarmaAdapter(this, listar());
        listaAlarma = (ListView) findViewById(R.id.listaAlarma);
        listaAlarma.setAdapter(adapter);
    }

    private ArrayList<Alarma> listar(){
        String[] alarmas = getResources().getStringArray(R.array.alarmas);
        ArrayList<Alarma> lista = new ArrayList<>();
        for (String alarma: alarmas) {
            lista.add(new Alarma(alarma,false));
        }

        return lista;
    }
}
