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
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;


import com.muratalarcin.lalala.databinding.FragmentBirinciBinding;

import java.util.ArrayList;

public class BirinciFragment extends Fragment {
    FragmentBirinciBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBirinciBinding.inflate(inflater, container, false);

        binding.button.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_birinciFragment_to_ikinciFragment);
        });

        ArrayList<String> ulkeler = new ArrayList<>();
        ulkeler.add("Türkiye");
        ulkeler.add("İtalya");
        ulkeler.add("Japonya");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item, ulkeler);
        binding.autoTextView.setAdapter(arrayAdapter);

        return binding.getRoot();
    }
}