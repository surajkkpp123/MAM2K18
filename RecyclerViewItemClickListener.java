package com.mnnit.athleticmeet.listeners;

import android.view.View;

/**
 * Created by Aniket Kumar on 15-Jan-18.
 */

public interface RecyclerViewItemClickListener {
    public void onClick(View view, int position);
    public void onLongClick(View view, int position);
}