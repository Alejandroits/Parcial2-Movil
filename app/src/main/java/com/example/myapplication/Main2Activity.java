package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        Intent intent = getIntent();

        double product1Price = intent.getDoubleExtra("product1Price", 0);
        int quantity1 = intent.getIntExtra("quantity1", 0);

        TextView product1InvoicePriceTextView = findViewById(R.id.product1InvoicePriceTextView);
        TextView product1InvoiceTaxTextView = findViewById(R.id.product1InvoiceTaxTextView);

        // Calculations
        double subtotal = product1Price * quantity1;
        double iva = subtotal * 0.19;
        double totalToPay = subtotal + iva;

        // Update invoice details
        product1InvoicePriceTextView.setText(String.format("%,.2f", subtotal));
        product1InvoiceTaxTextView.setText("IVA: " + String.format("%,.2f", iva));

        // Update total
        TextView totalInvoiceTextView = findViewById(R.id.totalInvoiceTextView);
        totalInvoiceTextView.setText("Total: $" + String.format("%,.2f", totalToPay));
    }
}
