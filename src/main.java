import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class main {
    public static void main(String[] args) {
       int op;
        int i;
       
       String jogos;
       Random ale = new Random();
       ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);
        do {
        System.out.println("====================Bem vindo ao Randomizador====================");
        System.out.println("1- Adicionar jogo na lista");
        System.out.println("2- Mostrar os jogos da lista");
        System.out.println("3- Escolher jogo aleatório");
        System.out.println("4- Remover jogo da lista");
        System.out.println("5- Encerrar programa");
        System.out.println("=================================================================");
        System.out.println("Escolha uma das opções acima");
        op = scanner.nextInt();
        scanner.nextLine();
       if (op < 1 || op > 5){
            System.out.println("Opção inválida, escolha de 1 a 5");
        } 

        switch (op) {
            case 1: 
                do{
                System.out.println("=========Adicionar jogos=========");
                System.out.println("Digite o jogo que deseja adicionar na lista: ");
                jogos = scanner.nextLine();
                lista.add(jogos);
                    System.out.println("Deseja adicionar mais um jogo?");
                    System.out.println("1- Sim");
                    System.out.println("2- Não(sair)");
                    i = scanner.nextInt();
                    scanner.nextLine();
                    
           } while(i != 2);
                 break;
           case 2:
               for(i = 0; i < lista.size(); i++)
               System.out.println(i+1 + "-" + lista.get(i));
                break;
                
           case 3: 
               if(lista.isEmpty()){
                   System.out.println("A lista está vazia, adicione os jogos primeiro");
                   break;
               }else{
               //for(rand = 0; rand < lista.size(); ) 
               int rand = ale.nextInt(lista.size());
                System.out.println("=======Randomizador=======");
               System.out.println("O jogo aleatório foi: " + lista.get(rand));
               
               System.out.println("1- Randomizar jogos da lista");
               System.out.println("2- Sair do randomizador");
               break;
               }
           case 4:
                int rmv;
               System.out.println("Digite a posição do jogo que deseja remover");
               rmv = scanner.nextInt();
               if(rmv < 0 || rmv > lista.size()){
                   System.out.println("Posição inválida, a lista tem " + lista.size() +" jogos");
        }else{
                   lista.remove(rmv-1);
               }
               
        }
        
    }  while (op != 5);     
        }
    
}
