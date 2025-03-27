/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadeimparesconsecutivosiii1158beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class SomaDeImparesConsecutivosIII1158Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();      
        
        for (int i = 0; i < N; i++) {
             int X = teclado.nextInt();
             int Y = teclado.nextInt();  
             
             int soma = 0;
             int cont = 0;
             
             if (X % 2 ==0) {
                 X++;
             }
             
             while (cont < Y){
                 soma += X;
                 X +=2;
                 cont++;
             }
             System.out.println(soma);
        }
        
    }
    
}
