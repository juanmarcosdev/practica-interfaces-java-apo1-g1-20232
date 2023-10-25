package model;

import model.Ave;

public class Pato extends Ave implements Volador, Nadador {

	private boolean picoAncho;

	public Pato(String especie, boolean picoAncho) {
        super(especie); // Constructor de la clase padre
        this.picoAncho = picoAncho;
    }

    @Override // Sobreescritura de método que viene de la interfaz
    public String volar() {
        return "El pato esta volando";
    }

    @Override // Sobreescritura de método que viene de la interfaz
    public String nadar() {
        return "El pato esta nadando";
    }

    @Override // Sobreescritura de método de la clase padre
    public String emitirSonido() {
        return "El pato hace cuack";
    }

    public boolean getPicoAncho() {
    	return picoAncho;
    }

    public void setPicoAncho(boolean picoAncho) {
    	this.picoAncho = picoAncho;
    }
}