package com.exemplo.turno12horas;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Criar uma interface simples em texto para mostrar a escala 4x4
        TextView textView = new TextView(this);
        textView.setText("Turno 12h - RHI Magnesita\nEscala 4x4 Ativa");
        textView.setTextSize(22);
        textView.setPadding(40, 40, 40, 40);

        setContentView(textView);
    }
}
