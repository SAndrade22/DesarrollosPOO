/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Cedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula: ");
        String ced=teclado.next();
        int cap;
        int suma=0, resta=0;;
        int aux;
       for(int i=0; i<ced.length()-1; i++){
           cap=Integer.parseInt(ced.charAt(i)+"");
           if(i%2==0){//para posiciones pares
               cap=cap*2;
               if(cap>9){
                   cap=cap-9;
               }
           }
           suma=suma+cap;
       }
       if(suma%10 !=0){
           aux=((suma/10)+1)*10;
           resta=aux-suma;
       }
       int udig=Integer.parseInt(ced.charAt(9)+"");//capturar el ultimo digito en la posicion 9
       if(udig==resta){
           System.out.println("La cedula que voce ingreso es correcta: ");   
       }else{
           System.out.println("La cedula que voce ingreso es incorrecta: ");
       }
    }
    
}
