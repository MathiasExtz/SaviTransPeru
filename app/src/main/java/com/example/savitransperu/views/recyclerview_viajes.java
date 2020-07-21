package com.example.savitransperu.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.savitransperu.Adapter.ViajeAdapter;
import com.example.savitransperu.R;
import com.example.savitransperu.api.ApiClient;
import com.example.savitransperu.models.Viaje;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class recyclerview_viajes extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Viaje> viajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_viajes);


        Call<List<Viaje>> call = ApiClient.getUserService().listTravel();
        call.enqueue(new Callback<List<Viaje>>() {
            @Override
            public void onResponse(Call<List<Viaje>> call, Response<List<Viaje>> response) {
                //progressDialog.dismiss();
                generateList(response.body());
            }

            @Override
            public void onFailure(Call<List<Viaje>> call, Throwable t) {
                //progressDialog.dismiss();
                Toast.makeText(recyclerview_viajes.this, "Falló algo en la conexisón", Toast.LENGTH_LONG).show();
            }
        });





    }
    private void generateList(List<Viaje> lista) {
        viajes = lista;
        mRecyclerView = findViewById(R.id.recycle_viajes);
        mLayoutManager = new LinearLayoutManager(this);

        mAdapter = new ViajeAdapter(viajes, R.layout.activity_cardview_item_viaje, new ViajeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Viaje viaje, int position) {
                Toast.makeText(recyclerview_viajes.this, viaje.getDestino() + " - " + position, Toast.LENGTH_LONG).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(recyclerview_viajes.this, info_viaje.class));
                    }
                }, 700);
            }
        });
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}