package com.example.anuwaad.anuwaadApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "लाल"));
        words.add(new Word("mustard yellow", "सरसों पीली"));
        words.add(new Word("dusty yellow", "धूल भरा पीला"));
        words.add(new Word("green", "हरा"));
        words.add(new Word("brown", "भूरा"));
        words.add(new Word("gray", "धूसर"));
        words.add(new Word("black", "काला"));
        words.add(new Word("white", "सफेद"));
        words.add(new Word("Orange", "नारंगी"));
        words.add(new Word("Blue", "नीला "));
        words.add(new Word("Pink", "गुलाबी "));
        words.add(new Word("Olive", "जैतून का रंग"));
        words.add(new Word("Navy blue", "गहरा नीला"));
        words.add(new Word("Maroon", "भूरा लाल रंग"));
        words.add(new Word("Purple", "बैंगनी"));


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