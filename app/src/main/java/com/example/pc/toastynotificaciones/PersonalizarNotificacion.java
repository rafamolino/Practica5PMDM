package com.example.pc.toastynotificaciones;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalizarNotificacion extends AppCompatActivity {

    Button btnEnviar;
    EditText editTitulo;
    EditText editMensaje;
    EditText editTiempo;
    AppCompatActivity estaActividad;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalizar_notificacion);

        btnEnviar = findViewById(R.id.btnEnviar);
        editTitulo = findViewById(R.id.editTitulo);
        editMensaje = findViewById(R.id.editMensaje);
        editTiempo = findViewById(R.id.editTiempo);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    public void enviarNotificacion(View view) throws InterruptedException {
        PendingIntent i = PendingIntent.getActivity(this, 0, getIntent(), 0);
        final NotificationCompat.Builder nb = new NotificationCompat.Builder(estaActividad);
        nb.setContentTitle(editTitulo.getText().toString()).setContentText(editMensaje.getText().toString()).setSmallIcon(R.drawable.icono).setContentIntent(i);

        (new Thread() {
            public void run() {
                try {
                    Thread.sleep(Integer.parseInt(editTiempo.getText().toString()) * 1000);
                    NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    nm.notify(0, nb.build());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
