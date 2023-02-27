package com.bikram.workoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WorkoutDetailFragment fragment = (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        Intent intent =getIntent();
        int workoutId = intent.getIntExtra(MainActivity.EXTRA_WORKOUT_ID,0);
        fragment.setWorkoutId(workoutId);
    }
}