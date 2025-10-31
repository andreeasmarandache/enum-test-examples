package NivelPrioritate;

public class TestPrioritati {
    public static void main(String[] args) {
        System.out.println("Niveluri de prioritate și codurile lor:");

        // Iterăm prin toate constantele enum-ului
        for (Prioritate p : Prioritate.values()) {
            System.out.println("- Prioritatea " + p.name() + " are codul numeric " + p.getCod());
        }
    }
}

