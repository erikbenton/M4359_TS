package com.example.m4359touchscreen.Connections;

import android.content.Context;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;

import com.hoho.android.usbserial.driver.UsbSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialPort;
import com.hoho.android.usbserial.driver.UsbSerialProber;

import java.io.IOException;
import java.util.List;

public class UsbConnection {

    private int mBaudRate;
    private int mDataBits;
    private int mStopBits;
    private int mParity;
    private Context mContext;
    private UsbSerialPort mPort;

    public UsbConnection(Context context) {
        this.mContext = context;
        this.mBaudRate = 115200;
        this.mDataBits = 8;
        this.mStopBits = UsbSerialPort.STOPBITS_1;
        this.mParity = UsbSerialPort.PARITY_NONE;

        UsbManager manager = (UsbManager) mContext.getSystemService(Context.USB_SERVICE);
        List<UsbSerialDriver> availableDrivers = UsbSerialProber.getDefaultProber().findAllDrivers(manager);

        if(availableDrivers.isEmpty()) {
            // No available drivers...
            return;
        }

        UsbSerialDriver driver = availableDrivers.get(0);
        UsbDeviceConnection connection = manager.openDevice(driver.getDevice());

        if(connection == null) {
            // Unable to connect...
            return;
        }

        mPort = driver.getPorts().get(0);

        try {
            mPort.open(connection);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try {
            mPort.setParameters(this.mBaudRate, this.mDataBits, this.mStopBits, this.mParity);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }
}
