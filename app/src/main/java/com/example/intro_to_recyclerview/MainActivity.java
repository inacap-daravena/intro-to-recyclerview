package com.example.intro_to_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvIntro;
    final String url = "https://aves.ninjas.cl/api/birds";

    JsonArrayRequest request = new JsonArrayRequest(
            Request.Method.GET,
            url,
            null,
            new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    // rvIntro.setAdapter(new ObjectAdapter(response))
                    rvIntro.setAdapter(new ObjectAdapter(response));
                }
            },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Log.e("Volley", "Hubo un error", error);
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvIntro = findViewById(R.id.rvIntro);
        rvIntro.setLayoutManager(new LinearLayoutManager(this));

        String[] dataset = new String[5];
        dataset[0] = "Hola mundo";

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);

    }
}