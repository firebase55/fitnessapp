package com.example.fullftness_app;

import android.content.Intent;
import android.os.Bundle;

import com.example.fullftness_app.homefrgment.Notification;
import com.example.fullftness_app.homefrgment.fitness;
import com.example.fullftness_app.homefrgment.homeFrgment_1;
import com.example.fullftness_app.homefrgment.profile;
import com.example.fullftness_app.homefrgment.video;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private BottomNavigationView bottomNavigationView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener()
    {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectfrgment = null;
            switch (item.getItemId()) {
                case R.id.video:
                    selectfrgment = new video();
                    break;
                case R.id.fitness:
                    selectfrgment = new fitness();
                    break;
                case R.id.diet:
                    selectfrgment = new homeFrgment_1();
                    break;
                case R.id.profile:
                    selectfrgment = new profile();
                    break;
                case R.id.notification:
                    selectfrgment = new Notification();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fr,selectfrgment).commit();
            return true;// hahahaahahah 100 % values
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
