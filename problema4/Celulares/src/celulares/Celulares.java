
package celulares;

public class Celulares {

     
    private String Sistema;
    private String Imei;
    private String Pantalla;
    private double Costo;
    private String Direccion;
    
    public void establecerSistema(String n){
        Sistema = n;
    }
    public void establecertipoImei(String n){
        Imei = n;
    }
    public void establecertipoPantalla(String n){
        Pantalla= n;
    }
    public void establecertipoCosto(double n){
        Costo = n;
    }
    public void establecertipoDireccion(String n){
        Direccion = n;
    }
    
    public String obtenerSistema(){
        return Sistema;
    }
    public String obtenertipoImei(){
        return Imei;
    }
    
    public String obtenerNumeroPantalla(){
        return Pantalla;
    }
    public double obtenerCosto(){
        return Costo;
    }
    public String obtenerDireccion(){
        return Direccion;
    }
    
}
