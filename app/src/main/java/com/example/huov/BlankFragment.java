package com.example.huov;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class BlankFragment extends Fragment {

    EditText username,password;
    Button loginBtn;

    public BlankFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank2, container, false);

        username = view.findViewById(R.id.username);
        password = view.findViewById(R.id.pass);
        loginBtn = view.findViewById(R.id.login1);

        loginBtn.setOnClickListener(v -> {
            String user = username.getText().toString();
            String pass = password.getText().toString();
            if (user.equals("admin") && pass.equals("123")) {
                Toast.makeText(getActivity(), "Login Successful", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
