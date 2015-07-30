package io.dflabs.toolbar.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.dflabs.toolbar.R;

/**
 * Created by Daniel García Alvarado on 7/30/15.
 */
public class BasicFragment extends Fragment {

    @Bind(R.id.fr_basic_image) ImageView imageView;

    public static Fragment newInstance(int position) {
        BasicFragment fragment = new BasicFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_basic, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ButterKnife.bind(this, getView());
        switch (getArguments().getInt("position")){
            case 0:
                imageView.setImageResource(R.mipmap.m);
                break;
            case 1:
                imageView.setImageResource(R.mipmap.l);
                break;
            case 2:
                imageView.setImageResource(R.mipmap.k);
                break;
        }
    }
}
