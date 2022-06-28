package org.meltingobsidian.janimaren.object;

import org.meltingobsidian.janimaren.util.Point;

public class Rectangle extends JObject {
    double width, height;

    public Rectangle(Point corner, double width, double height){
        super(corner.sub(-width/2, height/2));
        this.width = width;
        this.height = height;
        points.add(corner);
        points.add(corner.add(width, 0));
        points.add(corner.add(width, -height));
        points.add(corner.sub(0, -height));
    }
    public Rectangle(double width, double height, Point center){
        super(center);
        this.width = width;
        this.height = height;
        points.add(center.add(-width/2, height/2));
        points.add(center.add(width/2, height/2));
        points.add(center.add(width/2, -height/2));
        points.add(center.add(-width/2, -height/2));
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
}
