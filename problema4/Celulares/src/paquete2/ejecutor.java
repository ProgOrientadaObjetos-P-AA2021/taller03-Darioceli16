
package paquete2;

import celulares.Celulares;

public class ejecutor {
    public static void main(String[] args) {
        Celulares c = new Celulares();
        
        c.establecerSistema("Miu");
        c.establecertipoDireccion("10:5J:13:DC:56:42");
        c.establecertipoImei("12453698575254862");
        c.establecertipoPantalla("4.2``");
        c.establecertipoCosto(290.5);
        
        Celulares e = new Celulares();
        
        e.establecerSistema("Android");
        e.establecertipoDireccion("44:6K:32:HJ:10:72");
        e.establecertipoImei("12354568452152852452");
        e.establecertipoPantalla("3.5``");
        e.establecertipoCosto(140.75);
        
        System.out.println("CELULAR N.-1 ");
        System.out.printf("%s - %s - %s - %s - %f\n", c.obtenerSistema(),
                c.obtenerNumeroPantalla(),c.obtenerDireccion(), 
                c.obtenertipoImei(), c.obtenerCosto());
        
        System.out.println(" ");
        System.out.println("CELULAR N.-2");
        System.out.printf("%s - %s - %s - %s - %f\n", e.obtenerSistema(),
                e.obtenerNumeroPantalla(),e.obtenerDireccion(), 
                e.obtenertipoImei(), e.obtenerCosto());
    }
}
