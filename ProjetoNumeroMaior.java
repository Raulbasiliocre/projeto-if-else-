/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetonumeromaior;
import java.util.Scanner;
/**
 *
 * @author Raul
 */
public class ProjetoNumeroMaior {

    public static void main(String[] args) {
        Scanner leitor = new  Scanner(System.in);
        System.out.println("escreva o primeiro numero :");
        int n1 = leitor.nextInt();
        
        System.out.println("escreva o segundo numero :");
        int n2 = leitor.nextInt();
        
        System.out.println("escreva o terceiro numero :");
        int n3 = leitor.nextInt();
        
        if (n1 > n2 &&  n1 > n3 )  {
          
        System.out.println("o primeiro numero eh o maior :" +n1);
        
    }else {
            if(n2>n3){
            System.out.println("o segundo numero eh o maior :" +n2); 
       
        }else {
            
           System.out.println("o terceiro numero eh o maior  :" +n3); 
           
            }
            }
               
     
    }
}
