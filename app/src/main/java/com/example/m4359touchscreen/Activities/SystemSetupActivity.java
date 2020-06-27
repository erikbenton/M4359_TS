package com.example.m4359touchscreen.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.m4359touchscreen.Fragments.FrameSettingsFragment;
import com.example.m4359touchscreen.R;
import com.example.m4359touchscreen.Helpers.SectionsPageAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class SystemSetupActivity extends AppCompatActivity {

    private static final String TAG = "SystemSetupActivity";

    private TabLayout mSystemSettingsTabs;
    private SectionsPageAdapter mSystemSettingsSectionsPageAdapter;
    private ViewPager mSystemSettingsViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_setup);

        mSystemSettingsTabs = (TabLayout) findViewById(R.id.SystemSettingsTabLayout);
        mSystemSettingsViewPager = (ViewPager) findViewById(R.id.SystemSettingsViewPager);

        List<Fragment> systemSettingsFragments = new ArrayList<>();
        List<String> systemSettingsTitles = new ArrayList<>();
        systemSettingsFragments.add(new FrameSettingsFragment());
        systemSettingsFragments.add(new FrameSettingsFragment());
        systemSettingsFragments.add(new FrameSettingsFragment());
        systemSettingsFragments.add(new FrameSettingsFragment());
        systemSettingsFragments.add(new FrameSettingsFragment());

        systemSettingsTitles.add(getResources().getString(R.string.frame_settings_title));
        systemSettingsTitles.add(getResources().getString(R.string.extensometers_settings_tab));
        systemSettingsTitles.add(getResources().getString(R.string.temp_settings_title));
        systemSettingsTitles.add(getResources().getString(R.string.load_settings_title));
        systemSettingsTitles.add(getResources().getString(R.string.filters_settings_tab));

        SectionsPageAdapter.setupViewPager(getSupportFragmentManager(), mSystemSettingsViewPager, systemSettingsFragments, systemSettingsTitles);

        mSystemSettingsTabs.setupWithViewPager(mSystemSettingsViewPager);

    }
}