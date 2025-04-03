/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeroordem;
import java.util.Scanner;

public class NumeroOrdem {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         System.out.println("escreva o primeiro numero :");
        int n1 = leitor.nextInt();
        
        System.out.println("escreva o segundo numero :");
        int n2 = leitor.nextInt();
        
        System.out.println("escreva o terceiro numero :");
        int n3 = leitor.nextInt();
        
        if (n1 > n2 &&  n1 > n3 && n2 > n3)  {
          
        System.out.println( "a ordem eh :"+n1+ ","+n2+","+n3 );
        
    }else {
            if(n2>n1 && n2>n3 && n1 >n3){
            System.out.println("a ordem eh :"+n2+ ","+n1+","+n3 ); 
       
        }else {
            if(n2>n3 && n3>n1){
           System.out.println("a ordem eh :"+n2+ ","+n3+","+n1); 
            
            }else { 
                if (n3>n2 && n3>n1 ){
                System.out.println("a ordem eh :"+n3+ ","+n2+","+n1); 
                 
            }else { 
                    if (n1>n3 && n3>n2 && n1>n2) {
                   System.out.println("a ordem eh :"+n1+ ","+n3+","+n2);      
                    }
                }
            }
            }  
            }
      
    }
}
