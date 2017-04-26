package com.bravo.inc;

/**
 * Created by Bravo Inc.
 *
 * To delete Splash screen delete these:
 * -> Splashscreen.java
 * -> layout/activity_splashscreen.xml
 * -> anim/alpha.xml
 * -> anim/translate.xml
 *
 * And in Android Manifest Delete these lines:
 * -> <activity android:name=".Splashscreen"
 * android:label="@string/app_name">
 * <intent-filter>
 * <action android:name="android.intent.action.MAIN" />
 *
 * <category android:name="android.intent.category.LAUNCHER" />
 * </intent-filter>
 * </activity>
 *
 * Then Splashscreen will be Removed !
 * By: BravoInc.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    /**
     * Links to all downloads.
     */

    public void goToSo (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNSDRWcWl5bFVJcUk");
    }

    public void goToSu (View view) {
        goToUrl ( "https://drive.google.com/file/d/0B62NqUCz80pNZ1AtTDVCVy1KN0E/view?usp=drivesdk");
    }

    public void goToap (View view) {
        goToUrl ( "http://google.com");
    }

    public void goToas (View view) {
        goToUrl ( "https://drive.google.com/file/d/0B62NqUCz80pNaUI5cWRwSEh2VGs/view?usp=drivesdk");
    }

    public void goToaq (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNcmFWc1VyY1FuNEU");
    }

    public void goToar (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNcVprNDFKbXYzSzg");
    }

    public void goToat (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNVGRoQ0xKZDFMT3c");
    }

    public void goToaz (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNakRBVVZLN0xkbEE");
    }
    public void goToal (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNUENGOU14N05vWEE");
    }
    public void goToak (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNX1pIdXpKMUlrOEk");
    }
    public void goToao (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNUjRNXzRwazdZWU0");
    }
    public void goToag (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNZ1dzZnBqVFNBTjA");
    }
    public void goToaff (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNUTU5cmhOSnU1Z0k");
    }
    public void goToaa (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNN2wyYjBlb0dPYjQ");
    }
    public void goToaww (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNd0VacW14algtX3M");
    }
    public void goToadd (View view) {
        goToUrl ( "https://drive.google.com/open?id=0B62NqUCz80pNVXhBZGtpZ1luVUk");
    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Snackbar.make(view, "#BravoExperience v1.0", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if(id==R.id.navigate) {
            startActivity(new Intent(this, SubActivity.class));
        }
        else{
        startActivity(new Intent(this, SettingsActivity.class));
        return true;
    }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
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
                    mAdapter = new infoAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case 2:
                    mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
                    mAdapter = new DeveloperAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case 3:
                    mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
                    mAdapter = new ChangelogAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case 4:
                    mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
                    mAdapter = new SystemUIAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case 5:
                    mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
                    mAdapter = new ThemesAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case 6:
                    mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
                    mAdapter = new ExtraAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case 7:
                    mRecyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
                    mAdapter = new OtherAdapter();
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

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 7 total pages.
            return 7;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Info";
                case 1:
                    return "Developer";
                case 2:
                    return "ChangeLog";
                case 3:
                    return "SystemUI";
                case 4:
                    return "Themes";
                case 5:
                    return "Extra";
                case 6:
                    return "Other";
            }
            return null;
        }
    }
}
