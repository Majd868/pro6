package com.example.huov;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;



public class BlankFragment2 extends Fragment  {
     Button loginBtn1;
     EditText usernameEt, passwordEt;





    public BlankFragment2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank2, container, false);

        // Link XML views
        usernameEt = view.findViewById(R.id.username);
        passwordEt = view.findViewById(R.id.pass);
        loginBtn1 = view.findViewById(R.id.login1);

        // Button listener
        loginBtn1.setOnClickListener(v -> {
            String username = usernameEt.getText().toString().trim();
            String password = passwordEt.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(getActivity(), "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else if (username.equals("admin") && password.equals("1234")) {
                Toast.makeText(getActivity(), "Login Successful!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity(), "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}