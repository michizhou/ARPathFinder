package com.example.michaelzhou.arpathfinder;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class MagFieldSensorEventListener implements SensorEventListener {
    public float[] magValues;

    public MagFieldSensorEventListener () {
        magValues = new float[3];
    }

    @Override
    public void onAccuracyChanged (Sensor sensor, int k) {

    }

    @Override
    public void onSensorChanged (SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
            magValues = sensorEvent.values;
       }
    }
}
