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
public class testecarro3 {     
     
    public static void main(String[] args) {
        carro gol = new carro();
        
        gol.setModelo("Gol");
        gol.setAno(2015);
        gol.setMarca("Volkswagen");
        gol.setPotencia(76);
        gol.setPeso(978);
        
        System.out.println("Modelo: " + gol.getModelo() + " G3");
        System.out.println("Ano : " + gol.getAno());
        System.out.println("Marca: " + gol.getMarca());
        System.out.println("Potencia :" + gol.getPotencia() + " CP");
        System.out.println("Peso :" + gol.getPeso() + " KG");
        
        
    }
    
}
