package com.example.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Mostar(View v) {
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto_2);
        String textoConcatenado = editText.getText().toString()+editText2.getText().toString();
        Toast.makeText(MainActivity.this, textoConcatenado, Toast.LENGTH_SHORT).show();
    }

    public void limpaTexto(View v)   {
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto_2);
        editText.setText("");
        editText2.setText("");

    }


}