import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class q1{
    
    public static void main(String[] args) {
    
        List<Integer> numeros = new ArrayList<Integer> ();     
        Stack<Integer> pilha = new Stack<>();   
        Scanner scan = new Scanner(System.in);

        for(int x = 0; x < 9;x++){
            System.out.println("Informe um número: ");
            numeros.add(scan.nextInt());
        }
        
        for(int x = 0; x < numeros.size(); x++){
            if(numeros.get(x) % 2 == 0){
                pilha.push(numeros.get(x));
            } else{
                if(pilha.empty()){
                    System.out.println("Pilha vazia");
                }else{
                    pilha.pop();
                }
            }
        }

        if(!pilha.empty()){
            int y = pilha.size();
            for(int x = 0; x < y; x++){
                System.out.println(pilha.pop()); 
            }
        }

        scan.close();
    }

}