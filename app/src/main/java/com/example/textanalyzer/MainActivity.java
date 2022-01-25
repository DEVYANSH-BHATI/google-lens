package com.example.textanalyzer;
//this is lens branch
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView nav_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav_bar = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new HomeFragment()).commit();

        nav_bar.setSelectedItemId(R.id.nav_home);

        nav_bar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch(item.getItemId()){
                    case R.id.nav_home:
                        fragment = new HomeFragment();
                        break;

                    case R.id.nav_fav:
                        fragment = new FavFragment();
                        break;

                    case R.id.nav_search:
                        fragment = new SearchFragment();
                        break;

                    case R.id.nav_shop:
                        fragment = new ShopFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment).commit();
                return true;
            }
        });
    }
}