package org.example;

abstract class Sensor {
    private String name;
    public abstract String getUnit();
    public abstract double getValue();
    public String getName(){
        return name;
    }
    public abstract void doMeasurement();
}
