package Classes;

import Interfaces.ReprodutorMusical;

public class Player implements ReprodutorMusical {

    private Musica musicaAtual;

    @Override
    public void tocarMusica(String nomeMusica) {
        // Implementação para tocar a música
    }

    @Override
    public void pausarMusica() {
        // Implementação para pausar a música
    }

    @Override
    public void retomarMusica() {
        // Implementação para retomar a música
    }

    @Override
    public void pararMusica() {
        // Implementação para parar a música
    }

    @Override
    public void aumentarVolume() {
        // Implementação para aumentar o volume
    }

    @Override
    public void diminuirVolume() {
        // Implementação para diminuir o volume
    }

    @Override
    public void pularMusicaParaFrente() {
        // Implementação para pular a música para frente
    }

    @Override
    public void pularMusicaParaTras() {
        // Implementação para pular a música para trás
    }
}

