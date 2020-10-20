package com.example.revisaoadapter.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.revisaoadapter.R;
import com.example.revisaoadapter.adapter.PostagemAdapter;
import com.example.revisaoadapter.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir layout
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Definir Adapter

        prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter(adapter);
    }



    public void prepararPostagens(){
        Postagem p;
        p = new Postagem("Primeira viagem de avião", "Por do sol lindo", R.drawable.imagem1);
        postagens.add(p);

        p = new Postagem("Visitando os edifícios mais altos", "Impressionante!", R.drawable.imagem2);
        postagens.add(p);

        p = new Postagem("Minha viagem à Paris", "Paris como sempre, encantadora!", R.drawable.imagem3);
        postagens.add(p);

        p = new Postagem("Primeira trilha", "Desafiador, mas recompensador ", R.drawable.imagem4);
        postagens.add(p);
    }
}
