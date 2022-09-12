package com.example.quranappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Surah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);
        Intent i=getIntent();
        int id=Integer.parseInt(i.getStringExtra("id"));
        ListView surahList=findViewById(R.id.completesurah);

        DBhelper dBhelper= new DBhelper(Surah.this);

        ArrayList<tayah> surahArray=dBhelper.getFullSurah(id+1);

        SurahAdapter surahAdapter= new SurahAdapter(this,surahArray);
        surahList.setAdapter(surahAdapter);
}
}