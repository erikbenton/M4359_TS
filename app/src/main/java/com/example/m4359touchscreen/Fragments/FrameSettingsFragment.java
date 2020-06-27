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

public class FrameSettingsFragment extends Fragment {
    private static final String TAG = "TemperatureReadingFragment";

    private TextView mFrameIdLabel;
    private TextView mFrameModelLabel;
    private TextView mFrameSerialLabel;
    private TextView mFrameLocationLabel;

    private EditText mFrameIdEntry;
    private EditText mFrameModelEntry;
    private EditText mFrameSerialEntry;
    private EditText mFrameLocationEntry;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_settings_fragment, container, false);


        mFrameIdLabel = (TextView) view.findViewById(R.id.frameIdLabel);
        mFrameModelLabel = (TextView) view.findViewById(R.id.frameModelLabel);
        mFrameSerialLabel = (TextView) view.findViewById(R.id.frameSerialLabel);
        mFrameLocationLabel = (TextView) view.findViewById(R.id.frameLocationLabel);

        mFrameIdEntry = (EditText) view.findViewById(R.id.frameIdEntry);
        mFrameModelEntry = (EditText) view.findViewById(R.id.frameModelEntry);
        mFrameSerialEntry = (EditText) view.findViewById(R.id.frameSerialEntry);
        mFrameLocationEntry = (EditText) view.findViewById(R.id.frameLocationEntry);

        return view;
    }

}
