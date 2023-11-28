package org.example;

public class Aqualung2021ProDivePressureSensorImpl extends PressureSensor{
    @Override
    public void doMeasurement() {
        double max = 10;
        double min = 0;
        double range = max - min;
        measurementValue = (Math.random() * range) + min;
    }
}
