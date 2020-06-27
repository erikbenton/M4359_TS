package com.example.m4359touchscreen.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.m4359touchscreen.R;

public class ParametersConfigFragment extends Fragment {
    private static final String TAG = "ParametersConfigFragment";

    private Switch mTopSpoolSwitch;
    private Switch mMidSpoolSwitch;
    private Switch mBotSpoolSwitch;

    private Button mTopSpoolButton;
    private Button mMidSpoolButton;
    private Button mBotSpoolButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.params_config_fragment, container, false);

        mTopSpoolSwitch = (Switch) view.findViewById(R.id.topSpoolSwitch);
        mMidSpoolSwitch = (Switch) view.findViewById(R.id.midSpoolSwitch);
        mBotSpoolSwitch = (Switch) view.findViewById(R.id.botSpoolSwitch);

        mTopSpoolButton = (Button) view.findViewById(R.id.topSpoolEditButton);
        mMidSpoolButton = (Button) view.findViewById(R.id.midSpoolEditButton);
        mBotSpoolButton = (Button) view.findViewById(R.id.botSpoolEditButton);

        return view;
    }
}
