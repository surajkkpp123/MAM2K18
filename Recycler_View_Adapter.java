package com.mnnit.athleticmeet.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.mnnit.athleticmeet.R;
import com.mnnit.athleticmeet.activities.Data;

import java.util.Collections;
import java.util.List;

/**
 * Created by Aniket Kumar on 15-Jan-18.
 */


public class Recycler_View_Adapter extends RecyclerView.Adapter<View_Holder> {

    List<Data> list = Collections.emptyList();
    Context context;

    public Recycler_View_Adapter(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        View_Holder holder = new View_Holder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);
        holder.description.setText(list.get(position).description);
        holder.imageView.setImageResource(list.get(position).imageId);
        animate(holder);

    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    // Insert a new item to the RecyclerView on a predefined position
//    public void insert(int position, Data data) {
//        list.add(position, data);
//        notifyItemInserted(position);
//    }

    // Remove a RecyclerView item containing a specified Data object
//    public void remove(Data data) {
//        int position = list.indexOf(data);
//        list.remove(position);
//        notifyItemRemoved(position);
//    }
    public void animate(RecyclerView.ViewHolder viewHolder) {
        final Animation animAnticipateOvershoot = AnimationUtils.loadAnimation(context, R.anim.bounce_interpolater);
        viewHolder.itemView.setAnimation(animAnticipateOvershoot);
    }

}