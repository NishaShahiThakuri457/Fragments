package com.e.fragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.ViewPagerAdapter;
import fragments.CelsiusFragment;
import fragments.FahrenheitFragment;
import fragments.FirstFragment;
import fragments.SecondFragment;
import fragments.SiFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout = findViewById(R.id.tabid);
        viewPager= findViewById(R.id.viewpager);

        ViewPagerAdapter adapter= new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addfragment(new FirstFragment(),"sum");
        adapter.addfragment(new SecondFragment(), "Area of circle");
        adapter.addfragment(new CelsiusFragment(),"F to C");
        adapter.addfragment(new FahrenheitFragment(),"C to F");
        adapter.addfragment(new SiFragment(),"SI");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
