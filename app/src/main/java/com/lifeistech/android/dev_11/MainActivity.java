package com.lifeistech.android.dev_11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=(ListView)findViewById(R.id.listView);
        mCards=new ArrayList<Card>();

        mCards.add(new Card(R.drawable.chabudai,getString(R.string.chabudai_title),getString(R.string.chabudai_content),getString(R.string.chabudai_meaning)));
        mCards.add(new Card(R.drawable.shacho,getString(R.string.president_title),getString(R.string.president_content),getString(R.string.president_meaning)));
        mCards.add(new Card(R.drawable.sanpo,getString(R.string.walk_title),getString(R.string.walk_content),getString(R.string.walk_meaning)));
        mCards.add(new Card(R.drawable.jump,getString(R.string.jump_title),getString(R.string.jump_content),getString(R.string.jump_meaning)));
        mCardAdapter=new CardAdapter(this,R.layout.card,mCards);
        mListView.setAdapter(mCardAdapter);
    }
}
