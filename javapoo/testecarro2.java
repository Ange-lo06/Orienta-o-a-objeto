/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo;

/**
 *
 * @author SENAI
 */
public class testecarro2 {

   
    public static void main(String[] args) {
        carro fusion = new carro();
                
        fusion.setModelo ("Fusion");
        fusion.setAno(2015);
        fusion.setMarca("Ford");
        fusion.setPotencia(240);
        fusion.setPeso(1.689);
        
        
        System.out.println("Modelo: " + fusion.getModelo() + " titanium");
        System.out.println("Ano : " + fusion.getAno());
        System.out.println("Marca: " + fusion.getMarca());
        System.out.println("Potencia :" + fusion.getPotencia() + " CP");
        System.out.println("Peso :" + fusion.getPeso() + " KG");
    }
    
}
