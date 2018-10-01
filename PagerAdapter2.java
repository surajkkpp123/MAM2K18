package com.mnnit.athleticmeet.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mnnit.athleticmeet.fragments.Fragmentra1;
import com.mnnit.athleticmeet.fragments.Fragmentra2;
import com.mnnit.athleticmeet.fragments.Fragmentra3;

/**
 * Created by Ankit on 1/15/2018.
 */

public class PagerAdapter2 extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter2(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                Fragmentra1 tab1 = new Fragmentra1();
                return tab1;
            case 1:
                Fragmentra2 tab2 = new Fragmentra2();
                return  tab2;
            case 2:
                Fragmentra3 tab3 = new Fragmentra3();
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
