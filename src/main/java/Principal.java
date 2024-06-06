
import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.TipoCombustible;
import parcial2.TipoMotocicleta;
import parcial2.Vehiculo;

public class Principal {
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo("Chevrolet", "Spark", 2004);
        vehiculo1.imprimirInformacion();
        
        Motocicleta motocicleta1 = new Motocicleta("AKT", "Marca (no se de motos)", 2012, TipoMotocicleta.TOURING);
        motocicleta1.imprimirInformacion();
        
        Automovil auto1 = new Automovil("Audi", "Elon Musk", 2022, 4 , TipoCombustible.ELECTRICO);
        auto1.imprimirInformacion();
        
        
    }//Cierre main
}//Cierre Principal
