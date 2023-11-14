package com.muratalarcin.lalala.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.lalala.R;
import com.muratalarcin.lalala.data.entity.Sarkilar;
import com.muratalarcin.lalala.databinding.FragmentUcuncuBinding;

public class UcuncuFragment extends Fragment {
    private FragmentUcuncuBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUcuncuBinding.inflate(inflater, container, false);

        UcuncuFragmentArgs bundle = UcuncuFragmentArgs.fromBundle(getArguments());
        Sarkilar sarki = bundle.getSarki();

        binding.toolbar2.setTitle(sarki.getAd());
        binding.tvAd.setText(sarki.getAd());

        binding.imageView2.setImageResource(getResources().getIdentifier(
                sarki.getResim(), "drawable", requireContext().getPackageName()
        ));

        binding.floatingActionButton2.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_ucuncuFragment_to_sheetFragment2);
        });

        return binding.getRoot();
    }
}