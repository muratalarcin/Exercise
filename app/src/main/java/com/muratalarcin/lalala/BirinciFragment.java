package com.muratalarcin.lalala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;


import com.muratalarcin.lalala.databinding.FragmentBirinciBinding;

import java.util.ArrayList;
import java.util.Locale;

public class BirinciFragment extends Fragment {
    FragmentBirinciBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBirinciBinding.inflate(inflater, container, false);

        binding.button.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_birinciFragment_to_ikinciFragment);
        });

        String[] ulkeler = {"Türkiye", "Almanya", "Fransa", "İngiltere", "İtalya", "İspanya"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ulkeler);
        binding.autoTextView.setAdapter(adapter);

        binding.floatingActionButton.setOnClickListener(view -> {
            String lala = binding.autoTextView.getText().toString();
            binding.textView2.setText(lala);
        });

        binding.ratingBar.setOnRatingBarChangeListener(((ratingBar, rating, userChanged) -> {
            if (userChanged) {
                binding.textView2.setText(String.valueOf(rating));
            }
        }));


        binding.buttonDate.setOnClickListener(view -> {
            MaterialDatePicker dp = MaterialDatePicker.Builder.datePicker()
                    .setTitleText("Tarih Seç")
                    .build();

            dp.show(getChildFragmentManager(), "");

            dp.addOnPositiveButtonClickListener(view1 -> {
                SimpleDateFormat df = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss", Locale.getDefault());
                String tarih = df.format(view1);
                binding.editTextDate.setText(tarih);
            });
        });

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                ara(s);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                ara(s);
                return true;
            }
        });





        return binding.getRoot();
    }
    public void ara(String araKelimesi) {
        Log.e("Kişi Ara", araKelimesi);
    }
}