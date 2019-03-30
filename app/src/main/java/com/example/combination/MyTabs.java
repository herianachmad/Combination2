package com.example.combination;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MyTabs extends AppCompatActivity {
    TabLayout my_view_tab;
    ViewPager my_view_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tabs);

        my_view_tab = (TabLayout) findViewById(R.id.my_view_tab);
        my_view_page = (ViewPager) findViewById(R.id.my_view_page);

        my_view_page.setAdapter(new MyOwnPageAdapter(getSupportFragmentManager()));
        my_view_tab.setupWithViewPager(my_view_page);

        my_view_tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                my_view_page.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    //fragment and tab view
    class MyOwnPageAdapter extends FragmentPagerAdapter {
        String data[] = {"Java", "Android", "IoS"};

        public MyOwnPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new JavaFragment();
            }
            if (position == 1) {
                return new AndroidFragment();
            }
            if (position == 2) {
                return new IOSFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }
}
