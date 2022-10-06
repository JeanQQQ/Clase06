package com.example.clase06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ImprimirActivity extends AppCompatActivity {
    private TextView tvcliente, tvdni, tvser, tvcs, tvci, tvdesc, tvtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imprimir);
        tvcliente = findViewById(R.id.tvCliente);
        tvdni = findViewById(R.id.tvDni);
        tvser = findViewById(R.id.tvServicio);
        tvcs = findViewById(R.id.tvCostoServicio);
        tvci = findViewById(R.id.tvCostoInstalacion);
        tvdesc = findViewById(R.id.tvDescuento);
        tvtp = findViewById(R.id.tvTotalPagar);

        Bundle datos = this.getIntent().getExtras();
        tvcliente.setText("Cliente: "+datos.getString("Cliente"));
        tvdni.setText("Dni: "+datos.getString("Dni"));
        tvser.setText("Servicio: "+datos.getString("Servicio"));
        tvcs.setText("Costo Servicio: "+datos.getString("Costo Servicio"));
        tvci.setText("Costo Instalacion: "+datos.getString("Costo Instalacion"));
        tvdesc.setText("Descuento: "+ datos.getString("Descuento"));
        tvtp.setText("Total Pagar: "+datos.getString("Total Pagar"));

    }
}