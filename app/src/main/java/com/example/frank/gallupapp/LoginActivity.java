package com.example.frank.gallupapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button snydbutton = (Button) findViewById(R.id.snydbutton);
        final EditText etbvnr = (EditText) findViewById(R.id.etbvnr);
        final EditText etpass = (EditText) findViewById(R.id.etpass);
        final Button loginbutton = (Button) findViewById(R.id.loginbutton);


        snydbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snydintent = new Intent(LoginActivity.this, MainMenuActivity.class);

                LoginActivity.this.startActivity(snydintent);
            }
        });



        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String BVNr = etbvnr.getText().toString();
                final String Kodeord = etpass.getText().toString();



                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean ("success");

                            if (success)
                            {

                                Intent loginintent = new Intent(LoginActivity.this, MainMenuActivity.class);

                                LoginActivity.this.startActivity(loginintent);

                            }

                            else
                            {
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage("BVNr eller Kodeord er forkert")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        }

                        catch (JSONException e)
                        {
                            e.printStackTrace();
                        }

                    }
                };



                LoginRequest loginRequest = new LoginRequest(BVNr, Kodeord, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);

            }


        });
    }
}
