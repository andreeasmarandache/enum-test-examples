package StatusTest;

class RezultatTest {

    private String testId;
    private StatusTest status; // câmpul enum

    public RezultatTest(String testId, StatusTest status) {
        this.testId = testId;
        this.status = status;
    }

    public StatusTest getStatus() {
        return this.status;
    }

    public String getTestId() {
        return this.testId;
    }
}
