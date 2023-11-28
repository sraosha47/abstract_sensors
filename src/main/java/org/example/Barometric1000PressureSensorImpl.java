package org.example;

public class Barometric1000PressureSensorImpl extends PressureSensor{
    @Override
    public void doMeasurement() {
        double max = 1.05;
        double min = 0.5;
        double range = max - min;
        measurementValue = (Math.random() * range) + min;
    }
}
