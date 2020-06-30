package com.example.m4359touchscreen.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.m4359touchscreen.R;

public class ControlsFragment extends Fragment {
    private static final String TAG = "ParametersConfigFragment";

    private Button mJogUpButton;
    private Button mJogDownButton;

    private EditText mJogMotorSpeed;

    private Button mStartFurnButton;
    private Button mStopFurnButton;

    private Button mStartTestButton;
    private Button mPauseTestButton;
    private Button mStopTestButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.controls_fragment, container, false);

//        mJogUpButton = (Button) view.findViewById(R.id.jogUpButton);
//        mJogDownButton = (Button) view.findViewById(R.id.jogDownButton);
//
//        mJogMotorSpeed = (EditText) view.findViewById(R.id.jogMotorSpeed);
//
//        mStartFurnButton = (Button) view.findViewById(R.id.startFurnaceButton);
//        mStopFurnButton = (Button) view.findViewById(R.id.stopFurnaceButton);
//
//        mStartTestButton = (Button) view.findViewById(R.id.startTestButton);
//        mPauseTestButton = (Button) view.findViewById(R.id.pauseTestButton);
//        mStopTestButton = (Button) view.findViewById(R.id.stopTestButton);

        return view;
    }
}
