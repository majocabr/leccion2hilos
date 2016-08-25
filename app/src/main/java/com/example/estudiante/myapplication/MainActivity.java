package com.example.estudiante.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txt_name;
    private Button btn_ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_name=(EditText)findViewById(R.id.txt_punt);
        btn_ingresar=(Button)findViewById(R.id.btn_ingresar);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Game.class);
                i.putExtra("nombre", txt_name.getText().toString());
                startActivity(i);
                finish();

            }
    });
}
}
