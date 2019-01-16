package com.example.pc.toastynotificaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PersonalizarToast extends AppCompatActivity {

    Spinner spinnerHorizontal;
    Spinner spinnerVertical;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalizar_toast);

        final String[] alineacionHorizontal = {getResources().getString(R.string.izquierda) , getResources().getString(R.string.derecha), getResources().getString(R.string.medio)};
        ArrayAdapter adaptadorAlineacionHorizontal = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, alineacionHorizontal);

        Spinner spinnerHorizontal = findViewById(R.id.SpinnerHorizontal);
        spinnerHorizontal.setAdapter(adaptadorAlineacionHorizontal);

        spinnerHorizontal = findViewById(R.id.SpinnerHorizontal);

        final String[] alineacionVertical = {getResources().getString(R.string.arriba) , getResources().getString(R.string.abajo), getResources().getString(R.string.centro)};
        ArrayAdapter adaptadorAlineacionVertical = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, alineacionVertical);

        Spinner spinnerVertical = findViewById(R.id.SpinnerVertical);
        spinnerVertical.setAdapter(adaptadorAlineacionVertical);

        spinnerVertical = findViewById(R.id.SpinnerVertical);

    }
}
