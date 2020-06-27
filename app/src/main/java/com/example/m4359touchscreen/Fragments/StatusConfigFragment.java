package com.example.m4359touchscreen.Fragments;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.m4359touchscreen.R;

public class StatusConfigFragment extends Fragment {
    private static final String TAG = "StatusConfigFragment";

    private Switch mConnectedSwitch;
    private Switch mAdminSwitch;

    private RadioButton mCommsLed;
    private RadioButton mTestRunningLed;

    private EditText mFrameIdField;
    private EditText mStatusField;
    private EditText mFirmwareVersionField;

    private TextView mFrameIdLabel;
    private TextView mStatusLabel;
    private TextView mFirmwareVersionLabel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.status_config_fragment, container, false);

        mConnectedSwitch = (Switch) view.findViewById(R.id.connectedSwitch);
        mAdminSwitch = (Switch) view.findViewById(R.id.adminSwitch);

        mCommsLed = (RadioButton) view.findViewById(R.id.communicationsLed);
        mTestRunningLed = (RadioButton) view.findViewById(R.id.testRunningLed);

        mFrameIdLabel = (TextView) view.findViewById(R.id.frameIdConfigLabel);
        mStatusLabel = (TextView) view.findViewById(R.id.frameStatusLabel);
        mFirmwareVersionLabel = (TextView) view.findViewById(R.id.firmwareVersionLabel);

        mFrameIdField = (EditText) view.findViewById(R.id.frameIdField);
        mStatusField = (EditText) view.findViewById(R.id.frameStatusField);
        mFirmwareVersionField = (EditText) view.findViewById(R.id.firmwareVersionField);

        return view;
    }
}
