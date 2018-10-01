package com.mnnit.athleticmeet.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mnnit.athleticmeet.fragments.Fragmenter1;
import com.mnnit.athleticmeet.fragments.Fragmenter2;
import com.mnnit.athleticmeet.fragments.Fragmenter3;

/**
 * Created by Ankit on 1/15/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Fragmenter1 tab1 = new Fragmenter1();
                return tab1;
            case 1:
                 Fragmenter2 tab2 = new Fragmenter2();
                return  tab2;
            case 2:
                Fragmenter3 tab3 = new Fragmenter3();
                return  tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
