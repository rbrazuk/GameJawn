package com.example.rbrazuk.gamejawn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_show_games) Button btShowGames;
    @BindView(R.id.bt_add) Button btAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //Game.deleteAll(Game.class);






    }

    @OnClick(R.id.bt_show_games)
    public void showGames(View view) {
        Intent intent = new Intent(MainActivity.this,GamesListActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.bt_add)
    public void addGame(View view) {
        Intent intent = new Intent(MainActivity.this,AddGameActivity.class);
        startActivity(intent);
    }
}
