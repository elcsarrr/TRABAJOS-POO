public class Ascensor {

    private int PisoActual;
    private int PisoDestino;

    public Ascensor()
    {
        PisoActual = 0;
        PisoDestino = 0;
        PisoActual = (int)  Math.floor(Math.random()*(-3-7+1)+7);
    }

    public Ascensor(int _num)
    {
        PisoActual = 0;
        PisoDestino = 0;
        PisoActual = _num;
    }

    public void setPisoDestino(int _PisoDestino)
    {
        PisoDestino = _PisoDestino;
    }

    public void LlamarAscensor()
    {
        
        if(PisoDestino<=0){
        System.out.println("------------PISO NO VALIDO----------------");
        System.out.println();
        
        }
        if(PisoActual < PisoDestino)
        {
                for(int i = PisoActual; i <= PisoDestino; i++)
                {
                    System.out.println("<ascensor> ======= "+i+" =======");
                }
                System.out.println();
                System.out.println("<ascensor> llego al destino");
                System.out.println();
                System.out.println();
       
        
        
             if(PisoActual > PisoDestino)
              {
                 for(int i = PisoActual; i >= PisoDestino; i--)
                         {
                System.out.println("<ascensor> ======= "+i+" =======");
                         }
                 System.out.println();
                 System.out.println("<ascensor> llego a destino");
                 System.out.println();
                 System.out.println();
                                  }
             
                    if(PisoActual == PisoDestino)
                             {
                    System.out.println();
                    System.out.println("<ascensor> ya se encuentra en el lugar indicado");
                    System.out.println();
                    System.out.println();
                               }
        PisoActual = PisoDestino;
        }
        
        
    }
}