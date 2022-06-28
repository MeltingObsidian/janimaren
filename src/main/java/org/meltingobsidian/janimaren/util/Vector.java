package org.meltingobsidian.janimaren.util;

public class Vector extends Point {
    public Vector(){
        this.x = this.y = 0;
    }
    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double dot(Vector v){
        return this.x*v.x+this.y*v.y;
    }
    public double magnitude(){
        return Math.sqrt(x*x+y*y);
    }
    public double length(){
        return magnitude();
    }
    public Vector normalize(){
        double m = magnitude();
        return new Vector(x/m, y/m);
    }
}
