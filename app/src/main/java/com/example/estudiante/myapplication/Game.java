package com.example.estudiante.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by estudiante on 25/08/16.
 */
public class Game extends AppCompatActivity {

    private TextView txt_name, txt_punt;
    private String nombre="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        txt_name=(TextView)findViewById(R.id.txt_name);
        nombre = getIntent().getStringExtra("nombre");

        txt_name.setText(" " + nombre.toString());


    }
}
