package com.example.quranappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SurahList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_list);

        ListView surahList=findViewById(R.id.surahlistview);
        DBhelper dBhelper= new DBhelper(SurahList.this);
        ArrayList<tsurah> surahListArray=dBhelper.getAllSurah();

        SurahListAdapter surahListAdapter= new SurahListAdapter(this,surahListArray);
        surahList.setAdapter(surahListAdapter);


        surahList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(SurahList.this , Surah.class);
                 intent.putExtra("id",String.valueOf(position));

                startActivity(intent);
            }
        });

    }
}