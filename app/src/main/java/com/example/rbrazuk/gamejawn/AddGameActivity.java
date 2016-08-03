package com.example.rbrazuk.gamejawn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AddGameActivity extends AppCompatActivity {

    @BindView(R.id.til_title) AppCompatEditText tilTitle;
    @BindView(R.id.til_system) AppCompatEditText tilSystem;
    @BindView(R.id.til_genre) AppCompatEditText tilGenre;
    @BindView(R.id.til_year) AppCompatEditText tilYear;
    @BindView(R.id.bt_add) Button btAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.bt_add)
    public void onAddClicked(View view) {
        addNewGame();
    }

    public void addNewGame() {
        Game game = new Game();
        game.setTitle(tilTitle.getText().toString());
        game.setSystem(tilSystem.getText().toString());
        game.setGenre(tilGenre.getText().toString());
        //game.setYear(Integer.parseInt(tilYear.toString()));

        Toast.makeText(this, String.format("Added %s to %s",game.getTitle(),game.getSystem()),Toast.LENGTH_LONG).show();

        tilTitle.setText("");
        tilSystem.setText("");
        tilGenre.setText("");
        tilYear.setText("");

        game.save();
    }
}
