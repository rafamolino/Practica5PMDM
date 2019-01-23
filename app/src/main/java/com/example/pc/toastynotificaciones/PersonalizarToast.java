package com.example.pc.toastynotificaciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class PersonalizarToast extends AppCompatActivity {


    EditText editTextoToast;
    EditText editDesplazamientoH;
    EditText editDesplazamientoV;
   Button btnMostrar;
   RadioGroup radGrupoH;
    RadioGroup radGrupoV;
    RadioButton radIzquierda;
    RadioButton radMedio;
    RadioButton radDerecha;
    RadioButton radArriba;
    RadioButton radCentro;
    RadioButton radAbajo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalizar_toast);
        editTextoToast = findViewById(R.id.editTextoToast);
        btnMostrar = findViewById(R.id.btnMostrar);
        editDesplazamientoH = findViewById(R.id.editDesplazamientoH);
        editDesplazamientoV = findViewById(R.id.editDesplazamientoV);
        radIzquierda = findViewById(R.id.radIzquierda);
        radMedio = findViewById(R.id.radMedio);
        radDerecha = findViewById(R.id.radDerecha);
        radArriba = findViewById(R.id.radArriba);
        radCentro = findViewById(R.id.radCentro);
        radAbajo = findViewById(R.id.radAbajo);
        radGrupoH = findViewById(R.id.radGrupoH);
        radGrupoV = findViewById(R.id.radGrupoV);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editDesplazamientoH.getText().toString().isEmpty() && !editDesplazamientoV.getText().toString().isEmpty()
                        && !editTextoToast.getText().toString().isEmpty())
                {
                    int desplazamientoH  = Integer.parseInt(editDesplazamientoH.getText().toString());
                    int desplazamientoV  = Integer.parseInt(editDesplazamientoV.getText().toString());
                    int alineacionH = 0;
                    int alineacionV = 0;

                    if(radIzquierda.isChecked())  alineacionH=Gravity.LEFT;
                    if(radMedio.isChecked()) alineacionH=Gravity.CENTER_HORIZONTAL;
                    if(radDerecha.isChecked()) alineacionH=Gravity.RIGHT;
                    if(radArriba.isChecked())  alineacionV=Gravity.TOP;
                    if(radCentro.isChecked()) alineacionV=Gravity.CENTER_VERTICAL;
                    if(radAbajo.isChecked()) alineacionV=Gravity.BOTTOM;


                    Toast toast = Toast.makeText(getApplicationContext(), editTextoToast.getText() , Toast.LENGTH_SHORT);
                    toast.setGravity(alineacionH|alineacionV,desplazamientoH,desplazamientoV);

                    toast.show();

                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "¡RELLENA TODOS LOS CAMPOS!" , Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM,0,20);
                    toast.show();

                }


            }
        });




    }







}
