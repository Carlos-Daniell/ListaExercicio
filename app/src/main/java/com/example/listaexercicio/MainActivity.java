package com.example.listaexercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    String [] linguagens = {"C++","Java", "Python", "Kotlin", "Lua", "ASP", "PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lista);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.linha,linguagens);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(this);


        //lista.setOnItemLongClickListener();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String nome = linguagens[position];
        Toast.makeText(getApplicationContext(),"Clicou "+nome,Toast.LENGTH_LONG).show();
    }
}