
package paquete2;

import instituciones.Instituciones;

public class ejecutor {
    public static void main(String[] args) {
        
        Instituciones il = new Instituciones();
        
        il.establecerNombre("La Dolorosa");
        il.establecertipoInstitucion("Fiscomisional");
        il.establecerNumeroAlumnos(1000);
        il.establecerNumeroDocentes(60);
        il.establecerNumeroSedes(1);
        
        System.out.printf("%s - %s - %d - %d - %d\n", il.obtenerNombre(),
                il.obtenertipoInstitucion(),il.obtenerNumeroAlumnos(), 
                il.obtenerNumeroDocentes(), il.obtenerNumeroSedes());
        
    }
}
