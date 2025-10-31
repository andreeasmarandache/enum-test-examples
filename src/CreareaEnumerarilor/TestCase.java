package CreareaEnumerarilor;

public class TestCase {
    // Câmpuri de instanță
    private final String id; // ID-ul nu poate fi schimbat odată setat
    private String nume;
    private Prioritate prioritate;
    private Status status;

    // Câmp static pentru a număra toate testele create
    private static int totalTesteCreate = 0;

    // ----- CONSTRUCTORI SUPRAÎNCĂRCAȚI -----

    // Constructor 1: Cel mai detaliat
    public TestCase(String id, String nume, Prioritate prioritate) {
        this.id = id;
        this.nume = nume;
        this.prioritate = prioritate;
        this.status = Status.PENDING; // Statusul inițial este mereu PENDING
        totalTesteCreate++; // Incrementăm contorul la fiecare creare
    }

    // Constructor 2: Doar cu ID și nume, prioritatea este default MEDIUM
    public TestCase(String id, String nume) {
        this(id, nume, Prioritate.MEDIUM); // Apelăm primul constructor (chaining)
    }

    // ----- METODE -----

    public void executaTest(boolean aTrecut) {
        this.status = Status.EXECUTING;
        System.out.println("Se execută testul [" + this.id + "]: " + this.nume);

        // Simulăm execuția
        if (aTrecut) {
            this.status = Status.PASSED;
        } else {
            this.status = Status.FAILED;
        }
        System.out.println("Testul a fost finalizat cu statusul: " + this.status);
    }

    public void afiseazaDetalii() {
        System.out.println(
                "Detalii Test Case:" +
                        "\n  - ID: " + this.id +
                        "\n  - Nume: " + this.nume +
                        "\n  - Prioritate: " + this.prioritate +
                        "\n  - Status: " + this.status
        );
    }

    // Metodă statică pentru a accesa contorul
    public static int getTotalTesteCreate() {
        return totalTesteCreate;
    }
}

