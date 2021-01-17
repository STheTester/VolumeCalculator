package com.company;

public class Sphere extends Shape{
    private double pi = Math.PI;
    private String volume;
    private float radius = this.getLength();

    public Sphere(float length) {
        super(length);
    }

    @Override
    public void setVolume() {
        float operation = (float) ((4 * pi * Math.pow(radius, 3)) / 3);
        String strDouble = String.format("%.2f", operation);
        this.volume = strDouble;
    }

    @Override
    public String getVolume(){
        setVolume();
        return volume;
    }

}
