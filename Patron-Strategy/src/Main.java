import GPS.NavegadorGPS;
import GPS.strategy.RutaMasCorta;
import GPS.strategy.RutaMasEconomica;
import GPS.strategy.RutaMasRapida;

public class Main {
    public static void main(String[] args) {
        // Estrategia
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");

        // Cambiar a otra estrategia
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");

        // Añadir más ejemplos con diferentes estrategias
        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");
    }
}
