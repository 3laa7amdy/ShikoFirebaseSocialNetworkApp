package com.alaa7amdy.shiko;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView ;
    private DrawerLayout drawerLayout;
    private RecyclerView postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                userMenuSelected(menuItem);
                return false;
            }
        });


    }

    private void userMenuSelected(MenuItem menuItem) {

        switch (menuItem.getItemId()){
            case R.id.nav_add_post:
                Toast.makeText(this, "Add New Post", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_profile:
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_home:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_friends:
                Toast.makeText(this, "Friends", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_find_friends:
                Toast.makeText(this, "Find Friends" , Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_messages:
                Toast.makeText(this, "Messages", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_setting:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_logout:
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
