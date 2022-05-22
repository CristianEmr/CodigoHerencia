/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoherencia;

/**
 *
 * @author 0
 */
public class Plantas {
    int hojas;
    int altura;
    int raices;
    
    public Plantas (int hojas,int altura,int raices){
        this.hojas= hojas;
        this.altura = altura;
        this.raices= raices;
     
    }


    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura < 1)
            this.altura = 1;
        else
            this.altura = altura;    }

    public int getRaices() {
        return raices;
    }

    public void setRaices(int raices) {
        if(raices < 1)
            this.raices = 5;
        else
            this.raices = raices;
    }
    @Override
    public String toString(){
        return "Soy una " + this.getClass() + 
                ".\n tengo" + hojas + "hojas"+
                "\n mido " + altura + "metros" + "\n tengo " + raices + "raices";
    }
}
