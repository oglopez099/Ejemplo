/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class factorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduce un numero");
        numero = scan.nextInt();
        
        for(int i = numero - 1; i >= 1; i--){
            numero = numero * i;
        }
        System.out.println(numero);
    }
}
