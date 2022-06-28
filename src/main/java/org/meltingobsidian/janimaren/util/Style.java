package org.meltingobsidian.janimaren.util;

import java.awt.Color;

public class Style {
    Color fillColor, strokeColor;
    double fillOpacity, strokeOpacity;
    public Style(){
        fillColor = Colors.SECONDARY;
        strokeColor = Colors.SECONDARY;
    }
    public Style(Color fillColor, double fillOpacity, Color strokeColor, double strokeOpacity){
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.fillOpacity = fillOpacity;
        this.strokeOpacity = strokeOpacity;
    }
    public Color getFill(){
        return fillColor;
    }
    public Color getStroke(){
        return strokeColor;
    }
    public void setFill(Color fillColor){
        this.fillColor = fillColor;
    }
    public void setStroke(Color strokeColor){
        this.strokeColor = strokeColor;
    }
    public void setFill(Color fillColor, double fillOpacity){
        this.fillColor = fillColor;
        this.fillOpacity = fillOpacity;
    }
    public void setStroke(Color strokeColor, double strokeOpacity){
        this.strokeColor = strokeColor;
        this.strokeOpacity = strokeOpacity;
    }
}
