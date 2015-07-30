package io.dflabs.toolbar.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import io.dflabs.toolbar.fragments.BasicFragment;

public class TabsAdapter extends FragmentStatePagerAdapter {


    public TabsAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return BasicFragment.newInstance(position);
            case 1:
                return BasicFragment.newInstance(position);
            case 2:
                return BasicFragment.newInstance(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "M";
            case 1:
                return "Lollipop";
            case 2:
                return "Kit Kat";
        }
        return "";
    }
}
