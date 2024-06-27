package GPS.strategy;

public class RutaMasEconomica implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        // Lógica para calcular la ruta más económica
        return "Ruta más económica entre " + puntoA + " y " + puntoB;
    }
}