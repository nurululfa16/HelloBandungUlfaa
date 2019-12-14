package com.example.hellobandung;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class KulinerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Lokasi: Jl. Buah Batu No.163, Turangga, Lengkong, Kota Bandung, Jawa Barat", "Seblak Jebred", R.drawable.seblak));
        words.add(new Word("Lokasi: Jl. Cihapit, Cihapit, Bandung, Kota Bandung, Jawa Barat", "Serabi Cihapit", R.drawable.serabi));
        words.add(new Word("Lokasi: Jl. Macan, Burangrang, Lengkong, Kota Bandung, Jawa Barat", "Nasi Tutug Oncom Bi Kokom", R.drawable.nasitutug));
        words.add(new Word("Lokasi: Jl. Bawean Pav. 3, Bandung, Merdeka, Sumur Bandung, Jawa Barat", "Nasi Timbel Bawean", R.drawable.nasitimbel));
        words.add(new Word("Lokasi: Jl. Cihapit No.6, Cihapit, Bandung Wetan, Kota Bandung, Jawa Barat", "Karedok Cihapit Bu Siti", R.drawable.karedok));
        words.add(new Word("Lokasi: Jl. Kyai Haji Ahmad Dahlan No. 67, Turangga, Lengkong, Kota Bandung, Jawa Barat", "Mie Kocok Mang Dadeng", R.drawable.miekocok));
        words.add(new Word("Lokasi: Jl. Cisangkuy No.56, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat", "Bandros Cowboy Cisangkuy", R.drawable.bandros));
        words.add(new Word("Lokasi: Jl. Haji Akbar No.4, Pasir Kaliki, Cicendo, Pasir Kaliki, Cicendo, Kota Bandung, Jawa Barat", "Pisang Bollen Kartika Sari", R.drawable.bollen));
        words.add(new Word("Lokasi: Jl. Ahmad Yani No. 733, Cicaheum, Kiaracondong, Padasuka, Cibeunying Kidul, Kota Bandung, Jawa Barat", "Colenak Murdi Putra", R.drawable.colenak));
        words.add(new Word("Lokasi: Jl. Raya Lembang No.177, Jayagiri, Lembang, Kabupaten Bandung Barat, Jawa Barat", "Tahu Susu Lembang", R.drawable.tahususu));

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


