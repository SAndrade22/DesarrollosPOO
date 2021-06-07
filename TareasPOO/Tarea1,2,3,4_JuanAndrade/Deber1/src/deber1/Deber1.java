/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1;

/**
 *
 * @author Usuario
 */
public class Deber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=20;
        if (edad<2){
            System.out.println("Es un bebe");   
        }else 
            if(edad<12){
                System.out.println("Es un ninho"); 
        }else
                if(edad<18){
                    System.out.println("Es un joven");
                }else
                    if(edad<65){
                        System.out.println("Es un adulto");
                    }else{
                        System.out.println("Es un adulto mayor");
                    }         
    }
}
