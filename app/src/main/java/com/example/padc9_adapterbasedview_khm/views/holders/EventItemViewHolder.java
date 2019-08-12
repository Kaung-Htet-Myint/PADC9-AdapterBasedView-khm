package com.example.padc9_adapterbasedview_khm.views.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.padc9_adapterbasedview_khm.deligates.EventItemDelegate;

public class EventItemViewHolder extends RecyclerView.ViewHolder {
    private EventItemDelegate mEventItemDelegate;

    public EventItemViewHolder(@NonNull View itemView, final EventItemDelegate delegate) {
        super(itemView);

        mEventItemDelegate = delegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEventItemDelegate.onTapEventItem();
            }
        });
    }
}
