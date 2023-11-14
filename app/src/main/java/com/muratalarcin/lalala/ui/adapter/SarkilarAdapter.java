package com.muratalarcin.lalala.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.muratalarcin.lalala.R;
import com.muratalarcin.lalala.data.entity.Sarkilar;
import com.muratalarcin.lalala.databinding.SarkilarRowBinding;
import com.muratalarcin.lalala.ui.fragment.IkinciFragmentDirections;


import java.util.List;

public class SarkilarAdapter extends RecyclerView.Adapter<SarkilarAdapter.CardTasarimTutucu> {
    private List<Sarkilar> sarkilarListesi;
    private Context mContext;

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private SarkilarRowBinding tasarim;

        public CardTasarimTutucu(SarkilarRowBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    public SarkilarAdapter(List<Sarkilar> sarkilarListesi, Context mContext) {
        this.sarkilarListesi = sarkilarListesi;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SarkilarRowBinding binding = SarkilarRowBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Sarkilar sarki = sarkilarListesi.get(position);
        SarkilarRowBinding t = holder.tasarim;

        t.imageView.setImageResource(mContext.getResources()
                .getIdentifier(sarki.getResim(), "drawable", mContext.getPackageName()));

        t.textViewAd.setText(sarki.getAd());
        t.textViewTur.setText(sarki.getTur());
        t.textViewDinlenme.setText(sarki.getDinlenme()+ " ");

        t.ratingBarSekli.setRating(sarki.getPuan());

        t.cardViewSarki.setOnClickListener(view -> {
            IkinciFragmentDirections.Gecis gecis = IkinciFragmentDirections.gecis(sarki);
            Navigation.findNavController(view).navigate(gecis);
        });


    }

    @Override
    public int getItemCount() {
        return sarkilarListesi.size();
    }

}
