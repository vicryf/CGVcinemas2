package gg.rns.cgvcinemas;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewFilmAdapter extends
        RecyclerView.Adapter<CardViewFilmAdapter.CardViewViewHolder>{
    private ArrayList<Film> listFilm;
    private Context context;
    CardViewFilmAdapter(Context context) {
        this.context = context;
    }
    private ArrayList<Film> getListFilm() {
        return listFilm;
    }
    void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int
            viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_film, parent, false);
        return new CardViewViewHolder(view);
    }
    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position)
    {
        Film p = getListFilm().get(position);
        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);
        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getRemarks());
        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Buy "+getListFilm().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Detail "+getListFilm().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListFilm().size();
    }
    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto =
                    (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks =
                    (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite =
                    (Button)itemView.findViewById(R.id.btn_set_favorite);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
        }
    }

}
