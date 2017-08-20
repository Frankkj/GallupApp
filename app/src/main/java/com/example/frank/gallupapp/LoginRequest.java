package com.example.frank.gallupapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by frank on 17-08-2017.
 */

public class LoginRequest extends StringRequest {


    private static final String LOGIN_ACTIVITY_URL = "https://gapp.000webhostapp.com/Login.php";
    private Map<String, String> params;

    public LoginRequest(String BVNr, String Kodeord, Response.Listener<String> listener)
    {
        super(Method.POST, LOGIN_ACTIVITY_URL, listener, null);
        params = new HashMap<>();
        params.put("BVNr", BVNr);
        params.put("Kodeord", Kodeord);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
