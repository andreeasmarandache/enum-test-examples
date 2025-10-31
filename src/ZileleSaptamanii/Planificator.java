package ZileleSaptamanii;

public class Planificator {

    public static void verificaTipZi (ZiSaptamanii ziSaptamanii) {
        switch (ziSaptamanii) {
            case LUNI:
            case MARTI:
            case MIERCURI:
            case JOI:
            case VINERI:
                System.out.println(ziSaptamanii + ": Este zi de lucru.");
                break;

            case SAMBATA:
            case DUMINICA:
                System.out.println(ziSaptamanii + ": Este zi de weekend.");
                break;

        }

    }

    public static void main(String[] args) {
        verificaTipZi(ZiSaptamanii.LUNI);
        verificaTipZi(ZiSaptamanii.DUMINICA);
    }


}
