package com.example.dptoredes.robalino_leccion_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class intento_2 extends AppCompatActivity {

    String player;
    int correct;
    int incorrect;
    TextView txtNombre2;
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intento_2);

        Bundle extras = getIntent().getExtras();
        player = extras.getString("playerName");
        correct = getIntent().getIntExtra("cor", 0);
        incorrect = getIntent().getIntExtra("inco", 0);
        btnFinish = (Button) findViewById(R.id.btnFinish);

        txtNombre2 = (TextView) findViewById(R.id.player2);
        txtNombre2.setText(player);

        //Toast.makeText(this, "name: " + player + " co: " + correct + " inc: " + incorrect, Toast.LENGTH_SHORT).show();
    }

    public void incorrectbtn(View v) {
        Toast.makeText(this, R.string.incorAns, Toast.LENGTH_SHORT).show();
        incorrect++;
        btnFinish.setVisibility(View.VISIBLE);

    }

    public void correctbtn(View v) {
        Toast.makeText(this, R.string.corrAns, Toast.LENGTH_SHORT).show();
        correct++;
        btnFinish.setVisibility(View.VISIBLE);
    }

    public void finishIt(View v){
        Intent inte2 = new Intent(this, Results.class);
        inte2.putExtra("playerName", player);
        inte2.putExtra("cor", correct);
        inte2.putExtra("inco", incorrect);
    }
}