package com.example.ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar1, progressBar2, progressBar3, progressBar4, progressBar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar1 = findViewById(R.id.progressBar1);
        progressBar2 = findViewById(R.id.progressBar2);
        progressBar3 = findViewById(R.id.progressBar3);
        progressBar4 = findViewById(R.id.progressBar4);
        progressBar5 = findViewById(R.id.progressBar5);

        // Leer los valores de venta (porcentajes)
        int venta1 = 20;
        int venta2 = 30;
        int venta3 = 10;
        int venta4 = 25;
        int venta5 = 15;

        // Calcular la suma de los valores de venta
        int sumaVentas = venta1 + venta2 + venta3 + venta4 + venta5;

        // Ajustar el progreso de las ProgressBar según los valores de venta
        progressBar1.setProgress(venta1);
        progressBar2.setProgress(venta2);
        progressBar3.setProgress(venta3);
        progressBar4.setProgress(venta4);
        progressBar5.setProgress(venta5);
    }
}


