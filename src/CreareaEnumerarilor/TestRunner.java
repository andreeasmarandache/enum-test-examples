package CreareaEnumerarilor;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Inițial, avem " + TestCase.getTotalTesteCreate() + " teste create.\n");

        // Creăm teste folosind diverși constructori
        TestCase testLogin = new TestCase("TC-01", "Verificare login cu user valid");
        TestCase testCheckout = new TestCase("TC-02", "Finalizare comandă", Prioritate.CRITICAL);
        TestCase testInterfata = new TestCase("TC-03", "Verificare elemente UI pe homepage", Prioritate.LOW);

        // Afișăm starea inițială
        testLogin.afiseazaDetalii();
        System.out.println("---");

        // Executăm testele
        testLogin.executaTest(true); // Simulăm un test care trece
        System.out.println("---");
        testCheckout.executaTest(false); // Simulăm un test care pică
        System.out.println("---");

        // Afișăm starea finală
        System.out.println("\nStarea finală a testelor:");
        testLogin.afiseazaDetalii();
        testCheckout.afiseazaDetalii();
        testInterfata.afiseazaDetalii(); // Acest test a rămas PENDING

        // Afișăm totalul folosind metoda statică
        System.out.println("\nÎn total au fost create " + TestCase.getTotalTesteCreate() + " cazuri de test.");
    }

}
