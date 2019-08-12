package com.example.padc9_adapterbasedview_khm.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.padc9_adapterbasedview_khm.R;
import com.example.padc9_adapterbasedview_khm.deligates.EventItemDelegate;
import com.example.padc9_adapterbasedview_khm.views.holders.EventItemViewHolder;

public class EventListAdapter extends RecyclerView.Adapter {
    private EventItemDelegate mEventItemDelegate;

    public EventListAdapter(EventItemDelegate mEventItemDelegate) {
        this.mEventItemDelegate = mEventItemDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_item_event,viewGroup,false);
        return new EventItemViewHolder(itemView,mEventItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
