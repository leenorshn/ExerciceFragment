package com.io.exercicefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Hp on 10-Mar-18.
 */

public class ContentFragment extends Fragment {
    public ContentFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
       View rootView=inflater.inflate(R.layout.main_fragment,container,false);
        Button btn=rootView.findViewById(R.id.fgmbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment fragment=new BlankFragment();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .add(R.id.detail_content_layout,fragment)
                        .commit();
            }
        });
        return rootView;
    }
}
