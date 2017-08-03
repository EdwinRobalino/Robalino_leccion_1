package com.example.dptoredes.robalino_leccion_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class intento_1 extends AppCompatActivity {

    String player;
    int correct = 0;
    int incorrect = 0;
    TextView txtNombre;
    Button ctnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intento_1);

        Bundle extras = getIntent().getExtras();
        player = extras.getString("playerName");
        txtNombre = (TextView)findViewById(R.id.player1);
        ctnButton = (Button)findViewById(R.id.btnContinue);

        txtNombre.setText(player);
    }

    public void incorrectbtn(View v){
        Toast.makeText(this, R.string.incorAns, Toast.LENGTH_SHORT).show();
        incorrect++;
        ctnButton.setVisibility(View.VISIBLE);

    }

    public void correctbtn(View v){
        Toast.makeText(this, R.string.corrAns, Toast.LENGTH_SHORT).show();
        correct++;
        ctnButton.setVisibility(View.VISIBLE);

    }

    public void pnt2(View v){
        Intent inte = new Intent(this, intento_2.class);
        inte.putExtra("playerName", player);
        inte.putExtra("cor", correct);
        inte.putExtra("inco", incorrect);
        startActivity(inte);
    }
}
