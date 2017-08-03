package com.example.dptoredes.robalino_leccion_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.txtNombre);
        btnstart = (Button)findViewById(R.id.btnStart);
    }

    public void empezar(View view){
        String player = nombre.getText().toString();
        //Toast.makeText(this, player, Toast.LENGTH_SHORT).show();

        Intent inte = new Intent(this, intento_1.class);
        inte.putExtra("playerName", player);
        startActivity(inte);
    }
}
