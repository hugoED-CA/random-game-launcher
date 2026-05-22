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
        Msgs.menu();
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
               }else {
                   int s;
               int rand = ale.nextInt(lista.size());
                System.out.println("=======Randomizador=======");
                do {
               System.out.println("O jogo aleatório foi: " + lista.get(rand));
               
               System.out.println("1- Randomizar novamente");
               System.out.println("2- Sair do randomizador");
               s = scanner.nextInt();
                }
                while (s !=2);
               break;
               }
           case 4:
               int conf;
                int rmv;
                for(i = 0; i < lista.size(); i++)
               System.out.println(i+1 + "-" + lista.get(i));
                System.out.println("\n\n");
               System.out.println("Digite a posição do jogo que deseja remover");
               rmv = scanner.nextInt();
               if(rmv < 0 || rmv > lista.size()){
                   System.out.println("Posição inválida, a lista tem " + lista.size() +" jogos");
        }else{
                   System.out.println("Tem certeza que deseja remover o jogo " + rmv + " da lista?\n"
                           + "1-Sim\n"
                           + "2-Não\n");
                   conf = scanner.nextInt();
                   if(conf == 1){
                       System.out.println("O jogo "+ rmv + " foi removido");
                   }else if(conf == 2){
                       System.out.println("Cancelando...");
                       break;
                   }
                   
                   
                   lista.remove(rmv-1);
                   break;
               }
               
        }
        
    }  while (op != 5);     
        }
    
}
