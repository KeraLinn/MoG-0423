package com.example.mog_0423;


import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class customNavDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;

    @Override
    public void setContentView(View view) {
        drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.nav_custom_drawer, (ViewGroup) view
                ,false);
        //drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.nav_custom_drawer,
                //null);
        FrameLayout container = drawerLayout.findViewById(R.id.activityContainer);
        container.addView(view);
        super.setContentView(drawerLayout);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        //toolbar.setNavigationOnClickListener(v -> drawerLayout.open());

        //toolbar.isShown();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = drawerLayout.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,
                toolbar, R.string.menu_drawer_open, R.string.menu_drawer_close);
        toolbar.setNavigationOnClickListener(v -> drawerLayout.openDrawer(GravityCompat.START));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        TextView playerName =
                (TextView) navigationView.getHeaderView(0).findViewById(R.id.nav_profile_name);
        playerName.setText("Haven");
        ImageView playerAvatar =
                (ImageView) navigationView.getHeaderView(0).findViewById(R.id.nav_profile_image);
        playerAvatar.setImageResource(R.drawable.icons8_cat_100);

        /*SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        encodedImage = sharedPreferences.getString(PROFILE_IMAGE,"");
        String fullName = sharedPreferences.getString(PROFILE_NAME, "");
        TextView navProfileName = (TextView) navigationView.getHeaderView(0).findViewById(R.id.nav_profile_name);
        navProfileName.setText(fullName);
        ImageView navProfileImage = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.nav_profile_image);
        if(!encodedImage.equalsIgnoreCase("")){
            byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
            navProfileImage.setImageBitmap(bitmap);

        }*/
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);

            switch (item.getAlphabeticShortcut()){
                case 'E':
                    startActivity(new Intent(this, MainActivity.class));
                    overridePendingTransition(0,0);
                    break;
                case 'C':
                    startActivity(new Intent(this, CommodityRecyclerViewDataClass.class));
                    overridePendingTransition(0,0);
                    break;
                case 'A':
                    startActivity(new Intent(this, cityArrival1Merchant.class));
                    overridePendingTransition(0,0);
                    break;
                case 'G':
                    startActivity(new Intent(this, startNewGame.class));
                    overridePendingTransition(0,0);
                    break;
        }
        return true;
    }
    protected void allocateActivityTitle(String titleString) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(titleString);
        }
    }
}

