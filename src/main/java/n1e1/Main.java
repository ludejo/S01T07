package n1e1;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Exercici 1
        TreballadorOnline remot1 = new TreballadorOnline("Carla", "Cardona", 22.5);
        TreballadorPresencial presencial1 = new TreballadorPresencial("Ferran", "Fernández", 31.5);
        System.out.println(remot1.calcularSou(150));//3413.5
        System.out.println(presencial1.calcularSou(145));//4663

        // Exercici 2 (annotation al main)
        remot1.nomComplet();
        System.out.println("km per anar/tornar a centre de treball: " + presencial1.calcularKmTransport());
    }
}
