package Apresentacao;

import Aparelho.Iphone;
import AparelhoTelefonico.DiscadorTelefonico;

public class Apresentacao {
    public static void main(String[] args) {

        Iphone iphone7 = new Iphone();

        iphone7.ligar();
        iphone7.atender();
        iphone7.iniciarCorreioVoz();

        System.out.println("-----------------------------");

        iphone7.selecionarMusica();
        iphone7.tocar();
        iphone7.pausar();

        System.out.println("-----------------------------");

        iphone7.exibirPagina();
        iphone7.adicionarNovaAba();
        iphone7.atualizarPagina();

      //  DiscadorTelefonico diskja = new DiscadorTelefonico(); teste kkk

        //diskja.atender();  teste kkk



    }
}
