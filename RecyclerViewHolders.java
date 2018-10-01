package com.mnnit.athleticmeet.adapters;

/**
 * Created by Aniket Kumar on 15-Jan-18.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mnnit.athleticmeet.R;

public class RecyclerViewHolders extends RecyclerView.ViewHolder {

    CardView cv;
    TextView title;
    ImageView imageView;
    RecyclerViewHolders(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.card_view1);
        title = (TextView) itemView.findViewById(R.id.name);
        imageView = (ImageView) itemView.findViewById(R.id.photo);
    }
}