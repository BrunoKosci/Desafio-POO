 package Interligação;

 import Aparelho.AparelhoTelefonico;
 import Aparelho.Musica;
 import Aparelho.Navegador;
import java.util.Scanner;

 public class EquipamentoMultifuncional implements AparelhoTelefonico,Musica,Navegador {
    // Método usado para realizar as funcionalidades simples do aparellho ao efetuar ligação.  
    public void LigarAparelho(){
         System.out.println("Realizando chamada!");
     }
     public void atender(){
         System.out.println("Atendendo ligação");
     }
     public void iniciarCorreioVoz(){
         System.out.println("Sua chamada foi enviado para caixa de mensagem");
     }


    // Método usado para Playlist, sendo possivel inserir a música desejada.  
       
     public void tocar (){
        System.out.println("Tocando playlist");
     }
     public void pausar(){
        System.out.println("Música pausada");
     }

     public void selecionarMusica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua música:");
        String nome = scanner.nextLine();
        System.out.println("Tocando: " + nome);
     }


     //Método usado para navegação na internet. 
     public void exibirPagina(){
        System.out.println("Bem vindo a nossa página");
     }
     public void adicionarNovaAba(){
        System.out.println("Clique no ícone '+' para adcionar uma nova aba.");
     }
     public void atualizarPagina(){
        System.out.println("Carregando página");
     }
 }