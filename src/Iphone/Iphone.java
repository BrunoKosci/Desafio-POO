package Iphone;

import Aparelho.AparelhoTelefonico;
import Aparelho.Musica;
import Aparelho.Navegador;
import Interligação.EquipamentoMultifuncional;

public class Iphone  {
    
    public static void main(String[] args) {
        System.out.println("###########################################");

        System.out.println("################ CONTATOS ################");
        AparelhoTelefonico ligAparelhoTelefonico = new EquipamentoMultifuncional();
        AparelhoTelefonico Atendendoligacao = new EquipamentoMultifuncional();
        AparelhoTelefonico CaixaPostal = new EquipamentoMultifuncional();

        ligAparelhoTelefonico.LigarAparelho();
        Atendendoligacao.atender();
        CaixaPostal.iniciarCorreioVoz();
        System.out.println("###########################################");

        System.out.println("################ PLAYLIST ################");
        Musica escolherMusica = new EquipamentoMultifuncional();
        Musica play = new EquipamentoMultifuncional();
        Musica pause = new EquipamentoMultifuncional();

        play.tocar();
        pause.pausar();
        escolherMusica.selecionarMusica();
        System.out.println("###########################################");

        System.out.println("################ INTERNET ################");
        Navegador exibir = new EquipamentoMultifuncional();
        Navegador adicionar = new EquipamentoMultifuncional();
        Navegador atualizar = new EquipamentoMultifuncional();

        exibir.exibirPagina();
        adicionar.adicionarNovaAba();
        atualizar.atualizarPagina();
        System.out.println("###########################################");
    }
}
    
