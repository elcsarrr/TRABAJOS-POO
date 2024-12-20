
package buscar;

import java.util.Scanner;
public class buscador {
    Scanner leer=new Scanner(System.in);


 private int array_bi[][];

  int f;
 int c;
 
 int array_uni []=new int [6];
 int array_resul_uni []=new int [6];


 public void asignarbi(){


 System.out.println("¿cuantas filas del arreglo bidimencional desea?");
 f=leer.nextInt();
 System.out.println("¿cuantas columnas del arreglo bidimencional desea?");
 c=leer.nextInt();
  array_bi=new int [f][c];
       
   }
   public void llenar_bidimencional(){
       for(int i=0;i<array_bi.length;i++){
       for(int j=0;j<array_bi[0].length;j++){
         System.out.println("digite un numero");
        array_bi[i][j]=leer.nextInt();
       }
     }
   }
   public void imprimir_bidimencional(){
       for(int i=0;i<array_bi.length;i++){
       for(int j=0;j<array_bi[0].length;j++){
           System.out.print("["+array_bi[i][j]+"]");
       }
              System.out.println("");
     }
   }


   public void llenar_unidimencional(){
        
          for(int a=0;a<array_uni.length;a++){
              System.out.println("¿que valores desea buscar?");
              array_uni[a]=leer.nextInt();
          }
           
   }
   
     public void imprimir_unidimencional(){
       for(int i=0;i<array_uni.length;i++){
       
           System.out.print("["+array_uni[i]+"]");
       
              System.out.println("");
     }
   }
     public void buscando(){
          int contador=0;
          for(int a=0;a<array_uni.length;a++){
        for(int i=0;i<array_bi.length;i++){
       for(int j=0;j<array_bi[0].length;j++){
    
          if(array_uni[a]==array_bi[i][j]){
              contador++;

                 }
          
     }
}
              System.out.println("el numero"+" "+array_uni[a]+" "+"se encuentra"+" "+contador+" " +"veces repetido");
              contador=0;
}
}
     }



   

