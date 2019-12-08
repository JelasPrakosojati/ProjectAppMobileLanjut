package com.k01.waktudunia;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = getSupportActionBar();

        loadFragment(new AsiaFragment());

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        final SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        f.setTimeZone(TimeZone.getTimeZone("UTC"));
        toolbar.setTitle("Asia");
        toolbar.setSubtitle(f.format(new Date()));
    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.nav_asia:
                    toolbar.setTitle("Asia");
                    fragment = new AsiaFragment();
                    break;
                case R.id.nav_amerika:
                    toolbar.setTitle("Amerika");
                    fragment = new AmerikaFragment();
                    break;
                case R.id.nav_afrika:
                    toolbar.setTitle("Afrika");
                    fragment = new AfrikaFragment();
                    break;
                case R.id.nav_eropa:
                    toolbar.setTitle("Eropa");
                    fragment = new EropaFragment();
                    break;
                case R.id.nav_oseania:
                    toolbar.setTitle("Oseania");
                    fragment = new OseaniaFragment();
                    break;
            }
            return loadFragment(fragment);
        }
    };
}