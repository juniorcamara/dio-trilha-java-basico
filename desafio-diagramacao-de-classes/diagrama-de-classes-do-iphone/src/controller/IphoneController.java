package controller;

import interfaces.ICalendario;
import interfaces.IFotos;
import interfaces.INavegadorInternet;
import interfaces.IReprodutorMusical;
import interfaces.ITelefone;
import interfaces.IVideoPlayer;

public class IphoneController
        implements ICalendario, IFotos, INavegadorInternet, IReprodutorMusical, 
        ITelefone, IVideoPlayer {

        int volume;

        @Override
        public void reproduzir() {
        System.out.println("Reproduzindo vídeo");
        }

        @Override
        public void pausarVideo() {
            System.out.println("Video pausado");
        }

        @Override
        public void selecionarVideo(String video) {
        System.out.println("Reproduzindo o vídeo " + video);
        }

        @Override
        public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
        }

        @Override
        public void atender() {
        System.out.println("Ligação atendida");
        }

        @Override
        public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado");
        }

        @Override
        public void tocar() {
        System.out.println("Tocando música");
        }

        @Override
        public void pausarMusica() {
        System.out.println("Música pausada");
        }

        @Override
        public void selecionarMusica(String musica) {
        System.out.println("A musica " + musica + " foi selecionada");
        }

        @Override
        public void acessarEmail() {
        System.out.println("Email acessado");
        }

        @Override
        public void enviarEmail(String email) {
        System.out.println("Texto do Email: " + email);
        }

        @Override
        public void acessarMaps() {
        System.out.println("Maps acessado");
        }

        @Override
        public void acessarSafari(String url) {
        System.out.println("Abrindo o Safari");
        }

        @Override
        public void abrirNovaAba() {
        System.out.println("Nova aba aberta");
        }

        @Override
        public void fecharAba() {
        System.out.println("Aba fechada");
        }

        @Override
        public void acessarFotos() {
        System.out.println("Abrindo o app de fotos");
        }

        @Override
        public void acessarCalendario() {
            System.out.println("Abrindo o calendário");
        }
            
        void aumentarVolume(int vol){
            this.volume+=vol;
            System.out.println("Aumentando volume " + this.volume);
        }

        void diminuirVolume(int vol){
            this.volume-=vol;
            System.out.println("Diminuindo volume " + this.volume);
        }

}
