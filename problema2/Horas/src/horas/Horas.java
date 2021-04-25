
package horas;

public class Horas {

    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    
    public void establecerHora(int n) {
        horas = n;
    }

    public void establecerMin() {
        minutos = horas * 60;
    }

    public void establecerSeg() {
        segundos = horas * 3600;
    }

    public void establecerDia() {
        dias = horas / 24;
    }

    public int obtenerHora() {
        return horas;
    }

    public int obtenerMin() {
        return minutos;
    }

    public int obtenerSeg() {
        return segundos;
    }
    public int obtenerDia(){
        return dias;
    }
    
}
