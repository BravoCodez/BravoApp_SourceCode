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

public class ChangelogAdapter extends RecyclerView.Adapter<ChangelogAdapter.ViewHolder> {

    List<AdapterData> mItems;

    /**
     * Edit this and see changes in Changelog Tab.
     */

    public ChangelogAdapter() {
        super();
        mItems = new ArrayList<AdapterData>();
        AdapterData data = new AdapterData();
        data.setName("SystemUI");
        data.setDetail("*Changed Toggle Background \n*Chnaged Toggle Colors \n*Changed Toggle Text \n*Editied Dimensions of Notifications \n*Edited Dimensions of SystemUI \n*Fixed Animated Brightness Icon \n*Changed Quick Connect and Dual Sim Panel Background and Text Colors \n*Modified Lot's of Things");
        mItems.add(data);

        data = new AdapterData();
        data.setName("Themes");
        data.setDetail("*Added the New S8 Icons \n*Made everything Material Design \n*Added New Fonts \n*Made perfect combinations of Dark Colors \n*Edited lot's of Stuffs \n*Themed Whole Phone !");
        mItems.add(data);

        data = new AdapterData();
        data.setName("Ported Themes");
        data.setDetail("*Oreo Theme \n*Particle Theme \n*Bravo Theme \n*Olympic Theme \n*OxygenUI \n*PurpleTheme \nAnd More \n \n*In that Following Were Ported: \n*Ported Icon Theme \n*Ported Wallpaper Theme \n*Ported Home Theme \n \n**UNRELASED PORTS** \n*Ported Framework Theme \n*Ported Settings Theme \n*Ported Phone Theme \n*Ported Contacts Theme \n*Ported Calender Theme \n*Ported Calculator Theme \n*Ported Clock Theme \n*Ported Many Themes...");
        mItems.add(data);

    }

    /**
     * Edit Below Codes Carefully...Well its not needed to do !
     */

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        AdapterData movie = mItems.get(i);
        viewHolder.natName.setText(movie.getName());
        viewHolder.natDetail.setText(movie.getDetail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
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
