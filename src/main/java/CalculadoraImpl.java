
import java.rmi.RemoteException;

/**
 * Objeto com a implementação dos métodos remotos.
 *
 * @author osmar
 */
public class CalculadoraImpl implements Calculadora {

    @Override
    public int soma(int a, int b) throws RemoteException{
        System.out.println("A = " + a + "+  B = " + b);
        return a + b;
    }

    @Override
    public int diferenca(int a, int b) throws RemoteException {
        System.out.println("A = " + a + " - B = " + b);
        return a - b;
    }

    @Override
    public int produto(int a, int b) throws RemoteException{
        System.out.println("A = " + a + " * B = " + b);
        return a * b;
    }

    @Override
    public double quociente(int a, int b) throws RemoteException{
        System.out.println("A = " + a + " / B = " + b);
        return a / b;
    }
}
