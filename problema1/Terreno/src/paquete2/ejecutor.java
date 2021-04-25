/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import terreno.Terreno;

/**
 *
 * @author Smart
 */
public class ejecutor {
    public static void main(String[] args) {
        Terreno ct = new Terreno();

        ct.establecerAncho(10);
        ct.establecerLargo(12);
        ct.establecerValorMetro(340);
        ct.establecerArea();
        ct.establecerCosto();

        Terreno ct2 = new Terreno();

        ct2.establecerAncho(10);
        ct2.establecerLargo(10);
        ct2.establecerValorMetro(240);
        ct2.establecerArea();
        ct2.establecerCosto();

        System.out.print("\\n DETALLES DEL TERRENO 1 \nAncho del terreno: "
                + ct.obtenerAncho() + "\nLongitud del terreno: " + ct.obtenerLargo()
                + "\nValor por metro cuadrado: " + ct.obtenerValorMetro() + "\nCosto de terreno: " + ct.obtenerCosto());

        System.out.println(" ");
        
        System.out.print("\n DETALLES DEL TERRENO 2 \nAncho del terreno: "
                + ct2.obtenerAncho() + "\nLongitud del terreno: " + ct2.obtenerLargo()
                + "\nValor por metro cuadrado: " + ct2.obtenerValorMetro() + "\nCosto de terreno: " + ct2.obtenerCosto());
    }
}
