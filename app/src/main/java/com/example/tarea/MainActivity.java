package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText nombre, fecNacimiento, genero, telefono;
    public void Enviar(View view)
    {
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, Bienvenido.class);
        String nombres,gen, telef, fecha;
        nombre=(EditText)findViewById(R.id.txtNombre);
        telefono=(EditText)findViewById(R.id.txtTelefono);
        fecNacimiento=(EditText)findViewById(R.id.txtFechaNac);
        String nomAp=nombre.getText().toString();
        gen=Validad();
        telef=telefono.getText().toString();
        fecha= fecNacimiento.getText().toString();
        Bundle b = new Bundle();
        b.putString("NOMBRES", nomAp);
        b.putString("GENERO", gen);
        b.putString("TELEFONO", telef);
        b.putString("FECNAC", fecha);
        intent.putExtras(b);
        startActivity(intent);
    }
    private String Validad()
    {
        RadioButton r1,r2;
        r1=(RadioButton)findViewById(R.id.rdMasculino);
        r2=(RadioButton)findViewById(R.id.rdFemenino);
        String seleccionado="";
        if(r1.isChecked()==true)
            seleccionado=r1.getText().toString();
        if(r2.isChecked()==true)
            seleccionado=r2.getText().toString();
        return seleccionado;
    }
}