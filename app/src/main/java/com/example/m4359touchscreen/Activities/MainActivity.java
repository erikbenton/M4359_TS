package com.example.m4359touchscreen.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.m4359touchscreen.Fragments.ControlsConfigFragment;
import com.example.m4359touchscreen.Fragments.ControlsFragment;
import com.example.m4359touchscreen.Fragments.ExtensometerReadingsFragment;
import com.example.m4359touchscreen.Fragments.LoadReadingsFragment;
import com.example.m4359touchscreen.Fragments.OptionsConfigFragment;
import com.example.m4359touchscreen.Fragments.ParametersConfigFragment;
import com.example.m4359touchscreen.Fragments.StatusConfigFragment;
import com.example.m4359touchscreen.Fragments.TemperatureReadingFragment;
import com.example.m4359touchscreen.Fragments.TimerReadingsFragment;
import com.example.m4359touchscreen.R;
import com.example.m4359touchscreen.Helpers.SectionsPageAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.layout_drawer);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_control:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ControlsFragment()).commit();
//                Toast.makeText(this, "Control", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_sensor_setup:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                        new ChatFragment()).commit();
                Toast.makeText(this, "Sensor Setup", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_sensor_calibration:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                        new ProfileFragment()).commit();
                Toast.makeText(this, "Sensor Calibration", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_test_settings:
                Toast.makeText(this, "Test Settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_graphing:
                Toast.makeText(this, "Graphing", Toast.LENGTH_SHORT).show();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}