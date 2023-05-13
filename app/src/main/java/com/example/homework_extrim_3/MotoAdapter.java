package com.example.homework_extrim_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MotoAdapter extends RecyclerView.Adapter<MotoAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Moto> motos;
    public MotoAdapter(Context context, List<Moto> motos){
        this.inflater = LayoutInflater.from(context);
        this.motos = motos;
    }
    @Override
    public MotoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MotoAdapter.ViewHolder holder, int position) {
        Moto moto = motos.get(position);
        holder.motoView.setImageResource(moto.getMotoResource());
        holder.modelView.setText(moto.getModel());
        holder.yearView.setText(moto.getYear());
        holder.releasedView.setText(moto.getReleased());
    }
    @Override
    public int getItemCount() {
        return motos.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        final ImageView motoView;
        final TextView modelView, yearView, releasedView;

        ViewHolder(View view){
            super(view);
            motoView = view.findViewById(R.id.motoResource);
            modelView = view.findViewById(R.id.model);
            yearView = view.findViewById(R.id.year);
            releasedView = view.findViewById(R.id.released);
        }
    }
}
