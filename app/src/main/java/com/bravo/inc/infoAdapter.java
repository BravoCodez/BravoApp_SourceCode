package com.bravo.inc;

/**
 * Created by Bravo Inc.
 */

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class infoAdapter extends RecyclerView.Adapter<infoAdapter.ViewHolder> {

    List<AdapterData> mItems;

    /**
     * It shows the Information on First Tab.
     */

    public infoAdapter() {
        super();
        mItems = new ArrayList<AdapterData>();
        AdapterData data = new AdapterData();
        data.setName("");
        data.setDetail("");
        mItems.add(data);

        data = new AdapterData();
        data.setName("About BravoUX");
        data.setDetail("This project was actually started for bringing Modified SystemUI, but time to time it expanded to Themes and PORTED Themes for Specific Devices. BravoUX has made total 10 SystemUI, Two App Themes, One Touchwiz Theme and 10 Ported Themes ! \n");
        mItems.add(data);

        data = new AdapterData();
        data.setName("BravoUX Channel");
        data.setDetail(" \nTelegram Channel: @BravoUI \nLink: https://t.me/bravoui \n \nJoin Channel to Get Latest Info and Downloads before it get Published on XDA !");
        mItems.add(data);

    }


    @Override
    public int getItemCount() {

        return mItems.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_box, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        AdapterData movie = mItems.get(i);
        viewHolder.natName.setText(movie.getName());
        viewHolder.natDetail.setText(movie.getDetail());
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView natThumbnail;
        public TextView natName;
        public TextView natDetail;
        CardView cv;


        public ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv_info);
            natName = (TextView)itemView.findViewById(R.id.card_name);
            natDetail = (TextView)itemView.findViewById(R.id.card_detail);
        }
    }
}
