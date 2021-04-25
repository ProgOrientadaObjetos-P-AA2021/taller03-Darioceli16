/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terreno;

/**
 *
 * @author Smart
 */
public class Terreno {

    private int costo, ancho, largo, area, valorMetroCuadrado;

    public void establecerCosto() {
        costo = area * valorMetroCuadrado;
    }

    public void establecerAncho(int n) {
        ancho = n;
    }

    public void establecerLargo(int n) {
        largo = n;
    }

    public void establecerArea() {
        area = ancho * largo;
    }

    public void establecerValorMetro(int n) {
        valorMetroCuadrado = n;
    }

    public int obtenerCosto() {
        return costo;
    }

    public int obtenerAncho() {
        return ancho;
    }

    public int obtenerLargo() {
        return largo;
    }
    public int obtenerArea(){
        return area;
    }
    public int obtenerValorMetro(){
        return valorMetroCuadrado;
    }
    
}
