package com.example.anuwaad.anuwaadApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "पिता"));
        words.add(new Word("mother", "मां"));
        words.add(new Word("son", "बेटा"));
        words.add(new Word("daughter", "बेटी"));
        words.add(new Word("older brother", "बड़ा भाई"));
        words.add(new Word("younger brother", "छोटा भाई"));
        words.add(new Word("older sister", "बड़ी बहन"));
        words.add(new Word("younger sister", "छोटी बहन"));
        words.add(new Word("grandmother ", "दादी मा"));
        words.add(new Word("grandfather", "दादा"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}