package com.android_note.design_pattern.factory_pattern.simple_factory;

import android.util.Log;
public class FerrariCar implements Car {

    @Override
    public void createCar() {
        Log.i("Factory","造一辆法拉利");
    }
}
