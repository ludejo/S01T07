package n1e1;

public class TreballadorOnline extends Treballador {
    private static final double TARIFA_PLANA = 38.5;

    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    @Deprecated
    public void nomComplet() {
        System.out.println(cognom.toUpperCase() + ", " + nom.toUpperCase());
    }

    @Override
    public double calcularSou(int hores) {
        return super.calcularSou(hores) + TARIFA_PLANA;
    }
}
