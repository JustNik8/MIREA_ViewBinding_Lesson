package com.justnik.mirea_viewbinding_lesson;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.justnik.mirea_viewbinding_lesson.databinding.ActivityExampleBinding;

public class ExampleActivity extends AppCompatActivity {

    private ActivityExampleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExampleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        launchExampleFragment();
    }

    private void launchExampleFragment() {
        ExampleFragment fragment = ExampleFragment.newInstance();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.example_container, fragment)
                .commit();
    }
}