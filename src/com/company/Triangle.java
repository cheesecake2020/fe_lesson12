package com.company;

public class Triangle {
    int height;
    int bottom;
    public void setHight(int num) {
        height = num;
    }
    public void setBottom(int num) {
        bottom = num;
    }
    public double getArea() {
        return bottom * height /2;
    }

}
