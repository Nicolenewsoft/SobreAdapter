package com.example.revisaoadapter.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.revisaoadapter.R;
import com.example.revisaoadapter.model.Postagem;

import java.util.List;

//1 extends da RecyclerView
public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private  List<Postagem> postagens;
    public PostagemAdapter(List<Postagem> listaPostagens){
        this.postagens = listaPostagens;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Referenciar o nosso xml e transformar em objeto
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_adapter, parent, false);

        return new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);
        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagePostagem.setImageResource(postagem.getImagem());

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagePostagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }


}
