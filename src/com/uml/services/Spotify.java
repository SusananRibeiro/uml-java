package com.uml.services;

public class Spotify implements IReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");

    }

    @Override
    public void selecionarMusica() {

        System.out.println("Escolhendo música");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada");
    }
}
