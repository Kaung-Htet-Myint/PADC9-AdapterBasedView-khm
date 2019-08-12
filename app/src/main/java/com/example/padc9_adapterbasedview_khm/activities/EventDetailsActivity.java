package com.example.padc9_adapterbasedview_khm.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.padc9_adapterbasedview_khm.R;
import com.example.padc9_adapterbasedview_khm.adapters.EventDetailImageAdapter;

public class EventDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        ViewPager vpEventDetailImages = findViewById(R.id.vpEventDetailImages);

        EventDetailImageAdapter adapter = new EventDetailImageAdapter();
        vpEventDetailImages.setAdapter(adapter);
    }
}
