package com.example.grandesinventos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton boton1 = (ImageButton) findViewById(R.id.imageButton3);
        boton1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(MainActivity.this, "Imprenta", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(), ImprentaActivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton2 = (ImageButton) findViewById(R.id.imageButton7);
        boton2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(MainActivity.this, "Teléfono", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(), TelefonoActivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton3 = (ImageButton) findViewById(R.id.imageButton5);
        boton3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(MainActivity.this, "Bombilla", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(), BombillaActivity.class);
                startActivity(intencion);
            }
        }));

        ImageButton boton4 = (ImageButton) findViewById(R.id.imageButton8);
        boton4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast notificacion = Toast.makeText(MainActivity.this, "Máquina de Vapor", Toast.LENGTH_SHORT);
                notificacion.show();
                Intent intencion = new Intent(getApplicationContext(), MaquinaVaporActivity.class);
                startActivity(intencion);
            }
        }));
    }
}