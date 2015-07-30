package io.dflabs.toolbar.activities;

import android.os.Bundle;

import io.dflabs.toolbar.R;

public class ExtendedToolbarActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extended_toolbar);
        setTitle(R.string.app_name);
        getSupportActionBar().setSubtitle(R.string.subtitle);
        getToolbar().setNavigationIcon(R.mipmap.ic_menu_white);
    }
}
