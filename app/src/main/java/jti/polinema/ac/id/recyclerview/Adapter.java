package jti.polinema.ac.id.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.PlayerViewHolder> {

    private ArrayList<Model> dataList;

    public Adapter(ArrayList<Model> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public Adapter.PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list, viewGroup, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.PlayerViewHolder holder, int i) {
        holder.txtNo.setText(dataList.get(i).getNo());
        holder.txtBarang.setText(dataList.get(i).getBarang());
        holder.txtHarga.setText(String.valueOf(dataList.get(i).getHarga()));
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNo, txtBarang, txtHarga;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNo = (TextView) itemView.findViewById(R.id.hmNo);
            txtBarang = (TextView) itemView.findViewById(R.id.hmBarang);
            txtHarga = (TextView) itemView.findViewById(R.id.hmHarga);
        }
    }
}
