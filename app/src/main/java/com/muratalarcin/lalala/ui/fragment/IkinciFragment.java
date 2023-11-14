package com.muratalarcin.lalala.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.lalala.data.entity.Sarkilar;
import com.muratalarcin.lalala.databinding.FragmentIkinciBinding;
import com.muratalarcin.lalala.ui.adapter.SarkilarAdapter;

import java.util.ArrayList;

public class IkinciFragment extends Fragment {
    FragmentIkinciBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentIkinciBinding.inflate(inflater, container, false);

        binding.recylclerViewSarki.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        ArrayList<Sarkilar> sarkiListesi = new ArrayList<>();
        Sarkilar f1 = new Sarkilar(1, "Caney", "caney", "Rap", 55454, 6.5F);
        Sarkilar f2 = new Sarkilar(2, "Aman Güzel", "halodayi", "Rap", 72451, 8.0F);
        Sarkilar f3 = new Sarkilar(3, "Sev Yeter", "kamuran", "Arabesk", 11451, 9.0F);
        Sarkilar f4 = new Sarkilar(4, "Rakka Oktay", "rakka", "Pop", 14554, 5.5F);
        Sarkilar f5 = new Sarkilar(5, "Margiela", "margiela", "Rap", 85457, 7.0F);
        Sarkilar f6 = new Sarkilar(6, "3 Hürel", "sevenler", "Arabesk", 85457, 7.5F);
        sarkiListesi.add(f1);
        sarkiListesi.add(f2);
        sarkiListesi.add(f3);
        sarkiListesi.add(f4);
        sarkiListesi.add(f5);
        sarkiListesi.add(f6);

        SarkilarAdapter sarkilarAdapter = new SarkilarAdapter(sarkiListesi, requireContext());
        binding.recylclerViewSarki.setAdapter(sarkilarAdapter);

        return binding.getRoot();
    }
}