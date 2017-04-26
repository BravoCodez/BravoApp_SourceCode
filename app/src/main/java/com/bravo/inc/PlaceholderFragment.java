package com.bravo.inc;

/**
 * Created by Bravo Inc.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
     * A placeholder fragment containing a simple view.
     */
public class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private RecyclerView mRecyclerView;
        private RecyclerView.Adapter mAdapter;
        private CardView mCardview;

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            Bundle bundle = getArguments();
            int position = bundle.getInt(ARG_SECTION_NUMBER);


            switch (position) {
                case 1:
                    mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
                    mAdapter = new AppDeveloperAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case 2:
                    mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
                    mAdapter = new VersionAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
            }

            // HERE YOU SET THE RECYCLER VIEW
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            // To Optimize the RecyclerView
            mRecyclerView.setHasFixedSize(true);

            return rootView;
        }

        private void goToUrl (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
    }
