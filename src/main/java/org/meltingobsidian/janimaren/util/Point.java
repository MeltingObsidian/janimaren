package org.meltingobsidian.janimaren.util;

public class Point {
    public double x, y;

    public Point(){
        this.x = this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point add(Point p){
        return new Point(this.x+p.x, this.y+p.y);
    }
    public Point sub(Point p){
        return new Point(this.x-p.x, this.y-p.y);
    }
    public Point mul(Point p){
        return new Point(this.x*p.x, this.y*p.y);
    }
    public Point div(Point p){
        return new Point(this.x/p.x, this.y/p.y);
    }

    public Point add(double x, double y){
        return this.add(new Point(x, y));
    }
    public Point sub(double x, double y){
        return this.sub(new Point(x, y));
    }
    public Point mul(double x, double y){
        return this.mul(new Point(x, y));
    }
    public Point div(double x, double y){
        return this.div(new Point(x, y));
    }

    public double[] components(){
        return new double[]{x, y};
    }
}
