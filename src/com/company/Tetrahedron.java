package com.company;

public class Tetrahedron extends Shape {
    private String volume;
    private float edge = this.getLength();

    public Tetrahedron(float length) {
        super(length);
    }

    @Override
    public void setVolume() {
        float operation = (float)(Math.pow(edge, 3) * Math.sqrt(2)) /12;
        String strDouble = String.format("%.2f", operation);
        this.volume = strDouble;
    }

    @Override
    public String getVolume(){
        setVolume();
        return volume;
    }
}

