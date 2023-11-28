package org.example;

public abstract class PressureSensor extends Sensor{
    private String unit;
    protected double measurementValue;
    @Override
    public double getValue(){
        return measurementValue;
    }
    @Override
    public String getUnit(){
        return unit;
    }
}
y