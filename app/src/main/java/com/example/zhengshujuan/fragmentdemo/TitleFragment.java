package com.example.zhengshujuan.fragmentdemo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class TitleFragment extends Fragment {
private ImageButton mLeftMenu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_title_fragment,container,false);
        mLeftMenu= (ImageButton) view.findViewById(R.id.ib_title);
        mLeftMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "I am an ImageButton in TitleFragment", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
