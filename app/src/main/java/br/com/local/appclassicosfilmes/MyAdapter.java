package br.com.local.appclassicosfilmes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public Context mContext;
    public List<Filmes> baseFilmes;

    public MyAdapter(Context mContext, List<Filmes> baseFilmes) {
        this.mContext = mContext;
        this.baseFilmes = baseFilmes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.modelo_filmes, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.idTituloFilme.setText(baseFilmes.get(position).getTitulo());
        holder.idImagemFilme.setImageResource(baseFilmes.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return baseFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView idCardFilme;
        TextView idTituloFilme;
        ImageView idImagemFilme;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            idCardFilme = itemView.findViewById(R.id.idCardFilmes);
            idTituloFilme = itemView.findViewById(R.id.idTituloFilmes);
            idImagemFilme = itemView.findViewById(R.id.imgFilmes);
        }
    }
}
