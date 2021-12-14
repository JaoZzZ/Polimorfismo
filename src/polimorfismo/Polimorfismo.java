/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.text.DecimalFormat;

/**
 *
 * @author IFSC
 */
public class Polimorfismo {

public static void main(String[] args){
    Gato gato = new Gato();
    gato.comunicar();
    
    Cachorro dog = new Cachorro();
    dog.comunicar();
    
    Pato pato = new Pato();
    pato.comunicar();
    
   }

}
