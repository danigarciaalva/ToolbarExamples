package io.dflabs.toolbar.activities;

import android.os.Bundle;
import android.view.Menu;

import io.dflabs.toolbar.R;

public class SimpleToolbarActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_simple_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
