package Interfaces;

public interface AparelhoTelefonico {

    void ligarPara(String numero);

    void atenderChamada();

    void finalizarChamada();

    void enviarMensagem(String numero, String mensagem);

    void verificarCaixaPostal();
}