package io.dflabs.toolbar.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import butterknife.ButterKnife;
import io.dflabs.toolbar.R;
import io.dflabs.toolbar.adapters.TabsAdapter;

public class TabsToolbarActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_toolbar);
        ButterKnife.bind(this);

        ViewPager pager = (ViewPager)findViewById(R.id.act_tabs_pager);
        pager.setAdapter(new TabsAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.act_tabs_tabs);
        tabLayout.addTab(tabLayout.newTab().setText("M"));
        tabLayout.addTab(tabLayout.newTab().setText("Lollipop"));
        tabLayout.addTab(tabLayout.newTab().setText("Kit Kat"));
        tabLayout.setupWithViewPager(pager);
    }
}
