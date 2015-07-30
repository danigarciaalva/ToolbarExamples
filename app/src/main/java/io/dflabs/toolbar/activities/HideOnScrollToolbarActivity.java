package io.dflabs.toolbar.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.dflabs.toolbar.R;
import io.dflabs.toolbar.adapters.ToolbarListAdapter;
import io.dflabs.toolbar.interfaces.RecyclerClickItemListener;

public class HideOnScrollToolbarActivity extends BaseActivity implements RecyclerClickItemListener {

    @Bind(R.id.act_hide_recycler) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_toolbar);

        ButterKnife.bind(this);
        setTitle(R.string.app_name);

        mRecyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<String> items = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            items.add("Item "+(++i));
        }

        String[] itemStrings = new String[items.size()];
        itemStrings = items.toArray(itemStrings);
        ToolbarListAdapter mAdapter = new ToolbarListAdapter(itemStrings, this);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void onItemClick(int position) {

    }
}
