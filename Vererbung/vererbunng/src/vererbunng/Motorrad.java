package vererbunng;

public class Motorrad extends Fahrzeug {
    private boolean hatBeiwagen;

    public Motorrad(int geschwindigkeit, String farbe, boolean hatBeiwagen) {
        super(geschwindigkeit, farbe);
        this.hatBeiwagen = hatBeiwagen;
    }

    public boolean getHatBeiwagen() {
        return hatBeiwagen;
    }
}