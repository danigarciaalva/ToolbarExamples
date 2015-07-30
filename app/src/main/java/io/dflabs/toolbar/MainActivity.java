package io.dflabs.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.dflabs.toolbar.activities.BaseActivity;
import io.dflabs.toolbar.activities.ExtendedToolbarActivity;
import io.dflabs.toolbar.activities.FloatingActionExtendedToolbarActivity;
import io.dflabs.toolbar.activities.FloatingActionToolbarActivity;
import io.dflabs.toolbar.activities.HideOnScrollToolbarActivity;
import io.dflabs.toolbar.activities.MinimizeOnScrollToolbarActivity;
import io.dflabs.toolbar.activities.ParallaxOnScrollToolbarActivity;
import io.dflabs.toolbar.activities.SimpleToolbarActivity;
import io.dflabs.toolbar.activities.SpinnerToolbarActivity;
import io.dflabs.toolbar.activities.TabsToolbarActivity;
import io.dflabs.toolbar.adapters.ToolbarListAdapter;
import io.dflabs.toolbar.interfaces.RecyclerClickItemListener;

public class MainActivity extends BaseActivity implements RecyclerClickItemListener {

    @Bind(R.id.act_main_recycler) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setTitle(R.string.app_name);

        mRecyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ToolbarListAdapter mAdapter = new ToolbarListAdapter(getResources().getStringArray(R.array.toolbars), this);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(int position) {
        switch (position){
            case 0: startActivity(new Intent(this, SimpleToolbarActivity.class));
                break;
            case 1: startActivity(new Intent(this, ExtendedToolbarActivity.class));
                break;
            case 2: startActivity(new Intent(this, FloatingActionExtendedToolbarActivity.class));
                break;
            case 3: startActivity(new Intent(this, HideOnScrollToolbarActivity.class));
                break;
            case 4: startActivity(new Intent(this, MinimizeOnScrollToolbarActivity.class));
                break;
            case 5: startActivity(new Intent(this, ParallaxOnScrollToolbarActivity.class));
                break;
            case 6: startActivity(new Intent(this, TabsToolbarActivity.class));
                break;
        }
    }
}
