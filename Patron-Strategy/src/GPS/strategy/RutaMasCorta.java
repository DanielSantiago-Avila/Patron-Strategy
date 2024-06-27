package GPS.strategy;

public class RutaMasCorta implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        // Lógica para calcular la ruta más corta
        return "Ruta más corta entre " + puntoA + " y " + puntoB;
    }
}