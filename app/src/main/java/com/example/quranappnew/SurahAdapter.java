package com.example.quranappnew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SurahAdapter extends ArrayAdapter<tayah> {

    public SurahAdapter(@NonNull Context context, ArrayList<tayah> ayah) {
        super(context, 0, ayah);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        tayah ayah=getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.surah_customizedview, parent, false);
        TextView ayat= convertView.findViewById(R.id.ayah);
        ayat.setText(ayah.getArabicText());
        return convertView;
    }
}
