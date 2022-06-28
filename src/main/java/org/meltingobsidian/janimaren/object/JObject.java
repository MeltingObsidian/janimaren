package org.meltingobsidian.janimaren.object;

import java.util.ArrayList;

import org.meltingobsidian.janimaren.util.Point;
import org.meltingobsidian.janimaren.util.Style;

public abstract class JObject {
    ArrayList<Point> points;
    Point center;
    Style style;
    public JObject(Point center){
        this.center = center;
        points = new ArrayList<>();
    }
    public JObject(ArrayList<Point> points){
        this.points = points;
    }
    public JObject(JObject obj){
        this.points = obj.getPoints();
    }

    public ArrayList<Point> getPoints(){
        return points;
    }
    public Point getCenter(){
        return this.center;
    }
}
