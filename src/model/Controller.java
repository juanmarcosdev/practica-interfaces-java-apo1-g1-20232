package model;

import model.Pato;


public class Controller {

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    public Controller() {
        
    }

    public Pato crearUnPato() {
        return new Pato("Anatidae", true);
    }

    public Ave crearUnAve() {
        return new Ave("Raphus cucullatus");
    }

    public String hacerVolarAPato(Pato p) {
        return p.volar();
    }

    public String hacerNadarAPato(Pato p) {
        return p.nadar();
    }

    public String emitirSonidoAve(Ave a) {
        return a.emitirSonido();
    }





}
