package com.example.m4359touchscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TabLayout mReadingsTabs;
    private TabLayout mConfigTabs;
    private SectionsPageAdapter mReadingsSectionsPageAdapter;
    private SectionsPageAdapter mConfigSectionsPageAdapter;
    private ViewPager mReadingsViewPager;
    private ViewPager mConfigViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mReadingsTabs = (TabLayout)findViewById(R.id.ReadingsTabLayout);
        mConfigTabs = (TabLayout)findViewById(R.id.ConfigTabLayout);

        mReadingsViewPager = (ViewPager)findViewById(R.id.ReadingsViewPager);
        mConfigViewPager = (ViewPager)findViewById(R.id.ConfigViewPager);

        List<Fragment> readingsFragments = new ArrayList<>();
        List<String> readingsTitles = new ArrayList<>();
        readingsFragments.add(new ExtensometerReadingsFragment());
        readingsFragments.add(new TemperatureReadingFragment());
        readingsFragments.add(new LoadReadingsFragment());
        readingsFragments.add(new TimerReadingsFragment());

        readingsTitles.add("Extens");
        readingsTitles.add("Temps");
        readingsTitles.add("Load");
        readingsTitles.add("Timers");

        List<Fragment> configFragments = new ArrayList<>();
        List<String> configTitles = new ArrayList<>();
        configFragments.add(new StatusConfigFragment());
        configFragments.add(new ParametersConfigFragment());
        configFragments.add(new OptionsConfigFragment());
        configFragments.add(new ControlsConfigFragment());

        configTitles.add("Status");
        configTitles.add("Params");
        configTitles.add("Options");
        configTitles.add("Control");

        List<List<Fragment>> listOfFragmentsLists = new ArrayList<>(Arrays.asList(readingsFragments, configFragments));
        List<List<String>> listOfTitlesLists = new ArrayList<>(Arrays.asList(readingsTitles, configTitles));
        List<ViewPager> listOfViewPagers = new ArrayList<>(Arrays.asList(mReadingsViewPager, mConfigViewPager));

        SectionsPageAdapter.setupViewPager(getSupportFragmentManager(), listOfViewPagers, listOfFragmentsLists, listOfTitlesLists);

        mReadingsTabs.setupWithViewPager(mReadingsViewPager);
        mConfigTabs.setupWithViewPager(mConfigViewPager);

    }
}