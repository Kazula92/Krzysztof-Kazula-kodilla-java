package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name = "Triangle";
    private double baseLength;
    private double heightLength;

    public Triangle(String name, double baseLength, double heightLength) {
        this.name = name;
        this.baseLength = baseLength;
        this.heightLength = heightLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.baseLength, baseLength) != 0) return false;
        if (Double.compare(triangle.heightLength, heightLength) != 0) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(baseLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName(){
        return name;
    }

    @Override
    public double getField() {
        return Math.sqrt((baseLength * heightLength)/2);
    }

    @Override
    public String toString(){
        return name;
    }
}
