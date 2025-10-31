package NivelPrioritate;

// Un enum poate avea câmpuri, constructor și metode, la fel ca o clasă!
public enum Prioritate {
    LOW(1),
    MEDIUM(2),
    HIGH(5),
    CRITICAL(10);

    private final int cod; // Câmp privat și final

    // Constructorul unui enum este întotdeauna privat!
    Prioritate(int cod) {
        this.cod = cod;
    }

    // Metodă publică pentru a accesa câmpul privat
    public int getCod() {
        return this.cod;
    }
}

