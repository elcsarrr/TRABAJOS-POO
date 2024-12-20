
package main;


public class operaciones {
    int dato1=0, dato2=0, resultado=0;
    //tipo de dato variable nota:la coma oermite adjuntar variables
    public operaciones(){
        
    }
    //set y get
    // set= asignar
    //get = obtener
    public void setSuma(int a, int b){
        dato1=a; //asignacion
        dato2=b; // el dato 2 obtiene el valor del entero b
        this.resultado=dato1+dato2;
    }
    public void setResta(int a, int b){
        dato1=a; //asignacion
        dato2=b; // el dato 2 obtiene el valor del entero b
        this.resultado=dato1-dato2;
    }
     public void setDivision(int a, int b){
        dato1=a; //asignacion
        dato2=b; // el dato 2 obtiene el valor del entero b
        this.resultado=dato1/dato2;
    }
      public void setMultiplicacion(int a, int b){
        dato1=a; //asignacion
        dato2=b; // el dato 2 obtiene el valor del entero b
        this.resultado=dato1*dato2;
    }
       public void setModulo(int a, int b){
        dato1=a; //asignacion
        dato2=b; // el dato 2 obtiene el valor del entero b
        this.resultado=dato1%dato2;
       
    }
       public void imprimirResultado(){
           System.out.println("El resultado de la operacion es ="+resultado);
    }

    
}
