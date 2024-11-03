package Classes;

import Interfaces.NavegadorInternet;

public class Navegador implements NavegadorInternet {

    private String urlAtual;

    @Override
    public void acessarSite(String url) {
        // Implementação para acessar um site
    }

    @Override
    public void voltarPagina() {
        // Implementação para voltar a página anterior
    }

    @Override
    public void avancarPagina() {
        // Implementação para avançar para a próxima página
    }

    @Override
    public void atualizarPagina() {
        // Implementação para atualizar a página atual
    }

    @Override
    public void pesquisarNaWeb(String termo) {
        // Implementação para realizar uma pesquisa na web
    }
}

