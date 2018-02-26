
/**
 * Clse Contador con sus correspondientes mutadores y accesores  
 */
public class Contador
{
     
    private int valor;

    /**
     * Constructor de la clase Contador
     */
    public Contador()
    {
        valor = 0;
    }

    /**
     * Obtener la cantidad del contador
     */
    public int getContador()
    {
         return valor;
    }

    /**
     *  Aumenta el contador
     */
    public void decrementar()
    {
        valor --;
    }

    /**
     *  Disminuye el contador
     */
    public void incrementar()
    {
        valor ++;
    }

    /**
     *  Imprimir contador
     */
    public void printContador()
    {
        System.out.println("Contador total: " + valor);
    }

    /**
     *  Resetea el contador
     */
    public void reset()
    {
        valor = 0;
    }


}
