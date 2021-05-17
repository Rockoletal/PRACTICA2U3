
public class NodoDoble {

    private char dato;
    private NodoDoble sig;
    private NodoDoble ant;
    private int nivel;

    NodoDoble(char dato, int nivel) {
        this.dato = dato;
        this.nivel= nivel;
        sig=null; ant = null;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public NodoDoble(char d) {
        dato = d;
        sig = null;
        ant = null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

}
