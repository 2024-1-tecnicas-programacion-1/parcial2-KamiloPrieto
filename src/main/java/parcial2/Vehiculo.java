package parcial2;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }//Cierre Constructor

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    //Complejidad temporal O(1) Constante
    public String imprimirInformacion(){
        return marca + " " + modelo + " " + año;
    }//Cierre imprimir informacion
    
}//Cierre class Vehiculo
