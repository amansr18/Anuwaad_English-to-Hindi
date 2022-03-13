package com.example.anuwaad.anuwaadApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("zero", "शून्य"));
        words.add(new Word("one", "एक"));
        words.add(new Word("two", "दो"));
        words.add(new Word("three", "तीन"));
        words.add(new Word("four", "चार"));
        words.add(new Word("five", "पाँच"));
        words.add(new Word("six", "छह"));
        words.add(new Word("seven", "सात"));
        words.add(new Word("eight", "आठ"));
        words.add(new Word("nine", "नौ"));
        words.add(new Word("ten", "दस"));

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