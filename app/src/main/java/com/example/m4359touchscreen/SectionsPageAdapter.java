package com.example.m4359touchscreen;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class SectionsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList;
    private final List<String> mFragmentTitles;

    public void addFragment(TemperatureReadingFragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitles.add(title);
    }

    public SectionsPageAdapter(@NonNull FragmentManager fm, List<Fragment> fragments, List<String> titles) {
        super(fm);
        mFragmentList = fragments;
        mFragmentTitles = titles;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public static void setupViewPager(@NonNull FragmentManager fm, List<ViewPager> viewPagers, List<List<Fragment>> listOfFragmentLists, List<List<String>> listOfTitleLists) {
        for(int i = 0; i < viewPagers.size(); i++) {
            ViewPager viewPager = viewPagers.get(i);
            List<Fragment> fragments = listOfFragmentLists.get(i);
            List<String> titles = listOfTitleLists.get(i);

            SectionsPageAdapter adapter = new SectionsPageAdapter(fm, fragments, titles);
            viewPager.setAdapter(adapter);
        }
    }

    public static void setupViewPager(@NonNull FragmentManager fm, ViewPager viewPager, List<Fragment> fragments, List<String> titles) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(fm, fragments, titles);
        viewPager.setAdapter(adapter);
    }
}
