package GPS.strategy;

public class RutaMasRapida implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        // Lógica para calcular la ruta más rápida
        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}