package com.example.frank.gallupapp;


import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        final Button mediabutton = (Button) findViewById(R.id.mediabutton);
        final Button kommunebutton = (Button) findViewById(R.id.kommunebutton);
        final Button calcbutton = (Button) findViewById(R.id.calcbutton);
        final Button kommunerto = (Button) findViewById(R.id.kommunerto);



        mediabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        kommunebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kommuneintent = new Intent(MainMenuActivity.this, KommuneActivity.class);

                MainMenuActivity.this.startActivity(kommuneintent);
            }
        });


        kommunerto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kommunertointent = new Intent(MainMenuActivity.this, Kommunerto.class);

                MainMenuActivity.this.startActivity(kommunertointent);
            }
        });


        calcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchCall();
            }
        });

    }

            protected void launchCall() {
                String calcpackage = "com.android.calculator2";
                String calcclass = "com.android.calculator2.Calculator";
                // Lommeregner package og class sti er forskellig for devices og er på samsung f.eks. "com.sec.android.app.popupcalculator"

                Intent calcintent = new Intent();
                calcintent.setAction(Intent.ACTION_MAIN);
                calcintent.addCategory(Intent.CATEGORY_LAUNCHER);
                calcintent.setComponent(new ComponentName(calcpackage, calcclass));
                try {
                    startActivity(calcintent);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                }
}

