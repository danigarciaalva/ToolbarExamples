package io.dflabs.toolbar.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.dflabs.toolbar.MainActivity;
import io.dflabs.toolbar.R;
import io.dflabs.toolbar.interfaces.RecyclerClickItemListener;

public class ToolbarListAdapter extends RecyclerView.Adapter<ToolbarListAdapter.ViewHolder> {

    private String[] mDataSet;
    private RecyclerClickItemListener clickItemListener;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    public ToolbarListAdapter(String[] myDataSet, RecyclerClickItemListener clickItemListener) {
        mDataSet = myDataSet;
        this.clickItemListener = clickItemListener;
    }

    @Override
    public ToolbarListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_toolbar, parent, false);
        return new ViewHolder((TextView) v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextView.setText(mDataSet[position]);
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickItemListener != null) clickItemListener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
