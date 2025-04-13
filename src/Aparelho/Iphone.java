package Aparelho;

import AparelhoTelefonico.AparelhoTelefonico;
import Navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    public void ligar() {
        System.out.println("Ligando pelo Iphone ");

    }


    public void atender() {
        System.out.println("Atendendo pelo Iphone");


    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz pelo Iphone  ");


    }

    public void exibirPagina() {
        System.out.println("Exipbindo pagina pelo Iphone  ");


    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba  pelo Iphone  ");


    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo Iphone  ");


    }

    public void tocar() {
        System.out.println("Tocando Musica pelo Iphone ");


    }

    public void pausar() {
        System.out.println("Pausando musica pelo Iphone ");


    }

    public void selecionarMusica() {
        System.out.println("Selecionando Musica pelo Iphone  ");


    }
}
