public class TestRunner {

    public static void main(String[] args) {

        RaportorStatus raportor = new RaportorStatus();

        RezultatTest[] teste = {
                new RezultatTest("TC-01", StatusTest.PASSED),
                new RezultatTest("TC-02", StatusTest.BLOCKED),
                new RezultatTest("TC-03", StatusTest.FAILED),
                new RezultatTest("TC-04", StatusTest.PASSED)
        };

        for (RezultatTest rezultat : teste) {
            System.out.println("\nVerific testul: " + rezultat.getTestId());
            raportor.genereazaRaport(rezultat.getStatus());

            boolean stop = verificaTest(rezultat);
            if (stop) {
                System.out.println("Testing stopped due to " + rezultat.getStatus() + " at test " + rezultat.getTestId());
                break;
            }
        }

        System.out.println("\nEnd of test run.");
    }

    private static boolean verificaTest(RezultatTest rezultat) {
        switch (rezultat.getStatus()) {
            case PASSED -> {
                System.out.println("[" + rezultat.getTestId() + "] PASSED → We continue testing");
                return false;
            }
            case FAILED, BLOCKED, SKIPPED -> {
                System.out.println("[" + rezultat.getTestId() + "] " + rezultat.getStatus() + " → We stop testing");
                return true;
            }
            default -> {
                System.out.println("Unknown status for " + rezultat.getTestId());
                return true;
            }
        }
    }
}
