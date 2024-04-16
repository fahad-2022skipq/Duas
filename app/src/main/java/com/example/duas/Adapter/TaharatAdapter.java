package com.example.duas.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duas.Model.TaharatModel;
import com.example.duas.R;
import com.example.duas.SharedPreferences.SharedPrefs;

import java.util.ArrayList;

public class TaharatAdapter extends RecyclerView.Adapter<TaharatAdapter.ViewHolder> {

    ArrayList<TaharatModel> list;

    public TaharatAdapter(ArrayList<TaharatModel> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_dua_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.arabicDua.setText(list.get(position).getArabicDua());
        holder.urduDua.setText(list.get(position).getUrduDua());
        holder.title.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView arabicDua;
        TextView urduDua;
        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            arabicDua = itemView.findViewById(R.id.arabic_dua);
            urduDua = itemView.findViewById(R.id.urdu_dua);
            title = itemView.findViewById(R.id.title);
            this.setTextSize();
        }
        private void setTextSize() {
            if(SharedPrefs.getStatus(itemView.getContext()).equals("S")){
                title.setTextSize(23);
                arabicDua.setTextSize(19);
                urduDua.setTextSize(13);

            }
            else if(SharedPrefs.getStatus(itemView.getContext()).equals("M")){
                title.setTextSize(28);
                arabicDua.setTextSize(24);
                urduDua.setTextSize(18);
            }
            else if(SharedPrefs.getStatus(itemView.getContext()).equals("L")){
                title.setTextSize(33);
                arabicDua.setTextSize(29);
                urduDua.setTextSize(23);
            }
        }
    }
}
