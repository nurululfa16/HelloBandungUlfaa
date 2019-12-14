package com.example.hellobandung;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WisataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Lokasi: Jl. Maribaya No.149/252, Kp Babakan, Gentong, Cibodas, Lembang", "The Lodge Maribaya", R.drawable.maribaya));
        words.add(new Word("Lokasi: Jl. Raya Lembang No.108, Gudangkahuripan, Lembang", "Farm House Lembang", R.drawable.farm));
        words.add(new Word("Lokasi: Gunung Masigit, Kec. Cipatat, Kabupaten Bandung Barat", "Tebing Masigit Padalarang", R.drawable.masigit));
        words.add(new Word("Lokasi: Jl. Diponegoro No.22, Citarum, Kec. Bandung Wetan, Kota Bandung", "Gedung Sate", R.drawable.gedsate));
        words.add(new Word("Lokasi: Jl. Raya Tangkuban Perahu, Lembang, Jawa Barat", "Tangkuban Perahu", R.drawable.tangkuban));
        words.add(new Word("Lokasi: Jl. Kolonel Masturi No.KM, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat", "Dusun Bambu", R.drawable.dusun));
        words.add(new Word("Lokasi: Jl. Tangkuban Perahu KM.8, Cikole, Lembang, Cikole, Lembang, Kabupaten Bandung Barat", "Grafika Cikole", R.drawable.cikole));
        words.add(new Word("Lokasi: Jl. Maribaya No.17, Kayuambon, Lembang, Kabupaten Bandung Barat", "De'Ranch", R.drawable.deranch));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on

    }
}
