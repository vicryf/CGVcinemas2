package gg.rns.cgvcinemas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListFilmAdapter extends
        RecyclerView.Adapter<ListFilmAdapter.CategoryViewHolder>{
    private Context context;
    ArrayList<Film>getListFilm() {
        return listFilm;
    }
    void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }
    private ArrayList<Film> listFilm;
    ListFilmAdapter(Context context) {
        this.context = context;
    }
    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int
            viewType) {
        View itemRow =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_film, parent, false);
        return new CategoryViewHolder(itemRow);
    }
    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.tvName.setText(getListFilm().get(position).getName());
        holder.tvRemarks.setText(getListFilm().get(position).getRemarks());
        Glide.with(context)
                .load(getListFilm().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
    }
    @Override
    public int getItemCount() {
        return getListFilm().size();
    }
    class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
        }
    }
}