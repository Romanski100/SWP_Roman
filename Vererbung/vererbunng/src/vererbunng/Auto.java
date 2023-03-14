package vererbunng;

public class Auto extends Fahrzeug {
    private int anzahlTueren;

    public Auto(int geschwindigkeit, String farbe, int anzahlTueren) {
        super(geschwindigkeit, farbe);
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }
}