/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author amrze
 */
public interface DrawingEngine {
    
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    
    public Shape[] getShapes();
    
    public void refresh(java.awt.Graphics canvas);
    
    
   
    
}
