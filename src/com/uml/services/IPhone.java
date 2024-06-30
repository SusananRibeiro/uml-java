package com.uml.services;

public class IPhone implements IAparelhoTelefonico {
    private Chrome chrome = new Chrome();
    private Spotify spotify = new Spotify();

    public Chrome getChrome() {
        return chrome;
    }

    public Spotify getSpotify() {
        return spotify;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o IPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação no IPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz no IPhone");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciar o IPhone");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar IPhone");
    }


}
