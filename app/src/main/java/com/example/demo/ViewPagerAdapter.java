package com.example.demo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> fl=new ArrayList<Fragment>();
    private final ArrayList<String> ft=new ArrayList<String>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fl.get(position);
    }

    @Override
    public int getCount() {
        return fl.size();
    }
    public void addFrag(Fragment fragment,String title){
        fl.add(fragment);
        ft.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return ft.get(position);
    }
}
