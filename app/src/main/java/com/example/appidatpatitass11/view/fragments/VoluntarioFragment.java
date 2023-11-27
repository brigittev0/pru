package com.example.appidatpatitass11.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appidatpatitass11.R;
import com.example.appidatpatitass11.databinding.FragmentVoluntarioBinding;


public class VoluntarioFragment extends Fragment {
    private FragmentVoluntarioBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentVoluntarioBinding.inflate(getLayoutInflater());
        return inflater.inflate(R.layout.fragment_voluntario, container, false);
    }
}