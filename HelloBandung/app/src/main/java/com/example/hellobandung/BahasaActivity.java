package com.example.hellobandung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BahasaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Punten", "Permisi"));
        words.add(new Word("Hatur Nuhun", "Terima Kasih"));
        words.add(new Word("Aya-Aya Wae", "Ada-Ada Saja"));
        words.add(new Word("Kumaha?", "Bagaimana?"));
        words.add(new Word("Kumaha,Damang?", "Bagaimana,Sehat?"));
        words.add(new Word("Bade Kamana", "Mau Kemana?"));
        words.add(new Word("Iraha?", "Kapan?"));
        words.add(new Word("Naon?", "Apa?"));
        words.add(new Word("Timana?", "Darimana?"));
        words.add(new Word("Kunaon?", "Lagi Ngapain?"));
        words.add(new Word("Kamana?", "Kemana?"));
        words.add(new Word("Nuju Naon?", "Lagi Ngapain?"));
        words.add(new Word("Tipayun nya", "Duluan Ya"));
        words.add(new Word("Nu Leres?", "Yang Bener?"));
        words.add(new Word("Aya Naon?", "Ada Apa?"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

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
