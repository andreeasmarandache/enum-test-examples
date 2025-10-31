public class RaportorStatus {
    public void genereazaRaport(StatusTest status) {
        String mesaj;

        // Nu este nevoie să scriem StatusTest.PASSED în case-uri.
        // Compilatorul știe tipul din variabila 'status'.
        switch (status) {
            case PASSED:
                mesaj = "Testul a trecut cu succes. Felicitări!";
                break;
            case FAILED:
                mesaj = "ALERTA: Testul a picat. Necesită investigație!";
                break;
            case SKIPPED:
                mesaj = "Atenție: Testul a fost sărit.";
                break;
            case BLOCKED:
                mesaj = "EROARE: Testul este blocat de o problemă de mediu.";
                break;
            default: // Bună practică, deși teoretic nu ar trebui să ajungem aici
                mesaj = "Status necunoscut.";
                break;
        }
        System.out.println(mesaj);
    }
}

