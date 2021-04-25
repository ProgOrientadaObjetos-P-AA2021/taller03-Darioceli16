/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import horas.Horas;

/**
 *
 * @author Smart
 */
public class ejecutor {
        public static void main(String[] args) {
        Horas h = new Horas();
        
        h.establecerHora(15);
        h.establecerDia();
        h.establecerMin();
        h.establecerSeg();
        
        Horas o = new Horas();
        
        o.establecerHora(35);
        o.establecerDia();
        o.establecerMin();
        o.establecerSeg();
        
        System.out.print("\n DETALLES EJEMPLO 1 \nDias"+ h.obtenerDia()
                + "\nHoras: " + h.obtenerHora() + "\nMinutos: " + h.obtenerHora()
                + "\nSegundos: " + h.obtenerSeg());
        
        System.out.println(" ");
        
        System.out.print("\n DETALLES EJEMPLO 2 \nDias"+ o.obtenerDia()
                + "\nHoras: " + o.obtenerHora() + "\nMinutos: " + o.obtenerHora()
                + "\nSegundos: " + o.obtenerSeg());
    }

}
