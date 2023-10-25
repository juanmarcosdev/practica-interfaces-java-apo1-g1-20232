package model;

import model.Ave;

public class Pato extends Ave implements Volador, Nadador {

	private boolean picoAncho;

	public Pato(String especie, boolean picoAncho) {
        super(especie);
        this.picoAncho = picoAncho;
    }

    @Override
    public String volar() {
        return "El pato esta volando";
    }

    @Override
    public String nadar() {
        return "El pato esta nadando";
    }

    @Override
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