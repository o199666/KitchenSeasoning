package com.cwj.kitchenseasoning.menu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.cwj.kitchenseasoning.R;
import com.cwj.kitchenseasoning.databinding.ItemDetailsBinding;
import com.cwj.kitchenseasoning.menu.bean.DetailsBean;
import com.cwj.kitchenseasoning.menu.interfaces.ItemClike;

import java.util.List;

/**
 * 详细页面适配器
 */
public class ItemDetailsAdapter extends RecyclerView.Adapter<ItemDetailsAdapter.DetailsViewHolder> {
    private List<DetailsBean.ResultBean.DataBean> list;
    private Context context;
    private ItemClike item;
    public ItemDetailsAdapter(Context context, List<DetailsBean.ResultBean.DataBean> list, ItemClike item) {
        this.list = list;
        this.context = context;
         this.item=item;
    }

    //获取不同的布局
    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public DetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //这里可以用根据 veiwtype选择不同的类型布局
        ItemDetailsBinding itemDetailsBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_details, parent, false);
        return new DetailsViewHolder(itemDetailsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsViewHolder holder, int position) {
        DetailsBean.ResultBean.DataBean detas = list.get(position);
        holder.getBinding().setItemdeta(detas);
        holder.getBinding().executePendingBindings();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.onClike(view,detas);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (list.size() > 0) {
            return list.size();
        }
        return 0;
    }

    //布局一
    class DetailsViewHolder extends RecyclerView.ViewHolder {
        private ItemDetailsBinding binding;

        public ItemDetailsBinding getBinding() {
            return binding;
        }

        public DetailsViewHolder(ItemDetailsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
