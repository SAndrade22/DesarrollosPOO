/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serienumeros;

/**
 *
 * @author Usuario
 */
public class SerieNumeros2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int fin=4;
        int num1=0;
        int num2=1;
        int num3=1;
        int i = 0;
        while(i<=fin){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.println(num3);
            i++;
        }
        System.out.println("");   
    }
}
