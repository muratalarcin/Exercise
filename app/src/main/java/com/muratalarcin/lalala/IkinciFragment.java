package com.muratalarcin.lalala;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.lalala.databinding.FragmentIkinciBinding;

public class IkinciFragment extends Fragment {
    FragmentIkinciBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentIkinciBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}