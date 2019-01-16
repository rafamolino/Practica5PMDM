package com.example.pc.toastynotificaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button apartado1;
    Button apartado2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apartado1 = findViewById(R.id.apartado1);
        apartado2 = findViewById(R.id.apartado2);


        apartado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PersonalizarToast.class);
                startActivityForResult(intent, 0);

            }
        });

        apartado2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PersonalizarNotificacion.class);
                startActivityForResult(intent, 0);

            }
        });

    }
}
