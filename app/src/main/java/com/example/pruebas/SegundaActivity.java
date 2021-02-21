package com.example.pruebas;

import android.app.NotificationManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_activity);

//        Log.wtf("SegundaActivity", "onCreate");

        /* Pasar informacion entre actividades */
//        Bundle datos = this.getIntent().getExtras();
//        int id = datos.getInt("Identificacion");
//        String nombre = datos.getString("Nombre");
//        double estatura = datos.getDouble("Estatura");
//
//        TextView text = (TextView)findViewById(R.id.Caja);
//        text.setText("Telefono: " + id + "\nNombre: " + nombre + "\nEstatura: " + estatura);

        /* Notificaciones con actividad */
        NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(getIntent().getExtras().getInt("NotificacionID"));
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.wtf("SegundaActivity", "onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.wtf("SegundaActivity", "onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.wtf("SegundaActivity", "onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.wtf("SegundaActivity", "onStop");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.wtf("SegundaActivity", "onRestart");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.wtf("SegundaActivity", "onDestroy");
//    }

}
