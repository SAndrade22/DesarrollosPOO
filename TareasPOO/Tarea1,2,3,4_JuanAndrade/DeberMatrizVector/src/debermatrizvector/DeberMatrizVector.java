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
public class DeberMatrizVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int filas;
        int columnas;
        System.out.print("Ingrese las filas: ");
        filas=teclado.nextInt();
        System.out.print("Ingrese las columnas: ");
        columnas=teclado.nextInt();
        int matriz[][]=new int[filas][columnas];
        
        System.out.println("Escriba los digitos para su matriz: ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("matriz["+i+"]["+j+"]: ");
                matriz[i][j]=teclado.nextInt();
                
            } 
        }
        System.out.println("Esta es su matriz: ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        //Codigo para la matriz transpuesta
        int aux;
        for(int i=0;i<matriz.length; i++){
            for(int j=0; j<i; j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        System.out.println("la matriz transpuesta es: ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
