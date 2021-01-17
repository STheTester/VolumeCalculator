package com.company;

public class Cube extends Shape{
    private String volume;
    private float side = this.getLength();

    public Cube(float length) {
        super(length);
    }

    @Override
    public void setVolume() {
        float operation = (float)Math.pow(side, 3);
        String strDouble = String.format("%.2f", operation);
        this.volume = strDouble;
    }

    @Override
    public String getVolume(){
        setVolume();
        return volume;
    }
}
