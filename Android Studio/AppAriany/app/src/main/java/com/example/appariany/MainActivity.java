package com.example.appariany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrar(View view){
        Intent novo = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(novo);
    }

    public void esqueceuSenha(View view){
        Intent senha = new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(senha);
    }

    public void Login(View view){
        Intent logar = new Intent(getApplicationContext(),MainActivity4.class);
        startActivity(logar);
    }

}