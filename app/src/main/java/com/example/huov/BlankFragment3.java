package com.example.huov;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlankFragment3 extends Fragment {

    private Button exitBtn;

    public BlankFragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 1. Inflate layout first
        View view = inflater.inflate(R.layout.fragment_blank3, container, false);

        // 2. Find your button inside the layout
        exitBtn = view.findViewById(R.id.exit);

        // 3. Set click listener
        exitBtn.setOnClickListener(v -> {
            if (getActivity() != null) {
                getActivity().finish(); // This closes the activity (and app if it’s the main one)
            }
        });

        // 4. Return the inflated view
        return view;
    }
}