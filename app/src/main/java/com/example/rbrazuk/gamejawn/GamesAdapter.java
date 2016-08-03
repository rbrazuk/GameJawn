package com.example.rbrazuk.gamejawn;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_title) TextView tvTitle;
        @BindView(R.id.tv_system) TextView tvSystem;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    private List<Game> mGames;

    private Context mContext;

    public GamesAdapter(Context context, List<Game> games) {
        mGames = games;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View gamesView = inflater.inflate(R.layout.item_game,parent, false);

        ViewHolder viewHolder = new ViewHolder(gamesView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Game game = mGames.get(position);

        TextView tvTitle = holder.tvTitle;
        tvTitle.setText(game.getTitle());

        TextView tvSystem = holder.tvSystem;
        tvSystem.setText(game.getSystem());
    }

    @Override
    public int getItemCount() {
        return mGames.size();
    }
}
