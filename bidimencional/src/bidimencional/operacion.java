
package bidimencional;
import java.util.Scanner;


public class operacion {
    
 int f;
 int c;
  Scanner leer=new Scanner(System.in);
   
  private int array_bi[][];
     
    public void asignarbi(){


 System.out.println("¿cuantas filas del arreglo bidimencional desea?");
 f=leer.nextInt();
 System.out.println("¿cuantas columnas del arreglo bidimencional desea?");
 c=leer.nextInt();
  array_bi=new int [f][c];
       
   }
 
    public void llegararreglo(){
        for(int fil=0; fil<array_bi.length;fil++){
            for(int col=0; col<array_bi.length;col++){
                System.out.println("Digite un numero");
                array_bi[fil][col]=leer.nextInt();
            }
        }
    }
    public void mostrar_arreglo(){
           for(int i=0; i<array_bi.length;i++){
            for(int j=0; j<array_bi.length;j++){
                 System.out.print("["+array_bi[i][j]+"]");
            }
               System.out.println(" ");
        }
    }
    public void suma_de_todos_los_elementos(){
        int suma=0;
        for(int f=0; f<2;f++){
            for(int c=0;c< 2;c++){
                suma=suma+array_bi[f][c];
            }
        }
        System.out.println("la suma es = "+suma);
    }
    public void resta_de_todos_los_elementos(){
        int resta=0;
        for(int f=0; f<2;f++){
            for(int c=0;c< 2;c++){
                resta=resta-array_bi[f][c];
            }
        }
        System.out.println("la resta es = "+resta);
    }
    public void multiplicacion_de_todos_los_elementos(){
        int multiplicacion=1;
        for(int f=0; f<2;f++){
            for(int c=0;c< 2;c++){
                multiplicacion=multiplicacion*array_bi[f][c];
            }
        }
        System.out.println("la multiplicacion es = "+multiplicacion);
    }
}