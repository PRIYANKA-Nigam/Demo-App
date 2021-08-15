package com.example.demo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;
import android.os.Build;
import android.os.Bundle;
import android.widget.TableLayout;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private Toolbar t;
private TabLayout tl;
private ViewPager viewPager;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(Toolbar)findViewById(R.id.mytoolBar);
        tl=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.myViewPage);
        setSupportActionBar(t); setViewPage(viewPager);
        tl.setupWithViewPager(viewPager);
    }

    private void setViewPage(ViewPager viewPager){
        ViewPagerAdapter vp=new ViewPagerAdapter(getSupportFragmentManager());
        vp.addFrag(new BlankFragment(),"CHATS");
        vp.addFrag(new BlankFragment2(),"STATUS");
        vp.addFrag(new BlankFragment3(),"CALLS");
        viewPager.setAdapter(vp);

    }
}