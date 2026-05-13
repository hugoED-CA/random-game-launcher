import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
       int op;
        int i;
       String jogos;
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
               System.out.println(lista.get(i));
                break;
        }
       
        
    }  while (op != 5);     
        }
    
}
