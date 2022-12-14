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

public class SurahListAdapter extends ArrayAdapter<tsurah> {

    public SurahListAdapter(@NonNull Context context, ArrayList<tsurah> surah) {
        super(context, 0, surah);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        tsurah surahNames=getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.surahlist_customizedview, parent, false);
        TextView surahName= convertView.findViewById(R.id.surahName);
        surahName.setText(surahNames.getSurahNameE());
        return convertView;
    }
}
