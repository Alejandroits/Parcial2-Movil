package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias a los botones de agregar producto
        Button addProduct1Button = findViewById(R.id.addProduct1Button);
        Button addProduct2Button = findViewById(R.id.addProduct2Button);
        Button addProduct3Button = findViewById(R.id.addProduct3Button);
        Button addProduct4Button = findViewById(R.id.addProduct4Button);

        // Configurar listeners de clic para los botones de agregar producto
        addProduct1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para agregar el producto 1 al carrito
                Toast.makeText(MainActivity.this, "Añadido Tenis Nike al carrito", Toast.LENGTH_SHORT).show();
            }
        });

        addProduct2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para agregar el producto 2 al carrito
                Toast.makeText(MainActivity.this, "Añadido Tenis Adidas al carrito", Toast.LENGTH_SHORT).show();
            }
        });

        addProduct3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para agregar el producto 3 al carrito
                Toast.makeText(MainActivity.this, "Añadido Tenis Reebok al carrito", Toast.LENGTH_SHORT).show();
            }
        });

        addProduct4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para agregar el producto 4 al carrito
                Toast.makeText(MainActivity.this, "Añadida Camiseta Supreme al carrito", Toast.LENGTH_SHORT).show();
            }
        });

        // Obtener referencia al botón "Ver Factura"
        Button gotoSecondActivityButton = findViewById(R.id.gotoSecondActivityButton);

        // Configurar OnClickListener para el botón "Ver Factura"
        gotoSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar la segunda actividad (Main2Activity)
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                // Puedes agregar datos adicionales al Intent si es necesario
                // intent.putExtra("key", value);

                // Iniciar la segunda actividad
                startActivity(intent);
            }
        });
    }
}
