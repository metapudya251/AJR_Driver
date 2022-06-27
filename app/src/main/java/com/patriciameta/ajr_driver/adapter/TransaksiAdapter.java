package com.patriciameta.ajr_driver.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.patriciameta.ajr_driver.R;
import com.patriciameta.ajr_driver.models.Transaksi;

import java.util.ArrayList;
import java.util.List;

public class TransaksiAdapter extends RecyclerView.Adapter<TransaksiAdapter.ViewHolder> implements Filterable {
    private List<Transaksi> transaksiList, filteredTransaksiList;
    private Context context;

    public TransaksiAdapter(List<Transaksi> transaksiList, Context context) {
        this.transaksiList= transaksiList;
        filteredTransaksiList = new ArrayList<>(transaksiList);
        this.context = context;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charSequenceString = charSequence.toString();
                ArrayList<Transaksi> filtered = new ArrayList<>();

                if (charSequenceString.isEmpty()) {
                    filtered.addAll(transaksiList);
                } else {
                    for (Transaksi transaksi : transaksiList) {
                        if (transaksi.getNo_transaksi().toLowerCase()
                                .contains(charSequenceString.toLowerCase()))
                            filtered.add(transaksi);
                    }
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = filtered;

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults
                    filterResults) {
                ArrayList<Transaksi> transaksis = new ArrayList<>();
                filteredTransaksiList.clear();
                filteredTransaksiList.addAll((List<Transaksi>) filterResults.values);
                notifyDataSetChanged();
            }
        };
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.rv_item_transaksi, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Transaksi transaksi = filteredTransaksiList.get(position);

        holder.tvMobil.setText(transaksi.getNama_aset());
        holder.tvNo.setText   (transaksi.getNo_transaksi());
        holder.tvDrv.setText   (transaksi.getNama_driver());
        holder.tvTgl.setText   (transaksi.getTgl_waktu_selesai_sewa());

    }

    @Override
    public int getItemCount() {
        return filteredTransaksiList.size();
    }

    public void setTransaksiList(List<Transaksi> transaksiList) {
        this.transaksiList = transaksiList;
        filteredTransaksiList = new ArrayList<>(transaksiList);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvMobil, tvTotal, tvJenis,tvNo,tvCust,tvTgl,tvStatus, tvDrv;
        CardView cvTransaksi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMobil = itemView.findViewById(R.id.tv_aset);
            tvNo = itemView.findViewById(R.id.tv_no);
            tvDrv = itemView.findViewById(R.id.tv_driver);
            tvTgl = itemView.findViewById(R.id.tv_tgl);
            cvTransaksi = itemView.findViewById(R.id.cv_transaksi);
        }
    }
}
