package com.acewill.androidlearn.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.acewill.androidlearn.databinding.LayoutMainItemBinding;

import java.util.List;

/**
 * @author: liyaxi
 * @date: 2020-11-05
 * @description:
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<String> data;
    private OnItemClickListener onItemClickListener;

    public MainAdapter(List<String> list) {
     this.data=list;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutMainItemBinding layoutMainItemBinding =  LayoutMainItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        ViewHolder viewHolder = new ViewHolder(layoutMainItemBinding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        holder.tvContent.setText(data.get(position));
        holder.llItem.setOnClickListener(view -> onItemClickListener.onClick(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvContent;
        LinearLayout llItem;

        public ViewHolder(@NonNull LayoutMainItemBinding binding) {
            super(binding.getRoot());
            tvContent = binding.tvContent;
            llItem = binding.llItem;
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener=onItemClickListener;
    }

    public interface OnItemClickListener{
        void onClick(int position);
    }

}
