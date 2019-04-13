package com.example.codea2;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // A continuación mi código para OnCreate
        Mensaje("Codea2 te da la bienvenida.");

        getSupportActionBar().setTitle("Inicio");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Background)));

        Button Jugar = (Button) findViewById(R.id.jugar);
        Button Cuenta = (Button) findViewById(R.id.cuenta);
        Button video = (Button) findViewById(R.id.video);

        Jugar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
             Intent intent = new Intent(getApplicationContext(), Preguntas.class);
             startActivity(intent);
            }
        });
        Cuenta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
             Intent intent2 = new Intent(getApplicationContext(), Act02.class);
             startActivity(intent2);
            }
        });
        video.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mOpCL3ggpCQ")));
            }
        });
    } // Fin del Oncreate de la Actividad 01

    public void Mensaje(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();};

} // [11:00:42 PM] Fin de la Clase Actividad 01