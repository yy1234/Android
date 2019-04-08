package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.QuickContactBadge;

public class QuickContactBadgeActivity extends AppCompatActivity {

    QuickContactBadge badge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_contact_badge);
        badge = (QuickContactBadge)findViewById(R.id.badge);
        badge.assignContactFromPhone("13921434925",false);
    }
}
