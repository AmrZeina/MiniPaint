/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import javax.swing.text.Position;

/**
 *
 * @author amrze
 */
public class Circle extends Details {
    
    public Circle(int x,int y, double radius,Color color, Color fillcolor)
    {
        super(x,y);
        setColor(color);
        setFillColor(fillcolor);       
        Map<String, Double> properties = getProperties();
        properties.put("radius", (double) radius);
        setProperties(properties);   
    }

    @Override
    public void draw(Graphics canvas){
        int radius = getProperties().get("radius").intValue();
        Point position = getPosition();
        canvas.setColor(getColor());
        canvas.drawOval(position.x - radius, position.y - radius, radius * 2, radius * 2);
        
        }
    @Override
    public void colorize(Graphics canvas)
    {
        if (getFillColor() != null)
        {
           int radius = getProperties().get("radius").intValue();
        Point position = getPosition();
        canvas.setColor(getFillColor());
        canvas.fillOval(position.x - radius, position.y - radius, radius * 2, radius * 2); 
        }
        
    }
    @Override
    public String toString() 
    {
        String line=null;
        try{
             line="Circle"+","+getPosition().x+","+getPosition().y+","+
                getColor().getRed()+","+getColor().getGreen()+","+getColor().getBlue()+","  
                +getFillColor().getRed()+","+getFillColor().getGreen()+","+getFillColor().getBlue()+","
                +getProperties().get("radius").intValue()+"\n";
        
            
        }
        catch(NullPointerException e)
        {
           line="Circle"+","+getPosition().x+","+getPosition().y+","+
                getColor().getRed()+","+getColor().getGreen()+","+getColor().getBlue()+","+"255,255,255"+"," 
                +getProperties().get("radius").intValue()+"\n";

        }
        
        return line;
        
        
    }
    
}
