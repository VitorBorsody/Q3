 import java.util.Scanner;
 import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe um valor que você almeja procurar:");
        int a = scanner.nextInt();
        int contador=0;
       // Crie uma lista com os elementos: 2, 5, 8, 11, 14, 17, 20
          ArrayList<Integer> Lista = new ArrayList<>();
          Lista.add(2);
          Lista.add(5);
          Lista.add(8);
          Lista.add(11);
          Lista.add(14);
          Lista.add(17);
          Lista.add(20);

        System.out.println("Lista sem o elemento: " + a);

          for(int k:Lista){
              System.out.print(k + " ");

          }
        System.out.println();

          Lista.add(0, a);
          int Last_position=Lista.size()-1;
          if(Lista.contains(a)){
              System.out.println("O elemento " + a + " está na lista");
              System.out.println("O índice deste elemento, é: " + Lista.indexOf(a));
          }
          else {
              System.out.println("O elemento digitado não está na lista");
          }
          // Analisemos se o elemento a digitado está na lista e qual seria o seu índice
        System.out.println("Lista após a inclusão do elemento " + a + " na posição 0");
        for(int i=0; i<Lista.size(); i++){
            System.out.print(Lista.get(i) + " ");


         }
        System.out.println();
        System.out.println("Tamanho da lista: " + Lista.size());
        System.out.println("Última posição: " + Last_position);
        }

    }
