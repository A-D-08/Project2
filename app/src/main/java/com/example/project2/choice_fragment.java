package com.example.project2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class choice_fragment extends Fragment {

    private Button adopter_but;
    private Button shelter_but;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choice_fragment, container, false);

        adopter_but = (Button) view.findViewById(R.id.adopter_but);
        shelter_but = (Button) view.findViewById(R.id.shelter_but);



        adopter_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).setViewPager(2);
            }
        });

        shelter_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).setViewPager(5);
            }
        });



        return view;
    }
}

