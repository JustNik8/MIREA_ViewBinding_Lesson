package com.justnik.mirea_viewbinding_lesson;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.justnik.mirea_viewbinding_lesson.databinding.FragmentExampleBinding;


public class ExampleFragment extends Fragment {

    private FragmentExampleBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentExampleBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.bExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = binding.etExample.getText().toString();
                if (text.isEmpty()){
                    binding.etExample.setError("Пустое поле");
                }
                else{
                    binding.tvExample.setText(text);
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public static ExampleFragment newInstance() {
        ExampleFragment fragment = new ExampleFragment();

        //Здесь вы можете создать Bundle и добавить его во фрагмент

        return fragment;
    }
}