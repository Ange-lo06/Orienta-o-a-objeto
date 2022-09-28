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
public class testecarro {

    public static void main(String[] args) {
        carro uno = new carro();
        
        uno.setModelo ("Uno");
        uno.setAno(2005);
        uno.setMarca("Fiat");
        uno.setPotencia (75.0);
        uno.setPeso (895.0);
        
        System.out.println("Modelo: " + uno.getModelo());
        System.out.println("Ano : " + uno.getAno());
        System.out.println("Marca: " + uno.getMarca());
        System.out.println("Potencia :" + uno.getPotencia() + " CP");
        System.out.println("Peso :" + uno.getPeso() + " KG");
    }
   
}