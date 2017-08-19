package com.example.frank.gallupapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KommuneActivity extends AppCompatActivity {
    int bov = 6372;
    int rodekro = 6230;
    int tinglev = 6360;
    int aabenraa = 6200;
    int bredebro = 6261;
    int hojer = 6280;
    int logumkloster = 6240;
    int skaerbaek = 6780;
    int tonder = 6270;

// Af hensyn til tid er kommunesøgningen begrænset til et par kommuner, men kunne sagtens udvides til alle kommuner.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kommune);


        final EditText etkommune = (EditText) findViewById(R.id.etkommune);
        final TextView tvresultat = (TextView) findViewById(R.id.tvresultat);
        final Button btnsoeg = (Button) findViewById(R.id.btnsoeg);

        btnsoeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int postnummer = Integer.parseInt(etkommune.getText().toString());

                // setText er med vilje hardcoded, da det kun er til intern brug i en dansk virksomhed. Oversættelse ikke nødvendig.

                if (postnummer == bov) {
                    tvresultat.setText("6372 Bylderup-Bov hører under 6200 Aabenraa kommune!");
                }
                else if (postnummer == rodekro) {
                    tvresultat.setText("6230 Rødekro hører under 6200 Aabenraa kommune!");
                }
                else if (postnummer == tinglev) {
                    tvresultat.setText("6360 Tinglev hører under 6200 Aabenraa kommune!");
                }
                else if (postnummer == aabenraa) {
                    tvresultat.setText("6200 er Aabenraa kommune!");
                }
                else if (postnummer == bredebro) {
                    tvresultat.setText("6261 Bredebro hører under 6270 Tønder kommune!");
                }
                else if (postnummer == hojer) {
                    tvresultat.setText("6280 Højer hører under 6270 Tønder kommune!");
                }
                else if (postnummer == logumkloster) {
                    tvresultat.setText("6240 Løgumkloster hører under 6270 Tønder kommune!");
                }
                else if (postnummer == skaerbaek) {
                    tvresultat.setText("6780 Skærbæk hører under 6270 Tønder kommune!");
                }
                else if (postnummer == tonder) {
                    tvresultat.setText("6270 er Tønder kommune!");
                }
                else{
                    tvresultat.setText("Postnummeret findes ikke. Prøv igen.");
                }
            }
        });

    }

}
