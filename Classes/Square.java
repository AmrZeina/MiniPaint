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
public class Square extends Details {

    public Square(int x, int y, int height, int width , Color color, Color fillColor)
    {
        super(x, y);
        setColor(color);
        setFillColor(fillColor);
        Map<String, Double> properties = getProperties();
        properties.put("height", (double) height);
        properties.put("width", (double) width);
        setProperties(properties);
        
    }

    
    @Override
    public void draw(Graphics canvas) {
        int width = getProperties().get("width").intValue();
        int height = getProperties().get("height").intValue();
        Point position = getPosition();
        canvas.setColor(getColor());
        canvas.drawRect(position.x, position.y, width, height);
    }
    
    @Override
    public void colorize(Graphics canvas) {
        if (getFillColor() != null){
           int width = getProperties().get("width").intValue();
        int height = getProperties().get("height").intValue();
        Point position = getPosition();
        canvas.setColor(getFillColor());
       canvas.fillRect(position.x, position.y, width, height);
 
        }
        
    }
    @Override
    public String toString() 
    {
        String line=null;
        try{
             line="Square"+","+getPosition().x+","+getPosition().y+","
                +getColor().getRed()+","+getColor().getGreen()+","+getColor().getBlue()+","
                +getFillColor().getRed()+","+getFillColor().getGreen()+","+getFillColor().getBlue()+","
                +getProperties().get("width").intValue()+","+getProperties().get("height").intValue()+"\n";
        
            
        }
        catch(NullPointerException e)
        {
           line="Square"+","+getPosition().x+","+getPosition().y+","
                +getColor().getRed()+","+getColor().getGreen()+","+getColor().getBlue()+","+"255,255,255"+","
                +getProperties().get("width").intValue()+","+getProperties().get("height").intValue()+"\n";
        }
        
        return line;
        
        
    }
    
}
