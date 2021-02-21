package com.example.pruebas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SumarActivity extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_sumar);

        TextView resultado = (TextView) findViewById(R.id.resultado);
        int numero1 = getIntent().getIntExtra("numero1", 0);
        int numero2 = getIntent().getIntExtra("numero2",0);
        resultado.setText("El resultado de la suma es: "+(numero1+numero2));

    }

}
