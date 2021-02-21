package com.example.pruebas;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import com.example.pruebas.EjercicioAdapters.GridActivity;
import com.example.pruebas.EjercicioAdapters.SpinnerActivity;
import com.example.pruebas.GridViewAdapters.adapter.CalendarioAdapter;
import com.example.pruebas.GridViewAdapters.modelo.Calendario;
import com.example.pruebas.Sipinner.adapter.HorarioSpinnerAdapter;
import com.example.pruebas.adapter.DiaHorarioAdapter;
import com.example.pruebas.modelo.DiaHorario;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_INICIO = "estado_inicio";

    private EditText editEmail, editContrasena;
    private TextView txtInicio;

    private ListView horario;
    private ArrayList<DiaHorario> lista;
    //private TextView opcion;

    private Button btnAlarma;

    private Spinner spinner;
    private ArrayList<com.example.pruebas.Sipinner.DiaHorario> listElementos;
    private TextView opcion;

    private GridView gridView;

    int ID = 1;

    private static final String CHANNEL_ID = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        // numero1 = (EditText) findViewById(R.id.numero1);
        // numero2 = (EditText) findViewById(R.id.numero2);

//        Log.wtf("Cilco de vida", "onCreate");

        /*editEmail = (EditText) findViewById(R.id.edit_email);
        editContrasena = (EditText) findViewById(R.id.edit_contrasena);
        txtInicio = (TextView) findViewById(R.id.txt_inicio);*/

        /*final String[] titulos = getResources().getStringArray(R.array.horario_de_clases);
        String[] subtitulos = getResources().getStringArray(R.array.dias_semana);

        lista = new ArrayList<>();

        for (int i = 0; i < titulos.length; i++) {
            lista.add(new DiaHorario(titulos[i], subtitulos[i]));
        }

        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titulos);
        // ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.horario_de_clases, android.R.layout.simple_list_item_1);
        DiaHorarioAdapter adapter = new DiaHorarioAdapter(this, lista);
        opcion = (TextView) findViewById(R.id.opcion);

        horario = (ListView) findViewById(R.id.lista);
        horario.setAdapter(adapter);

        horario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                opcion.setText("Opcion: " + titulos[i]);
            }
        });*/

        /*btnAlarma = (Button) findViewById(R.id.btnAlarma);

        btnAlarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navegarAlarma(view);
            }
        });*/

        // LLenando un spinner con ArrayAdapter
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.horario_de_clases, android.R.layout.simple_spinner_item);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Llenando spinner con un adapter personalizado
        /*final String[] titulos = getResources().getStringArray(R.array.horario_de_clases);
        String[] subtitulos = getResources().getStringArray(R.array.dias_semana);
        listElementos = new ArrayList<>();

        for (int i = 0; i < titulos.length; i++) {
            listElementos.add(new com.example.pruebas.Sipinner.DiaHorario(titulos[i], subtitulos[i]));
        }

        HorarioSpinnerAdapter adapter = new HorarioSpinnerAdapter(this, listElementos);

        spinner = (Spinner) findViewById(R.id.spinner);
        opcion = (TextView) findViewById(R.id.opcion);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                opcion.setText("Opcion: " + titulos[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                opcion.setText("Opcion: ");
            }
        });*/

        // Utilizando clase adapter para un GridView
        /*CalendarioAdapter adapter = new CalendarioAdapter(this, listar());

        gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(adapter);*/

        /* Intent implicito */
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nextui.com"));
//        startActivity(intent);

        /* Acciones en intents implicitos */
//        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
//        startActivity(intent);

        /* Pasar informacion entre actividades */
//        Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
//        intent.putExtra("Identificacion", 123);
//        intent.putExtra("Nombre", "Diego");
//        intent.putExtra("Estatura", 1.8);
//        startActivity(intent);


//        createNotificationChannel();



    }

