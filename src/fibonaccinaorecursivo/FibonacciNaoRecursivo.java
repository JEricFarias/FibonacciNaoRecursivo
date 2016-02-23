package fibonaccinaorecursivo;

/**
 *
 * @author Eric Farias
 * @version 1.0
 * 
 */

public class FibonacciNaoRecursivo {

    /**
     * 
     * @param n = indice/posição do elemento Ex.: indice[valor]
     * 0[0],1[1],2[1],3[2],4[3],5[5],6[8],7[13]...
     * @return retorna um inteiro com Valor contido no indice especificado.
     */
    public static int fibonacci(int n){
        // primeiro valor
        int p = 0;
        // segundo valor
        int s = 1;
        //resultado = primeiro valor + segundo valor
        int r = 0;
        
        while(n > 1){
            r = p + s;
            p = s;
            s = r;
            --n;
        }
        
        return r;
    }   
}
