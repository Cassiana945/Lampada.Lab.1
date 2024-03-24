package model;

import br.Lampada;

public class Principal {
    public static void main(String[] args) {
        Lampada lamp = new Lampada(true);
        boolean status = lamp.isStatus();

        System.out.println(status);


    }
}
