
package edad;


public class resta {
    
     int nacimiento=0, actualidad=0, resultado=0;

    public resta(){
    
    }
        
    public void setResta(int a, int b){
        nacimiento=b;
        actualidad=a;
        this.resultado=nacimiento-actualidad;
         
    }
    
    public void imprimirResultado(){
           System.out.println("tu tienes esta edad ="+resultado);
     }

    
}
