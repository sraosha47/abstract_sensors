package org.example;

public class Aqualung2021ProDivePressureSensorImpl extends PressureSensor{
    private double measurementValue;
    private String name;
    private String unit;

    public void setName(String newName){
        this.name=newName;
    }

    public void setUnit(String newUnit){
        this.unit=newUnit;
    }

    @Override
    public double getValue() {
        return measurementValue;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public void doMeasurement() {
        double max = 10;
        double min = 0;
        double range = max - min;
        this.measurementValue = (Math.random() * range) + min;
    }

}
