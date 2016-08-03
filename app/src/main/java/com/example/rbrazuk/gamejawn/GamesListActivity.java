package com.example.rbrazuk.gamejawn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GamesListActivity extends AppCompatActivity {

    @BindView(R.id.rv_games) RecyclerView rvGames;

    ArrayList<Game> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_list);

        ButterKnife.bind(this);

        //addNewGame("Star Fox", "SNES");

        games = (ArrayList<Game>) Game.listAll(Game.class);

        GamesAdapter adapter = new GamesAdapter(this,games);

        rvGames.setAdapter(adapter);
        rvGames.setLayoutManager(new LinearLayoutManager(this));


    }

    public void addNewGame(String title, String system) {
        Game game = new Game();
        game.setTitle(title);
        game.setSystem(system);

        game.save();
    }
}
