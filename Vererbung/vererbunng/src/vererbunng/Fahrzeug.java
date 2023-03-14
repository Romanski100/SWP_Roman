package vererbunng;

public class Fahrzeug {

	
	    private int geschwindigkeit;
	    private String farbe;

	    public Fahrzeug(int geschwindigkeit, String farbe) {
	        this.geschwindigkeit = geschwindigkeit;
	        this.farbe = farbe;
	    }

	   

		public void beschleunigen(int x) {
	        geschwindigkeit += x;
	    }

	    public int getGeschwindigkeit() {
	        return geschwindigkeit;
	    }

	    public String getFarbe() {
	        return farbe;
	    }
	}


