package com.example.appidatpatitass11.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appidatpatitass11.databinding.FragmentMascotaBinding;


public class MascotaFragment extends Fragment {
    private FragmentMascotaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMascotaBinding.inflate(getLayoutInflater());
        return (binding.getRoot());
    }
}