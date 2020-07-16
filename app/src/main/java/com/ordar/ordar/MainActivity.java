package com.ordar.ordar;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ordar.ordar.ui.home.HomeFragment;

import static com.ordar.ordar.R.id.nav_host_fragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, nav_host_fragment);

       navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

               if (menuItem.getItemId() == R.id.profile)
               {
                   HomeFragment homeFragment = new HomeFragment();
                   FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                   transaction.replace(R.id.nav_host_fragment, homeFragment);
                   transaction.commit();
               }
                else if (menuItem.getItemId() == R.id.goods)
               {
                   GoodsFragment goodsFragment = new GoodsFragment();
                   FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                   transaction.replace(R.id.nav_host_fragment, goodsFragment);
                   transaction.commit();
               }

               else if (menuItem.getItemId() == R.id.goods)
               {
                   GoodsFragment goodsFragment = new GoodsFragment();
                   FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                   transaction.replace(R.id.nav_host_fragment, goodsFragment);
                   transaction.commit();
               }

               else if (menuItem.getItemId() == R.id.goods)
               {
                   GoodsFragment goodsFragment = new GoodsFragment();
                   FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                   transaction.replace(R.id.nav_host_fragment, goodsFragment);
                   transaction.commit();
               }

               else if (menuItem.getItemId() == R.id.goods)
               {
                   GoodsFragment goodsFragment = new GoodsFragment();
                   FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                   transaction.replace(R.id.nav_host_fragment, goodsFragment);
                   transaction.commit();
               }

               return false;
               }
               });
    }

}
