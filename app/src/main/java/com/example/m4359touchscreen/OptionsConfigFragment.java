package com.example.m4359touchscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OptionsConfigFragment extends Fragment {
    private static final String TAG = "OptionsConfigFragment";

    private Button mSystemSetupButton;
    private Button mTestProfileButton;
    private Button mEditAllSpoolButton;
    private Button mStepLoadButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.options_config_fragment, container, false);

        mSystemSetupButton = (Button) view.findViewById(R.id.systemSetupButton);
        mTestProfileButton = (Button) view.findViewById(R.id.testProfileButton);
        mEditAllSpoolButton = (Button) view.findViewById(R.id.editAllSpoolsButton);
        mStepLoadButton = (Button) view.findViewById(R.id.stepLoadProfileButton);

        return view;
    }
}
