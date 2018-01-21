package com.example.michaelzhou.arpathfinder;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.hardware.Sensor;
import android.content.Context;

/**
 * Created by michaelzhou on 1/20/18.
 */

public class HelloArActivity extends FragmentActivity implements SensorEventListener {
    private SensorManager mSensorManager;
    private Sensor mSensor1;
    private Sensor mSensor2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hello_ar_activity);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensor1 = mSensorManager.getDefaultSensor(Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR);
        mSensor2 = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        mSensor1.

        // Rotation matrix based on current readings from accelerometer and magnetometer.
        final float[] rotationMatrix = new float[9];
        mSensorManager.getRotationMatrix(rotationMatrix, null,
                mSensor2, mSensor1);

// Express the updated rotation matrix as three orientation angles.
        final float[] orientationAngles = new float[3];
        mSensorManager.getOrientation(rotationMatrix, orientationAngles);


    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}

