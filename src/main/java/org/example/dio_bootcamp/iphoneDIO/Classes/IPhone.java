package Classes;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private Player playerMusica;
    private Telefone telefone;
    private Navegador navegador;

    public IPhone() {
        playerMusica = new Player();
        telefone = new Telefone();
        navegador = new Navegador();
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocarMusica(String nomeMusica) {
        playerMusica.tocarMusica(nomeMusica);
    }

    @Override
    public void pausarMusica() {
        playerMusica.pausarMusica();
    }

    @Override
    public void retomarMusica() {
        playerMusica.retomarMusica();
    }

    @Override
    public void pararMusica() {
        playerMusica.pararMusica();
    }

    @Override
    public void aumentarVolume() {
        playerMusica.aumentarVolume();
    }

    @Override
    public void diminuirVolume() {
        playerMusica.diminuirVolume();
    }

    @Override
    public void pularMusicaParaFrente() {
        playerMusica.pularMusicaParaFrente();
    }

    @Override
    public void pularMusicaParaTras() {
        playerMusica.pularMusicaParaTras();
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligarPara(String numero) {
        telefone.ligarPara(numero);
    }

    @Override
    public void atenderChamada() {
        telefone.atenderChamada();
    }

    @Override
    public void finalizarChamada() {
        telefone.finalizarChamada();
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        telefone.enviarMensagem(numero, mensagem);
    }

    @Override
    public void verificarCaixaPostal() {
        telefone.verificarCaixaPostal();
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void acessarSite(String url) {
        navegador.acessarSite(url);
    }

    @Override
    public void voltarPagina() {
        navegador.voltarPagina();
    }

    @Override
    public void avancarPagina() {
        navegador.avancarPagina();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    @Override
    public void pesquisarNaWeb(String termo) {
        navegador.pesquisarNaWeb(termo);
    }

}

