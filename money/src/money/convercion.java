
package money;


public class convercion {
    int peso=0, dolar=0, resultado=0;
    
     public convercion(){
    
    }
      public void setDivision(int a, int b){
        peso=a;
        dolar=b;
        this.resultado=peso/dolar;
      }
      
      public void condiciones(){
          if (peso>=1000000) {
              System.out.println("el valor es demasiado grande");
        } else {
        
           System.out.println("esto equivale "+resultado+" dolar ");
              
          }
              
      }
    
}
