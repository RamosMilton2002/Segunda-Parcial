package com.mdrg.segundaparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DatosPersonalesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_personales);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String apellido = intent.getStringExtra("apellido");
        String cedula = intent.getStringExtra("cedula");
        String correo = intent.getStringExtra("correo");
        String fechaNaci = intent.getStringExtra("fechaNaci");

        TextView nombreTextView = findViewById(R.id.txtNom);
        TextView apellidoTextView = findViewById(R.id.txtApe);
        TextView cedulaTextView = findViewById(R.id.txtCed);
        TextView correoTextView = findViewById(R.id.txtCo);
        TextView fechaNaciTextView = findViewById(R.id.txtFech);

        nombreTextView.setText(nombre);
        apellidoTextView.setText(apellido);
        cedulaTextView.setText(cedula);
        correoTextView.setText(correo);
        fechaNaciTextView.setText(fechaNaci);
    }
}