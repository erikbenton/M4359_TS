package com.example.m4359touchscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TemperatureReadingFragment extends Fragment {
    private static final String TAG = "TemperatureReadingFragment";

    private TextView mTopTempLabel;
    private TextView mMidTempLabel;
    private TextView mBotTempLabel;

    private EditText mTopTempReading;
    private EditText mMidTempReading;
    private EditText mBotTempReading;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.temps_readings_fragment, container, false);


        mTopTempLabel = (TextView) view.findViewById(R.id.topTemperatureLabel);
        mMidTempLabel = (TextView) view.findViewById(R.id.middleTemperatureLabel);
        mBotTempLabel = (TextView) view.findViewById(R.id.bottomTemperatureLabel);

        mTopTempReading = (EditText) view.findViewById(R.id.topTemperatureReading);
        mMidTempReading = (EditText) view.findViewById(R.id.middleTemperatureReading);
        mBotTempReading = (EditText) view.findViewById(R.id.bottomTemperatureReading);

        return view;
    }

}
