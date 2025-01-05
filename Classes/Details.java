/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author amrze
 */
public abstract class Details implements Shape {
    private Map<String ,Double> properties=new HashMap<>();
    private Point position;
    private Color color;
    private Color fillColor;
    
    
    public Details(int x,int y)
    {
        this.position=new Point(x,y);
    }
    @Override
    public void setPosition(Point position)
    {
        this.position=position;
    }
    @Override
    public Point getPosition()
    {
        return position;
                
    }
    @Override
    public void setProperties(Map<String, Double> properties)
    {
        this.properties=properties;               
    }
    @Override
    public Map<String, Double> getProperties()
    {
        return properties;
    }
    @Override
    public void setColor(Color color)
    {
        this.color = color;
    }

    @Override
    public Color getColor()
    {
        return color;
    }

    @Override
    public void setFillColor(Color fillColor)
    {
        this.fillColor = fillColor;
    }

    @Override
    public Color getFillColor()
    {
        return fillColor;
    }
    
    @Override
    public abstract void draw(Graphics canvas);
    
    @Override
    public abstract void colorize(Graphics canvas);

    
    

    
}
