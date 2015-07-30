package io.dflabs.toolbar.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.dflabs.toolbar.R;

/**
 * Created by Daniel García Alvarado on 7/30/15.
 */
public class BaseActivity extends AppCompatActivity{

    @Bind(R.id.toolbar)Toolbar toolbar;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

}
