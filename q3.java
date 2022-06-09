import java.util.Scanner;
import java.util.Stack;

public class q3 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>(); 
        Scanner scan = new Scanner(System.in);

        System.out.println("informe uma palavra para verificar se é um palíndromo");
        String palavra = scan.nextLine();

        if(palavra.length() % 2 == 0){
            int x = (palavra.length()/2);
            for(int i = 0; i < x; i++){
                pilha.push(palavra.substring(i, i+1));
            }
            for(int i = x; i < palavra.length(); i++){
                if(pilha.peek().equals(palavra.substring(i,i+1))){
                    pilha.pop();
                }
            }
        }else{
            int x = (Integer) (palavra.length()/2);
            for(int i = 0; i < x - 1; i++){
                pilha.push(palavra.substring(i, i+1));
            }
            for(int i = x + 1; i < palavra.length(); i++){
                if(pilha.peek().equals(palavra.substring(i,i+1))){
                    pilha.pop();
                }
            }
        }

        if(pilha.empty()){
            System.out.println("A palavra é um palíndromo");
        }else{
            System.out.println("A palavra não é um palíndromo");
        }

        scan.close();

    }
}
