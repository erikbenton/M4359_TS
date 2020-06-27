package com.example.m4359touchscreen.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.m4359touchscreen.R;

public class LoadReadingsFragment extends Fragment {
    private static final String TAG = "LoadReadingsFragment";

    private TextView mTrackLoadLabel;
    private TextView mPeakLoadLabel;
    private TextView mValleyLoadLabel;

    private Button mTareTrackButton;
    private Button mTarePeakButton;
    private Button mTareValleyButton;

    private EditText mTrackLoadReading;
    private EditText mPeakLoadReading;
    private EditText mValleyLoadReading;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.load_readings_fragment, container, false);

        mTareTrackButton = (Button) view.findViewById(R.id.tareTrackButton);
        mTarePeakButton = (Button) view.findViewById(R.id.tarePeakButton);
        mTareValleyButton = (Button) view.findViewById(R.id.tareValleyButton);

        mTrackLoadLabel = (TextView) view.findViewById(R.id.trackLoadLabel);
        mPeakLoadLabel = (TextView) view.findViewById(R.id.peakLoadLabel);
        mValleyLoadLabel = (TextView) view.findViewById(R.id.valleyLoadLabel);

        mTrackLoadReading = (EditText) view.findViewById(R.id.trackLoadReading);
        mPeakLoadReading = (EditText) view.findViewById(R.id.peakLoadReading);
        mValleyLoadReading = (EditText) view.findViewById(R.id.valleyLoadReading);

        mTareTrackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTrackLoadReading.setText("Tared");
            }
        });

        return view;
    }
}
