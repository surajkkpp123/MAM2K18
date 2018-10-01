package com.mnnit.athleticmeet.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mnnit.athleticmeet.R;

/**
 * Created by Aniket Kumar on 16-Jan-18.
 */
public class RecyclerViewHoldersWinner extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title;
    RecyclerViewHoldersWinner(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView2);
        title = (TextView) itemView.findViewById(R.id.games);

    }
}