package com.example.michaelzhou.arpathfinder;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * Created by michaelzhou on 1/20/18.
 */

public class HelloArActivity extends FragmentActivity {
    private SensorManager mSensorManager;
    private Sensor mSensor1;
    private Sensor mSensor2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hello_ar_activity);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensor1 = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        AccelSensorEventListener sensorEventListener1 = new AccelSensorEventListener();

        mSensorManager.registerListener(sensorEventListener1, mSensor1, SensorManager.SENSOR_DELAY_FASTEST);

        mSensor2 = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        MagFieldSensorEventListener sensorEventListener2 = new MagFieldSensorEventListener();
        mSensorManager.registerListener(sensorEventListener2, mSensor2, SensorManager.SENSOR_DELAY_FASTEST);

        // Rotation matrix based on current readings from accelerometer and magnetometer.
        final float[] rotationMatrix = new float[9];
        mSensorManager.getRotationMatrix(rotationMatrix, null,
                sensorEventListener1.accelValues, sensorEventListener2.magValues);

// Express the updated rotation matrix as three orientation angles.
        final float[] orientationAngles = new float[3];
        mSensorManager.getOrientation(rotationMatrix, orientationAngles);


    }
}

