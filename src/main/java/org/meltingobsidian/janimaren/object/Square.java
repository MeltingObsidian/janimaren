package org.meltingobsidian.janimaren.object;

import java.util.ArrayList;

import org.meltingobsidian.janimaren.util.Point;

public class Square extends JObject {
    public double side;
    public Square(double side, Point center){
        super(center);
        this.side = side;
        this.center = center;
        points = new ArrayList<>();
        points.add(new Point(center.x-side/2, center.y+side/2));
        points.add(new Point(center.x+side/2, center.y+side/2));
        points.add(new Point(center.x+side/2, center.y-side/2));
        points.add(new Point(center.x-side/2, center.y-side/2));
    }
    
    public double getSide(){
        return side;
    }
}
