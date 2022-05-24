/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantas;

/**
 *
 * @author 0
 */
public abstract class Terrestres extends Plantas {
    protected double num_ramas;
    
    public Terrestres(){
        setNumramas(0);
        
    }

    public abstract double getNumramas();
 
    public abstract void setNumramas(double num_ramas);
    
    
    @Override
    public String toString(){
        return super.toString()+ "con" +getNumramas()+" ramas";
    }
    
    
}
