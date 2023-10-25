package model;

public class Ave {
    private String especie;

    public Ave(String especie) {
        this.especie = especie;
    }

    public String emitirSonido() {
        return "El ave emite un sonido";
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}