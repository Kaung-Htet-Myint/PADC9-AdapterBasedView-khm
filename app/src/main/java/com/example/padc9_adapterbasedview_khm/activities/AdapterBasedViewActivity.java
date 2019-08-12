package com.example.padc9_adapterbasedview_khm.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.padc9_adapterbasedview_khm.R;
import com.example.padc9_adapterbasedview_khm.adapters.EventListAdapter;
import com.example.padc9_adapterbasedview_khm.deligates.EventItemDelegate;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

public class AdapterBasedViewActivity extends AppCompatActivity implements EventItemDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_based_view);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView rvEvents = findViewById(R.id.rvEnvents);
        rvEvents.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));

        EventListAdapter adapter = new EventListAdapter(this);
        rvEvents.setAdapter(adapter);
    }


    @Override
    public void onTapEventItem() {
        startActivity(new Intent(this,EventDetailsActivity.class));
    }
}
