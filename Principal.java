package model;

import br.Lampada;

public class Principal {
    public static void main(String[] args) {
        Lampada lamp = new Lampada(false);

        System.out.println("Status da Lampada: " +lamp.isStatus());

    }
}
