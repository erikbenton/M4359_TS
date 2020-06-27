package com.example.m4359touchscreen.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.m4359touchscreen.R;

public class TimerReadingsFragment extends Fragment {
    private static final String TAG = "TimerReadingFragment";

    private TextView mDelayTimerLabel;
    private TextView mRemainingTimerLabel;
    private TextView mStepTimerLabel;
    private TextView mTotalTimerLabel;

    private EditText mDelayTimerReading;
    private EditText mRemainingTimerReading;
    private EditText mStepTimerReading;
    private EditText mTotalTimerReading;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.timers_readings_fragment, container, false);


        mDelayTimerLabel = (TextView) view.findViewById(R.id.delayTimerLabel);
        mRemainingTimerLabel = (TextView) view.findViewById(R.id.remainingTimerLabel);
        mStepTimerLabel = (TextView) view.findViewById(R.id.stepTimerLabel);
        mTotalTimerLabel = (TextView) view.findViewById(R.id.totalTimerLabel);

        mDelayTimerReading = (EditText) view.findViewById(R.id.delayTimerReading);
        mRemainingTimerReading = (EditText) view.findViewById(R.id.remainingTimerReading);
        mStepTimerReading = (EditText) view.findViewById(R.id.stepTimerReading);
        mTotalTimerReading = (EditText) view.findViewById(R.id.totalTimerReading);

        return view;
    }
}
