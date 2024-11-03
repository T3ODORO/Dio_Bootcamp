package Classes;

import Interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    private String numeroTelefone;

    @Override
    public void ligarPara(String numero) {
        // Implementação para ligar para um número
    }

    @Override
    public void atenderChamada() {
        // Implementação para atender uma chamada
    }

    @Override
    public void finalizarChamada() {
        // Implementação para finalizar uma chamada
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        // Implementação para enviar uma mensagem
    }

    @Override
    public void verificarCaixaPostal() {
        // Implementação para verificar a caixa postal
    }
}

