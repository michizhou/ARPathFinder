package com.example.michaelzhou.arpathfinder;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class AccelSensorEventListener implements SensorEventListener {
    public float[] accelValues;

    public AccelSensorEventListener () {
        accelValues = new float[3];
    }

    @Override
    public void onAccuracyChanged (Sensor sensor, int k) {

    }

    @Override
    public void onSensorChanged (SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            accelValues = sensorEvent.values;
        }
    }
}
