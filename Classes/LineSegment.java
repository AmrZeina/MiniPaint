/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
/**
 *
 * @author amrze
 */
public class LineSegment extends Details{

    

    public LineSegment(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1); 
        setColor(color);
        Map<String, Double> properties = getProperties();
        properties.put("x2", (double) x2);
        properties.put("y2", (double) y2);
        setProperties(properties);
         
    }

    @Override
    public void draw(Graphics canvas) {
        
        Point position = getPosition();
        canvas.setColor(getColor());
        canvas.drawLine(position.x, position.y,getProperties().get("x2").intValue() ,getProperties().get("y2").intValue() );
    }

    @Override
    public void colorize(Graphics canvas) {
    }

    
    
    @Override
    public String toString() throws NullPointerException
    {
        String line=null;
        try{
            line="LineSegmant"+","+getPosition().x+","+getPosition().y+","
                +getColor().getRed()+","+getColor().getGreen()+","+getColor().getBlue()+","
                +getFillColor().getRed()+","+getFillColor().getGreen()+","+getFillColor().getBlue()+","
                +getProperties().get("x2").intValue()+","+getProperties().get("y2").intValue()+"\n";
        
        }
        catch(NullPointerException e)
        {
            line="LineSegmant"+","+getPosition().x+","+getPosition().y+","
                +getColor().getRed()+","+getColor().getGreen()+","+getColor().getBlue()+","+"255,255,255"+","
                +getProperties().get("x2").intValue()+","+getProperties().get("y2").intValue()+"\n";
        
        }
        return line;
        
        
        
    }

}
