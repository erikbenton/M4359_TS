package com.example.m4359touchscreen;

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

public class ExtensometerReadingsFragment extends Fragment {
    private static final String TAG = "ExtensometerReadingFragment";

    private TextView mLeftExtensLabel;
    private TextView mRightExtensLabel;
    private TextView mPercentStrainLabel;

    private Button mTareRightButton;
    private Button mTareLeftButton;

    private EditText mRightExtensReading;
    private EditText mLeftExtensReading;
    private EditText mPercentStrainReading;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.extens_readings_fragment, container, false);

        mTareRightButton = (Button) view.findViewById(R.id.tareRightButton);
        mTareLeftButton = (Button) view.findViewById(R.id.tareLeftButton);

        mLeftExtensLabel = (TextView) view.findViewById(R.id.leftExtensometerLabel);
        mRightExtensLabel = (TextView) view.findViewById(R.id.rightExtensometerLabel);
        mPercentStrainLabel = (TextView) view.findViewById(R.id.percentStrainLabel);

        mRightExtensReading = (EditText) view.findViewById(R.id.rightExtensometerReading);
        mLeftExtensReading = (EditText) view.findViewById(R.id.leftExtensometerReading);
        mPercentStrainReading = (EditText) view.findViewById(R.id.percentStrainReading);

        mTareRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRightExtensReading.setText("10001");
            }
        });

        return view;
    }
}
