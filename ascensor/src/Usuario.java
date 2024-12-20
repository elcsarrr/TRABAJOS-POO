import java.util.Scanner;

public class Usuario {

    public void Inicio()
    {
        Scanner sc = new Scanner(System.in);
        
        Piso objPiso = new Piso();
        Ascensor objAscensor = new Ascensor();

        int op = 1;

        while(op == 1)
        {
            System.out.print(" Ingrese en que piso esta kiliam = ");
            objPiso.setPiso(sc.nextInt());
            System.out.println();
            
            System.out.println("Desea llamar ascensor?");
            System.out.println("1. Si");
            System.out.println("2. salir?");
            
            op =  sc.nextInt();
            System.out.println();

            switch(op)
            {
                case 1:
                System.out.println(" El usuario kiliam esta en = " + objPiso.getPiso());
                System.out.println(" Llamando el ascensor");
                System.out.println();
                
                objAscensor.setPisoDestino(objPiso.getPiso());
                objAscensor.LlamarAscensor();
                break;

               

                default: 
                    System.out.println("GRACIAS POR USAR EL PROGRAMA ");
                    System.out.println();
                   op = 1;
            }

        }
    }
}