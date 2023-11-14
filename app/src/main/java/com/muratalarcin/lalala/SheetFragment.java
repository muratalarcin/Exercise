package com.muratalarcin.lalala;

import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;
import com.muratalarcin.lalala.databinding.FragmentSheetBinding;

public class SheetFragment extends BottomSheetDialogFragment {
    FragmentSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSheetBinding.inflate(inflater, container,false);

        binding.imageView5.setOnClickListener(view -> {
            Snackbar.make(view, "Paylaşıldı", Snackbar.LENGTH_LONG).show();
        });

        binding.imageView3.setOnClickListener(view -> {
            Snackbar.make(view, "Kopyalandı", Snackbar.LENGTH_LONG).show();
        });

        return binding.getRoot();
    }
}