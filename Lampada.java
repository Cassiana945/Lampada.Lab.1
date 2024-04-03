package br;

public class Lampada {
    private boolean status;
    private String cor;
    //construtor
    public Lampada(boolean status) {
        this.status = status;
    }
    // metodos get e set

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
