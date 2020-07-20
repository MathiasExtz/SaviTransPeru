package com.example.savitransperu.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.savitransperu.R;
import com.example.savitransperu.models.Viaje;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ViajeAdapter extends RecyclerView.Adapter<ViajeAdapter.ViewHolder> {

    private List<Viaje> viajes;
    private int layout;
    private OnItemClickListener itemClickListener;
    private Context context;

    public ViajeAdapter(List<Viaje> viajes, int layout, OnItemClickListener onItemClickListener){
        this.viajes=viajes;
        this.layout=layout;
        this.itemClickListener=onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,parent,false);
        context=parent.getContext();
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(viajes.get(position),itemClickListener);
    }

    @Override
    public int getItemCount() {
        return viajes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.info_text);
            imageView =  itemView.findViewById(R.id.imageCardview);
        }

        public void bind(final Viaje viaje, final OnItemClickListener listener){
            textView.setText(viaje.getDestino());
            Picasso.get().load(viaje.getImgUrl()+"").resize(370, 170).centerCrop().into(imageView);
            //imageView.setImageResource(viaje.getImg());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(viaje,getAdapterPosition());
                }
            });
        }
    }
    public interface OnItemClickListener{
        void onItemClick(Viaje viaje, int position);
    }
}