//        Fragmentos dinamicos
    public void mostrar(View view){
        //Al trabajar con Fragmentos en AndroidX, se debe utilizar este método para instanciar el FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Email email = new Email();
        fragmentTransaction.add(R.id.contenedor, email);
        fragmentTransaction.commit();
    }

    /* Notificaciones con actividad */
    // Metodo predeterminado para crear un canal de notificaciones
    /*private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            String name = "Nombre del canal";
            String descripcion = "Descripcion del canal de notificacion de mi app";
            int importance = NotificationManager.IMPORTANCE_HIGH;

            NotificationChannel canal = new NotificationChannel(CHANNEL_ID, name, importance);
            canal.setDescription(descripcion);
            canal.enableVibration(true);
            canal.enableLights(true);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(canal);
        }
    }

    public void notificar(View view){
        Intent i = new Intent(MainActivity.this, SegundaActivity.class);
        i.putExtra("NotificacionID", ID);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, i, 0);

        NotificationManager noti = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        Uri sonido = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Notification n = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentIntent(pendingIntent)
                .setTicker("Click aqui")
                .setContentTitle("Notificacion nueva")
                .setContentText("Contenido de la notificacion")
                .setSubText("Subtexto")
                .setSmallIcon(R.mipmap.ic_launcher)
                .addAction(R.mipmap.ic_launcher, "Click aqui", pendingIntent)
                .addAction(android.R.drawable.ic_menu_share, "Conpartir", pendingIntent)
                .setVibrate(new long[]{1000, 500, 1000, 5000})
                .setPriority(Notification.PRIORITY_MAX)
                .setSound(sonido)
                .setLights(Color.BLUE, 1, 0)
                .build();
        noti.notify(ID, n);
    }*/

    /* Alerta Toast */
    /*public void metodo(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Este es un toast", Toast.LENGTH_LONG);
        toast.show();
    }*/

    /* SnackBar */
    /*public void snackbar(View view) {
        Snackbar snackbar = Snackbar.make(view, "Notificacion", Snackbar.LENGTH_LONG)
                .setAction("Accion ejemplo", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Este es el toast", Toast.LENGTH_LONG).show();
                    }
                });

        snackbar.setActionTextColor(Color.GREEN);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(Color.BLUE);
        snackbar.show();
    }*/

//    public void lanzarActividad(View view) {
//        Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
//        startActivity(intent);
//    }

    // Ejercicio Adapter - Spinner y GridView
//    public void navegarSpinner(View view){
//        Intent intent = new Intent(this, SpinnerActivity.class);
//        startActivity(intent);
//    }
//
//    public void navegarGrid(View view){
//        Intent intent = new Intent(this, GridActivity.class);
//        startActivity(intent);
//    }

    // Utilizando clase adapter para un GridView
    /*private ArrayList<Calendario>  listar() {
        String[] meses = getResources().getStringArray(R.array.meses);
        TypedArray imagenes = getResources().obtainTypedArray(R.array.zodiaco);

        ArrayList<Calendario> lista = new ArrayList<>();

        for (int i = 0; i < meses.length; i++) {
            lista.add(new Calendario(imagenes.getResourceId(i, 0), meses[i]));
        }

        return lista;
    }*/

//    public void navegarAlarma(View view){
//        Intent intent = new Intent(this, AlarmaActivity.class);
//        startActivity(intent);
//    }

    /*public void onClickInicioSesion(View view){
        txtInicio.setText("La sesión ha sido iniciada correctamente" +
                "\nUserName: "+editEmail.getText());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_INICIO,txtInicio.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        txtInicio.setText(savedInstanceState.getString(STATE_INICIO));
    }*/

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.wtf("Cilco de vida", "onStart");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.wtf("Cilco de vida", "onRestart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.wtf("Cilco de vida", "onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.wtf("Cilco de vida", "onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.wtf("Cilco de vida", "onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.wtf("Cilco de vida", "onDestroy");
//    }

    /* public void sumar(View view){
        Intent intent = new Intent(this, SumarActivity.class);
        if (numero1.getText().toString().equals("") || numero2.getText().toString().equals("")){
            intent.putExtra("numero1", 0);
            intent.putExtra("numero2", 0);
        }else {
            intent.putExtra("numero1", Integer.parseInt(numero1.getText().toString()));
            intent.putExtra("numero2", Integer.parseInt(numero2.getText().toString()));
        }
        startActivity(intent);
    } */
}