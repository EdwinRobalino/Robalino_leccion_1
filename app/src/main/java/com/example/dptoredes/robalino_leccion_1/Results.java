package com.example.dptoredes.robalino_leccion_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    String player;
    int correct;
    int incorrect;
    TextView nombreFInal, ansCorr, ansIncor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        Bundle extras = getIntent().getExtras();
        player = extras.getString("playerName");
        correct = getIntent().getIntExtra("cor", 0);
        incorrect = getIntent().getIntExtra("inco", 0);

        nombreFInal = (TextView)findViewById(R.id.nomFInal);
        nombreFInal.setText(player);

        ansCorr = (TextView)findViewById(R.id.totAciertos);
        ansIncor = (TextView)findViewById(R.id.totFallas);

        ansCorr.setText(Integer.toString(correct));
        ansIncor.setText(Integer.toString(incorrect));
    }
}
