package com.example.anuwaad.anuwaadApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "तुम कहाँ जा रहे हो?"));
        words.add(new Word("What is your name?", "तुम्हारा नाम क्या हे?"));
        words.add(new Word("My name is...", "मेरा नाम है..."));
        words.add(new Word("How are you feeling?", "आप कैसा महसूस कर रहे हैं?"));
        words.add(new Word("I’m feeling good.", "मैं अच्छा महसूस कर रहा हूँ।"));
        words.add(new Word("Are you coming?", "क्या आप आ रहे हैं?"));
        words.add(new Word("Yes, I’m coming.", "हाँ, आ रहा हूं।"));
        words.add(new Word("I’m coming.", "मैं आ रहा हूं।"));
        words.add(new Word("you are a nice person", "आप एक अच्छे व्यक्ति हैं"));
        words.add(new Word("Come here.", "यहां आओ।"));

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