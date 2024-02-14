package com.mdrg.segundaparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText nombre, apellido, cedula, correo, fechana;
    Button enviarD;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.Nombre);
        apellido = findViewById(R.id.Apellido);
        cedula = findViewById(R.id.Cedula);
        correo = findViewById(R.id.Correo);
        fechana = findViewById(R.id.FechaNaci);
    }

    public void enviarDatos(View view) {
        String nombreTexto = nombre.getText().toString();
        String apellidoTexto = apellido.getText().toString();
        String cedulaTexto = cedula.getText().toString();
        String correoTexto = correo.getText().toString();
        String fechaNaciTexto = fechana.getText().toString();

        Intent intent = new Intent(this, DatosPersonalesActivity.class);
        intent.putExtra("nombre", nombreTexto);
        intent.putExtra("apellido", apellidoTexto);
        intent.putExtra("cedula", cedulaTexto);
        intent.putExtra("correo", correoTexto);
        intent.putExtra("fechaNaci", fechaNaciTexto);
        startActivity(intent);
    }




    public void AbreCalendario(View view) {
        Calendar cal = Calendar.getInstance();
        int anio = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String fecha = dayOfMonth + "/" + (month + 1) + "/" + year ;
                fechana.setText(fecha);
            }
        }, dia, mes, anio);
        dpd.show();
    }




}

