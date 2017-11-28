package br.com.conseng.tupicionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvBichos = findViewById(R.id.tvBichos);
        tvBichos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BichosActivity.class);
                startActivity(i);
            }
        });

        TextView tvCulinaria = findViewById(R.id.tvCulinaria);
        tvCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CulinariaActivity.class);
                startActivity(i);
            }
        });

        TextView tvPlantas = findViewById(R.id.tvPlantas);
        tvPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlantasActivity.class);
                startActivity(i);
            }
        });

        TextView tvPovosNativos = findViewById(R.id.tvPovosNativos);
        tvPovosNativos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PovosNativosActivity.class);
                startActivity(i);
            }
        });
    }
}
