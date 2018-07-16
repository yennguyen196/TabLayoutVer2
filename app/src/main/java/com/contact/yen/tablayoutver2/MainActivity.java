package com.contact.yen.tablayoutver2;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTtabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setupViewPager(mViewPager);
        setupTabIcons();
    }

    public void init() {
        mTtabLayout = findViewById(R.id.tabs);
        mViewPager = findViewById(R.id.viewpager);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentOne(),getString(R.string.one));
        adapter.addFragment(new FragmentTwo(), getString(R.string.two));
        adapter.addFragment(new FragmentThree(), getString(R.string.three));
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
        mTtabLayout.setupWithViewPager(viewPager);
    }

    private void setupTabIcons() {
        mTtabLayout.getTabAt(0).setIcon(R.drawable.ic_launcher_foreground);
        mTtabLayout.getTabAt(1).setIcon(R.drawable.ic_launcher_foreground);
        mTtabLayout.getTabAt(2).setIcon(R.drawable.ic_launcher_foreground);
    }
}
