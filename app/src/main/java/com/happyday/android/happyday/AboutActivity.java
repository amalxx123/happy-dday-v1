package com.happyday.android.happyday;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class AboutActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            Intent about = new Intent(AboutActivity.this, MainActivity.class);
            startActivity(about);
        } else if (id == R.id.nav_reminder) {
            Intent about = new Intent(AboutActivity.this, ReminderActivity.class);
            setTitle(R.string.title_activity_reminder);
            startActivity(about);
        } else if (id == R.id.nav_notification) {
            Intent about = new Intent(AboutActivity.this, NotificationActivity.class);
            setTitle(R.string.title_activity_notification);
            startActivity(about);
        } else if (id == R.id.nav_language) {
            Intent about = new Intent(AboutActivity.this, LanguageActivity.class);
            setTitle(R.string.title_activity_language);
            startActivity(about);
        } else if (id == R.id.nav_volume) {
            Intent about = new Intent(AboutActivity.this, VolumeActivity.class);
            setTitle(R.string.title_activity_volume);
            startActivity(about);
        } else if (id == R.id.nav_about) {
            Intent about = new Intent(AboutActivity.this, AboutActivity.class);
            setTitle(R.string.title_activity_about);
            startActivity(about);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
