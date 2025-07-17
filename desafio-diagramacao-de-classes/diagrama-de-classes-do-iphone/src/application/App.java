package application;

import controller.IphoneController;

public class App {
    public static void main(String[] args) {
        IphoneController iphoneController = new IphoneController();
        System.out.println("TESTE DE VIDEO");
        iphoneController.selecionarVideo("John Wick Parabellum");
        iphoneController.reproduzir();
        iphoneController.pausarVideo();
        System.out.println("=========================================");
        System.out.println("TESTE DE MUSICA");
        iphoneController.selecionarMusica("Linkin Park - From the Inside");
        iphoneController.tocar();
        iphoneController.pausarMusica();
        System.out.println("=========================================");
        System.out.println("TESTE TELEFONE");
        iphoneController.ligar("(81)99999-9999");
        iphoneController.atender();
        iphoneController.iniciarCorreioDeVoz();
        System.out.println("=========================================");
        System.out.println("CALENDÁRIO");
        iphoneController.acessarCalendario();
        System.out.println("=========================================");
        System.out.println("NAVEGADOR DE INTERNET");
        iphoneController.acessarEmail();
        iphoneController.enviarEmail("Hello, World");
        iphoneController.acessarMaps();
        iphoneController.acessarSafari("www.google.com.br");
        iphoneController.abrirNovaAba();
        iphoneController.fecharAba();
        System.out.println("=========================================");
        System.out.println("FOTOS");
        iphoneController.acessarFotos();
    }
}
