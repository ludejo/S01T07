package n2e1;

public class Telefon {
    private int numero;
    private String fabricant;
    private String model;

    public Telefon(int numero, String fabricant, String model) {
        this.numero = numero;
        this.fabricant = fabricant;
        this.model = model;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
