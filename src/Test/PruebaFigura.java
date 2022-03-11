/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import FIgura.Figura;
import TipoFigura.Rectangulo;

/**
 *
 * @author labso06
 */
public class PruebaFigura extends Rectangulo {
    
    public String Rectangulo(){
    return getColor();
}
    
    public static void main(String[] args) {
       Figura f= new Rectangulo();
        System.out.println("el color es "+f.getColor());
    }
    
    
}
