/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementos;

/**
 *
 * @author 0
 */

public final class Ubicacion {
    private double cant_polen;
    private Suelo tipo_suelo;
    
    public Ubicacion (double cant_polen, Suelo tipo_suelo){
        this.setCantpolen(cant_polen);
        this.setTiposuelo(tipo_suelo);
        
    }

    

    public Suelo getTiposuelo() {
        return tipo_suelo;
    }

    public void setTiposuelo(Suelo tipo_suelo) {
        this.tipo_suelo = tipo_suelo;
    }
/*
    public int getNumramas() {
        return num_ramas;
    }

    public void setNumramas(int num_ramas) {
        if (num_ramas > 0)
            this.num_ramas= num_ramas;
        else
            this.num_ramas=2;
            
    }
*/

    public double getCantpolen() {
        return cant_polen;
    }

    public void setCantpolen(double cant_polen) {
        if (cant_polen > 0)
            this.cant_polen= cant_polen;
        else if (cant_polen < 10)
            this.cant_polen=9;
    }


    @Override
    public String toString(){ 
            return "tengo "+ cant_polen +" gramos de polen " 
                    + "Estoy plantado en "+ tipo_suelo.name().toLowerCase();
    }
    

}  
    
    
    
    
    
    


        


