package n1e1;

public class TreballadorPresencial extends Treballador {

    private static final double BENZINA = 95.5;

    public TreballadorPresencial(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    @Deprecated
    public double calcularKmTransport() {
        return BENZINA / 10 * 5;
    }

    @Override
    public double calcularSou(int hores) {
        return super.calcularSou(hores) + BENZINA;
    }
}
