package org.example;

abstract class Sensor {
    public abstract String getUnit();
    public abstract double getValue();
    public abstract String getName();
    public abstract void doMeasurement();
}