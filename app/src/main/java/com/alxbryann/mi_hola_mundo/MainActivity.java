package com.alxbryann.mi_hola_mundo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


TextView mensajeTextView;
EditText textoDeEntrada;
Button enviar;


    public void buttonPress(View view){

        Log.i("Info: ", "Boton presionado");
        textoDeEntrada.setVisibility(View.INVISIBLE);
        mensajeTextView.setText(textoDeEntrada.getText());
        enviar.setVisibility(View.INVISIBLE);


    }
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

        mensajeTextView = findViewById(R.id.textView);
        mensajeTextView.setText("Esperando mensaje :)");
        textoDeEntrada = findViewById(R.id.editText);
        enviar = findViewById(R.id.button);
    }
}