/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debermatrizvector;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Vector {
     public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         int tamanho;
         System.out.print("Ingrese el tamanho del vector: ");
         tamanho=teclado.nextInt();
         int vector[]=new int[tamanho];//declaro el vector
         System.out.println("Ingrese los digitos: "+tamanho);
         for(int i=0; i<tamanho;i++){
             vector[i]=teclado.nextInt();
         }
         int aux=0;
         for(int j=0; j<tamanho; j++){
             for(int i=0; i<tamanho-1; i++){
                 if(vector[i]<vector[i+1]){
                     aux=vector[i];
                     vector[i]=vector[i+1];
                     vector[i+1]=aux;
                 }
             }
         }
         int k=0;
         System.out.println("Aqui estan los numeros ordenados de menos a mayor: ");
         while(k<tamanho){
             System.out.println(vector[k]);
             k++;
         }
     }
}
