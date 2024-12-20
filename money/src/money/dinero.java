 
package money;

import java.util.Scanner;


public class dinero {

   
    public static void main(String[] args) {
       convercion op=new convercion();
        Scanner leer=new Scanner(System.in);
        int lospesos;
        int intentos=0;
        while(intentos<3){
            
        System.out.println("ingrese los pesos");
        lospesos=leer.nextInt();
        if (lospesos >=1000000){
            intentos=intentos+1;
        }
        else{
            
        
        op.setDivision(lospesos,3989);
        op.condiciones();
        intentos=3;
        }
        
    }
    
    }
}
