package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class Bienvenido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
        TextView   txtSaludo = (TextView)findViewById(R.id.lblNombres);
        Bundle bundle1 = this.getIntent().getExtras();
        txtSaludo.setText("Hola, Bienvenido \n " + bundle1.getString("NOMBRES") + ", La información ingresada es : \nFecha de nacimiento: "+ bundle1.getString( "FECNAC")
                +"\nGénero: "+ bundle1.getString( "GENERO")
                +"\nTeléfono: "+ bundle1.getString( "TELEFONO"));
    }
}