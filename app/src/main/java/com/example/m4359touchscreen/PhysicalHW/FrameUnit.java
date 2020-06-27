package com.example.m4359touchscreen.PhysicalHW;

import com.example.m4359touchscreen.Connections.UsbConnection;

import java.util.ArrayList;

public class FrameUnit extends Sensor {
    private String mLocation;
    private boolean mConnected;
    private String mStatus;

    private ArrayList<TemperatureSensor> mTempSensors;
    private ArrayList<Extensometer> mExtensos;
    private LoadCellSensor mLoadCell;

    private UsbConnection mUsbConnection;



}
