/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantas;

import Implementos.Suelo;
import Implementos.Ubicacion;

/**
 *
 * @author 0
 */
public abstract class Plantas {
    protected double altura;
    protected Ubicacion ubicacion;
    
    public Plantas() {
        this.altura= 10;
        this.ubicacion = new Ubicacion(0, Suelo.TIERRA);
    }
    public Plantas (double altura){
        this.altura=  altura;
        this.ubicacion = new Ubicacion (0,Suelo.TIERRA);
        
    }
    public Plantas (double altura, Ubicacion ubicacion){
        this.altura= altura;
        this.ubicacion = ubicacion;  
    }
    
   public Plantas(double altura, double polen, Ubicacion ubicacion){
       this.altura= altura;
       this.ubicacion= new Ubicacion(0, Suelo.TIERRA);
       //this.ubicacion= new Ubicacion(ramas, altura, ubicacion );

   }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <10)
            this.altura = 10;
        else if (altura >= 30 )
                this.altura=30;
            
    }
    @Override
    public String toString(){
        return "Soy una " +this.getClass()+
                ".\n" + ubicacion + 
                ".\n" + "mi altura es " + altura;
    }
    

   
}
