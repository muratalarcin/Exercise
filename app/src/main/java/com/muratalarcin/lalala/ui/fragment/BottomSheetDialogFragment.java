package com.muratalarcin.lalala.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.lalala.R;
import com.muratalarcin.lalala.databinding.FragmentBottomSheetDialogBinding;

public class BottomSheetDialogFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private FragmentBottomSheetDialogBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBottomSheetDialogBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}