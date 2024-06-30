package com.uml;
import com.uml.services.IPhone;

public class IPhoneApp {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.ligar();

        iPhone.getChrome().exibirPagina();
        iPhone.getSpotify().tocar();

    }
}