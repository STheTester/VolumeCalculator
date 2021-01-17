package com.company;

public class Shape {
    private float length;
    private String volume;

    public Shape(float length) {
        this.length = length;
    }

    public Shape(){
        this.length = 0.00f;
    }

    public float getLength() {
        return length;
    }

    public void setVolume(){
        float operation = length;
        String strDouble = String.format("%.2f", operation);
        this.volume = strDouble;
    }

    public String getVolume(){
        setVolume();
        return volume;
    }

}
